package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait StatusIndicatorFactory extends XStatusIndicatorFactory {
  def createWithFrame(Frame: XFrame, DisableReschedule: Boolean, AllowParentShow: Boolean): Unit
  def createWithWindow(ParentWindow: XWindow, DisableReschedule: Boolean, AllowParentShow: Boolean): Unit
}

object StatusIndicatorFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createStatusIndicator: () => XStatusIndicator,
    createWithFrame: (XFrame, Boolean, Boolean) => Unit,
    createWithWindow: (XWindow, Boolean, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): StatusIndicatorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createStatusIndicator = js.Any.fromFunction0(createStatusIndicator), createWithFrame = js.Any.fromFunction3(createWithFrame), createWithWindow = js.Any.fromFunction3(createWithWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[StatusIndicatorFactory]
  }
}

