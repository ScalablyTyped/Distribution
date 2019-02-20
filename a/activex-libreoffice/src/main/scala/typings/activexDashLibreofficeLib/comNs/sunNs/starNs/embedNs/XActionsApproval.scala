package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to request an approval for an action.
  *
  * An implementation of this interface is usually provided to another object to allow this object to request an approval for actions. The list of
  * possible actions must be documented in documentation of the object.
  */
trait XActionsApproval
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * requests an approval for the specified action.
    * @param nAction a value specifying the action that should be approved. Could take values from {@link Actions} constants set. The explicit set of the acti
    * @returns returns `TRUE` in case the specified action is approved.
    */
  def approveAction(nAction: scala.Double): scala.Boolean
}

