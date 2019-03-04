package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait StatusIndicatorFactory extends XStatusIndicatorFactory {
  def createWithFrame(
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    DisableReschedule: scala.Boolean,
    AllowParentShow: scala.Boolean
  ): scala.Unit
  def createWithWindow(
    ParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    DisableReschedule: scala.Boolean,
    AllowParentShow: scala.Boolean
  ): scala.Unit
}

object StatusIndicatorFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createStatusIndicator: js.Function0[XStatusIndicator],
    createWithFrame: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Unit
    ],
    createWithWindow: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): StatusIndicatorFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createStatusIndicator = createStatusIndicator, createWithFrame = createWithFrame, createWithWindow = createWithWindow, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[StatusIndicatorFactory]
  }
}

