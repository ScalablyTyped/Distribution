package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window is a kind of window that is adopted to contain an embedded object window to represent the contained window border and to handle
  * resizing/moving in a specific way: after user have selected the new size/placement the hatching window sends request to owner for resizing/moving.
  * Thus the window can not resize/move itself.
  */
trait XHatchWindow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  var HatchBorderSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** sets the object that will control resizing/moving, if the object is not set the window can not be resized/moved. */
  def setController(xController: XHatchWindowController): scala.Unit
}

object XHatchWindow {
  @scala.inline
  def apply(
    HatchBorderSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setController: js.Function1[XHatchWindowController, scala.Unit]
  ): XHatchWindow = {
    val __obj = js.Dynamic.literal(HatchBorderSize = HatchBorderSize, acquire = acquire, addEventListener = addEventListener, dispose = dispose, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setController = setController)
  
    __obj.asInstanceOf[XHatchWindow]
  }
}

