package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window owner is responsible to handle resize/move requests sent by the window. It is also responsible to validate tracking rectangle size.
  */
trait XHatchWindowController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def activated(): scala.Unit
  /**
    * returns the closest valid rectangle to the provided one.
    * @param aRect a new selected position and size of the tracking rectangle
    * @returns the closest valid position and size to the provided one
    */
  def calcAdjustedRectangle(aRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  def deactivated(): scala.Unit
  /**
    * requests window owner to resize/move the window.
    * @param aRect the new requested position and size of the window
    */
  def requestPositioning(aRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): scala.Unit
}

object XHatchWindowController {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    activated: () => scala.Unit,
    calcAdjustedRectangle: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    deactivated: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    requestPositioning: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit
  ): XHatchWindowController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activated = js.Any.fromFunction0(activated), calcAdjustedRectangle = js.Any.fromFunction1(calcAdjustedRectangle), deactivated = js.Any.fromFunction0(deactivated), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestPositioning = js.Any.fromFunction1(requestPositioning))
  
    __obj.asInstanceOf[XHatchWindowController]
  }
}

