package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a framework for implementing a wizard dialog.
  * @since OOo 3.3
  */
trait Wizard extends XWizard {
  /**
    * creates a wizard with a multiple possible execution paths
    * @param PageIds the IDs of the pages which constitute the execution paths. IDs in each path must be in ascending order.
    * @param Controller the wizard controller.
    */
  def createMultiplePathsWizard(
    PageIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    Controller: XWizardController
  ): scala.Unit
  /**
    * creates a wizard with a single execution path
    * @param PageIds the IDs of the pages which constitute the execution path. IDs must be in ascending order.
    * @param Controller the wizard controller.
    */
  def createSinglePathWizard(
    PageIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    Controller: XWizardController
  ): scala.Unit
}

