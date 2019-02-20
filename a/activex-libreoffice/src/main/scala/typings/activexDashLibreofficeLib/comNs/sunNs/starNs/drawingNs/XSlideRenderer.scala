package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Create preview bitmaps for single slides. */
trait XSlideRenderer extends js.Object {
  /**
    * Return a size that has the given aspect ratio and shares either the width or the height with the given maximum size.
    * @param nSlideAspectRatio The aspect ratio must not be 0.
    * @param aMaximumPreviewPixelSize The maximum size of the returned preview size.
    */
  def calculatePreviewSize(
    nSlideAspectRatio: scala.Double,
    aMaximumPreviewPixelSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * Create a preview for the given slide that has the same aspect ratio as the page and is as large as possible but not larger than the specified size.
    *
    * The reason for not using the given size directly as preview size and thus possibly changing the aspect ratio is that a) a different aspect ratio is
    * not used often, and b) leaving the adaption of the actual preview size (according to the aspect ratio of the slide) to the slide renderer is more
    * convenient to the caller than having to this himself.
    * @param xSlide The slide for which a preview will be created.
    * @param aMaximumPreviewPixelSize The maximum size of the preview measured in pixels. When the aspect ratios of this size and of the given slide differ, t
    * @param nSuperSampleFactor When larger than the default 1 then internally a larger preview is created which, before it is returned, is scaled down to the
    */
  def createPreview(
    xSlide: XDrawPage,
    aMaximumPreviewPixelSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    nSuperSampleFactor: scala.Double
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap
  /**
    * Exactly the same functionality as {@link createPreview()} , only a different return type: {@link com.sun.star.rendering.XBitmap} instead of {@link
    * com.sun.star.awt.XBitmap} .
    * @param xSlide See description in {@link createPreview} .
    * @param aMaximumPreviewPixelSize See description in {@link createPreview} .
    * @param nSuperSampleFactor See description in {@link createPreview} .
    * @param xCanvas This canvas is used create a canvas specific bitmap.
    * @see createPreview
    */
  def createPreviewForCanvas(
    xSlide: XDrawPage,
    aMaximumPreviewPixelSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    nSuperSampleFactor: scala.Double,
    xCanvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
}

