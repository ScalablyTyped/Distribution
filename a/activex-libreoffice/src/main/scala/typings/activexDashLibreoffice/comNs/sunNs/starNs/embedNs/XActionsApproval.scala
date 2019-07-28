package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to request an approval for an action.
  *
  * An implementation of this interface is usually provided to another object to allow this object to request an approval for actions. The list of
  * possible actions must be documented in documentation of the object.
  */
trait XActionsApproval extends XInterface {
  /**
    * requests an approval for the specified action.
    * @param nAction a value specifying the action that should be approved. Could take values from {@link Actions} constants set. The explicit set of the acti
    * @returns returns `TRUE` in case the specified action is approved.
    */
  def approveAction(nAction: Double): Boolean
}

object XActionsApproval {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveAction: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XActionsApproval = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveAction = js.Any.fromFunction1(approveAction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XActionsApproval]
  }
}

