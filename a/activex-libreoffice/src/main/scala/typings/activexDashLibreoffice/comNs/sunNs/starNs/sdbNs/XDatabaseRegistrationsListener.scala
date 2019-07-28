package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implemented by components which want to be notified of changes in the application-wide registered databases.
  * @see XDatabaseRegistrations
  * @since OOo 3.3
  */
trait XDatabaseRegistrationsListener extends XEventListener {
  /**
    * called when a the location of a registered database changed
    *
    * Note that this talks about registration data only. That is, if the actual file denoted by the database registration is moved, this is in no way
    * monitored or reported. Only (successful) calls to {@link XDatabaseRegistrations.changeDatabaseLocation()} are reported here.
    */
  def changedDatabaseLocation(Event: DatabaseRegistrationEvent): Unit
  /** called when a database has been registered */
  def registeredDatabaseLocation(Event: DatabaseRegistrationEvent): Unit
  /** called when a database registration has been revoked */
  def revokedDatabaseLocation(Event: DatabaseRegistrationEvent): Unit
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
}

