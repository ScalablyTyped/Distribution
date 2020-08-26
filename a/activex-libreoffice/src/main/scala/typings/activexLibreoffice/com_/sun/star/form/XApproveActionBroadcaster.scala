package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to probably veto actions to be performed on components.
  *
  * Usually, a component which supports the {@link XApproveActionBroadcaster} interface implements {@link com.sun.star.awt.XActionListener} as well.
  */
@js.native
trait XApproveActionBroadcaster extends XInterface {
  /**
    * adds the specified listener to receive the {@link XApproveActionListener.approveAction()} event.
    * @param aListener the listener to be added
    */
  def addApproveActionListener(aListener: XApproveActionListener): Unit = js.native
  /**
    * removes the specified listener
    * @param aListener the listener to be removed
    */
  def removeApproveActionListener(aListener: XApproveActionListener): Unit = js.native
}

object XApproveActionBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addApproveActionListener: XApproveActionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeApproveActionListener: XApproveActionListener => Unit
  ): XApproveActionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addApproveActionListener = js.Any.fromFunction1(addApproveActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeApproveActionListener = js.Any.fromFunction1(removeApproveActionListener))
    __obj.asInstanceOf[XApproveActionBroadcaster]
  }
  @scala.inline
  implicit class XApproveActionBroadcasterOps[Self <: XApproveActionBroadcaster] (val x: Self) extends AnyVal {
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
    def setAddApproveActionListener(value: XApproveActionListener => Unit): Self = this.set("addApproveActionListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveApproveActionListener(value: XApproveActionListener => Unit): Self = this.set("removeApproveActionListener", js.Any.fromFunction1(value))
  }
  
}

