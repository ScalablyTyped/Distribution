package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs.XCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Create preview bitmaps for single slides. */
trait SlideRenderer extends XSlideRenderer {
  /** Create a new {@link SlideRenderer} object. */
  def create(): Unit
}

object SlideRenderer {
  @scala.inline
  def apply(
    calculatePreviewSize: (Double, Size) => Size,
    create: () => Unit,
    createPreview: (XDrawPage, Size, Double) => XBitmap,
    createPreviewForCanvas: (XDrawPage, Size, Double, XCanvas) => typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs.XBitmap
  ): SlideRenderer = {
    val __obj = js.Dynamic.literal(calculatePreviewSize = js.Any.fromFunction2(calculatePreviewSize), create = js.Any.fromFunction0(create), createPreview = js.Any.fromFunction3(createPreview), createPreviewForCanvas = js.Any.fromFunction4(createPreviewForCanvas))
  
    __obj.asInstanceOf[SlideRenderer]
  }
}

