package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to attach an output device to the object.
  *
  * This kind of object is called view-object.
  */
trait XView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  var Graphics: XGraphics
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  val Size: Size
  /**
    * draws the object at the specified position.
    *
    * If the output should be clipped, the caller has to set the clipping region.
    */
  def draw(nX: scala.Double, nY: scala.Double): scala.Unit
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  def getGraphics(): XGraphics
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  def getSize(): Size
  /** sets the output device. */
  def setGraphics(aDevice: XGraphics): scala.Boolean
  /**
    * sets the zoom factor.
    *
    * The zoom factor only affects the content of the view, not the size.
    */
  def setZoom(fZoomX: scala.Double, fZoomY: scala.Double): scala.Unit
}

