package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes in an object's internal mode.
  * @see XModeSelector
  * @see XModeChangeListener
  * @see XModeChangeApproveListener
  * @since OOo 1.1.2
  */
@js.native
trait XModeChangeBroadcaster extends XInterface {
  /**
    * adds the given listener to the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def addModeChangeApproveListener(rxListener: XModeChangeApproveListener): Unit = js.native
  /** adds the given listener to the list of components to be notified when the mode changes. */
  def addModeChangeListener(rxListener: XModeChangeListener): Unit = js.native
  /**
    * remove the given listener from the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def removeModeChangeApproveListener(rxListener: XModeChangeApproveListener): Unit = js.native
  /** removes the given listener from the list of components to be notified when the mode changes. */
  def removeModeChangeListener(rxListener: XModeChangeListener): Unit = js.native
}

object XModeChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addModeChangeApproveListener: XModeChangeApproveListener => Unit,
    addModeChangeListener: XModeChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModeChangeApproveListener: XModeChangeApproveListener => Unit,
    removeModeChangeListener: XModeChangeListener => Unit
  ): XModeChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModeChangeApproveListener = js.Any.fromFunction1(addModeChangeApproveListener), addModeChangeListener = js.Any.fromFunction1(addModeChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModeChangeApproveListener = js.Any.fromFunction1(removeModeChangeApproveListener), removeModeChangeListener = js.Any.fromFunction1(removeModeChangeListener))
    __obj.asInstanceOf[XModeChangeBroadcaster]
  }
  @scala.inline
  implicit class XModeChangeBroadcasterOps[Self <: XModeChangeBroadcaster] (val x: Self) extends AnyVal {
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
    def setAddModeChangeApproveListener(value: XModeChangeApproveListener => Unit): Self = this.set("addModeChangeApproveListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddModeChangeListener(value: XModeChangeListener => Unit): Self = this.set("addModeChangeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveModeChangeApproveListener(value: XModeChangeApproveListener => Unit): Self = this.set("removeModeChangeApproveListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveModeChangeListener(value: XModeChangeListener => Unit): Self = this.set("removeModeChangeListener", js.Any.fromFunction1(value))
  }
  
}

