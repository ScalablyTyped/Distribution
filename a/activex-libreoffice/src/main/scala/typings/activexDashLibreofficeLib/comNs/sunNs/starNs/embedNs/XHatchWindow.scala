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

