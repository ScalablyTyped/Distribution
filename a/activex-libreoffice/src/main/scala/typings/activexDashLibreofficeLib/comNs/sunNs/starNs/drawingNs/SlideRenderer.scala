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
    calculatePreviewSize: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
    ],
    create: js.Function0[scala.Unit],
    createPreview: js.Function3[
      XDrawPage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap
    ],
    createPreviewForCanvas: js.Function4[
      XDrawPage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
    ]
  ): SlideRenderer = {
    val __obj = js.Dynamic.literal(calculatePreviewSize = calculatePreviewSize, create = create, createPreview = createPreview, createPreviewForCanvas = createPreviewForCanvas)
  
    __obj.asInstanceOf[SlideRenderer]
  }
}

