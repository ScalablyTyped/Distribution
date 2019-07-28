package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to attach an output device to the object.
  *
  * This kind of object is called view-object.
  */
trait XView extends XInterface {
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  var Graphics: XGraphics
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  val Size: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
  /**
    * draws the object at the specified position.
    *
    * If the output should be clipped, the caller has to set the clipping region.
    */
  def draw(nX: Double, nY: Double): Unit
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  def getGraphics(): XGraphics
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  def getSize(): typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
  /** sets the output device. */
  def setGraphics(aDevice: XGraphics): Boolean
  /**
    * sets the zoom factor.
    *
    * The zoom factor only affects the content of the view, not the size.
    */
  def setZoom(fZoomX: Double, fZoomY: Double): Unit
}

object XView {
  @scala.inline
  def apply(
    Graphics: XGraphics,
    Size: Size,
    acquire: () => Unit,
    draw: (Double, Double) => Unit,
    getGraphics: () => XGraphics,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setGraphics: XGraphics => Boolean,
    setZoom: (Double, Double) => Unit
  ): XView = {
    val __obj = js.Dynamic.literal(Graphics = Graphics, Size = Size, acquire = js.Any.fromFunction0(acquire), draw = js.Any.fromFunction2(draw), getGraphics = js.Any.fromFunction0(getGraphics), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGraphics = js.Any.fromFunction1(setGraphics), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[XView]
  }
}

