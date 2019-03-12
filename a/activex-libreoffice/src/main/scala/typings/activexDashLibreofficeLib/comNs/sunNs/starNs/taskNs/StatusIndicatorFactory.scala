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
    acquire: () => scala.Unit,
    createStatusIndicator: () => XStatusIndicator,
    createWithFrame: (activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, scala.Boolean, scala.Boolean) => scala.Unit,
    createWithWindow: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Boolean, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): StatusIndicatorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createStatusIndicator = js.Any.fromFunction0(createStatusIndicator), createWithFrame = js.Any.fromFunction3(createWithFrame), createWithWindow = js.Any.fromFunction3(createWithWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[StatusIndicatorFactory]
  }
}

