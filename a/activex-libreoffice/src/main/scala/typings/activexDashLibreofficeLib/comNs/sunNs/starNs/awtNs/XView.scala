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

object XView {
  @scala.inline
  def apply(
    Graphics: XGraphics,
    Size: Size,
    acquire: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    getGraphics: js.Function0[XGraphics],
    getSize: js.Function0[Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setGraphics: js.Function1[XGraphics, scala.Boolean],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Graphics")(Graphics)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("getGraphics")(getGraphics)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setGraphics")(setGraphics)
    __obj.updateDynamic("setZoom")(setZoom)
    __obj.asInstanceOf[XView]
  }
}

