package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implemented by components which want to be notified of changes in the application-wide registered databases.
  * @see XDatabaseRegistrations
  * @since OOo 3.3
  */
@js.native
trait XDatabaseRegistrationsListener extends XEventListener {
  
  /**
    * called when a the location of a registered database changed
    *
    * Note that this talks about registration data only. That is, if the actual file denoted by the database registration is moved, this is in no way
    * monitored or reported. Only (successful) calls to {@link XDatabaseRegistrations.changeDatabaseLocation()} are reported here.
    */
  def changedDatabaseLocation(Event: DatabaseRegistrationEvent): Unit = js.native
  
  /** called when a database has been registered */
  def registeredDatabaseLocation(Event: DatabaseRegistrationEvent): Unit = js.native
  
  /** called when a database registration has been revoked */
  def revokedDatabaseLocation(Event: DatabaseRegistrationEvent): Unit = js.native
}
object XDatabaseRegistrationsListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    changedDatabaseLocation: DatabaseRegistrationEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    registeredDatabaseLocation: DatabaseRegistrationEvent => Unit,
    release: () => Unit,
    revokedDatabaseLocation: DatabaseRegistrationEvent => Unit
  ): XDatabaseRegistrationsListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changedDatabaseLocation = js.Any.fromFunction1(changedDatabaseLocation), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), registeredDatabaseLocation = js.Any.fromFunction1(registeredDatabaseLocation), release = js.Any.fromFunction0(release), revokedDatabaseLocation = js.Any.fromFunction1(revokedDatabaseLocation))
    __obj.asInstanceOf[XDatabaseRegistrationsListener]
  }
  
  @scala.inline
  implicit class XDatabaseRegistrationsListenerOps[Self <: XDatabaseRegistrationsListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangedDatabaseLocation(value: DatabaseRegistrationEvent => Unit): Self = this.set("changedDatabaseLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisteredDatabaseLocation(value: DatabaseRegistrationEvent => Unit): Self = this.set("registeredDatabaseLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRevokedDatabaseLocation(value: DatabaseRegistrationEvent => Unit): Self = this.set("revokedDatabaseLocation", js.Any.fromFunction1(value))
  }
}
