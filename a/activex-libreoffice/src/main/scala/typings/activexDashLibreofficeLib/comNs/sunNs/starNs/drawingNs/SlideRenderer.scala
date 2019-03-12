package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Create preview bitmaps for single slides. */
trait SlideRenderer extends XSlideRenderer {
  /** Create a new {@link SlideRenderer} object. */
  def create(): scala.Unit
}

object SlideRenderer {
  @scala.inline
  def apply(
    calculatePreviewSize: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size) => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    create: () => scala.Unit,
    createPreview: (XDrawPage, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap,
    createPreviewForCanvas: (XDrawPage, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas) => activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
  ): SlideRenderer = {
    val __obj = js.Dynamic.literal(calculatePreviewSize = js.Any.fromFunction2(calculatePreviewSize), create = js.Any.fromFunction0(create), createPreview = js.Any.fromFunction3(createPreview), createPreviewForCanvas = js.Any.fromFunction4(createPreviewForCanvas))
  
    __obj.asInstanceOf[SlideRenderer]
  }
}

