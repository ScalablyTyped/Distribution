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

