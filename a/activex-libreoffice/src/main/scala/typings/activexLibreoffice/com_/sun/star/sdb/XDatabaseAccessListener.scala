package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
@js.native
trait XDatabaseAccessListener extends XEventListener {
  def approveConnectionClosing(event: EventObject): Boolean = js.native
  def connectionChanged(event: EventObject): Unit = js.native
  def connectionClosing(event: EventObject): Unit = js.native
}

object XDatabaseAccessListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveConnectionClosing: EventObject => Boolean,
    connectionChanged: EventObject => Unit,
    connectionClosing: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDatabaseAccessListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveConnectionClosing = js.Any.fromFunction1(approveConnectionClosing), connectionChanged = js.Any.fromFunction1(connectionChanged), connectionClosing = js.Any.fromFunction1(connectionClosing), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDatabaseAccessListener]
  }
  @scala.inline
  implicit class XDatabaseAccessListenerOps[Self <: XDatabaseAccessListener] (val x: Self) extends AnyVal {
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
    def setApproveConnectionClosing(value: EventObject => Boolean): Self = this.set("approveConnectionClosing", js.Any.fromFunction1(value))
    @scala.inline
    def setConnectionChanged(value: EventObject => Unit): Self = this.set("connectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setConnectionClosing(value: EventObject => Unit): Self = this.set("connectionClosing", js.Any.fromFunction1(value))
  }
  
}

