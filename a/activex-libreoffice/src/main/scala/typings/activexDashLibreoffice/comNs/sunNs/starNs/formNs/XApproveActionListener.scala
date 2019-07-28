package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * can be implemented to listen and probably veto actions to be performed on components.
  *
  * An example for an action would be the click of a CommandButton.
  * @see XApproveActionBroadcaster
  * @see com.sun.star.form.component.CommandButton
  * @see com.sun.star.form.control.CommandButton
  */
trait XApproveActionListener extends XEventListener {
  /**
    * is invoked when an action is performed.
    * @param aEvent A descriptor specifying the source of the event.
    * @returns `TRUE` when the action is permitted, otherwise `FALSE` .
    */
  def approveAction(aEvent: EventObject): Boolean
}

object XApproveActionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveAction: EventObject => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XApproveActionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveAction = js.Any.fromFunction1(approveAction), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XApproveActionListener]
  }
}

