package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.rendering.XCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Create preview bitmaps for single slides. */
trait XSlideRenderer extends StObject {
  
  /**
    * Return a size that has the given aspect ratio and shares either the width or the height with the given maximum size.
    * @param nSlideAspectRatio The aspect ratio must not be 0.
    * @param aMaximumPreviewPixelSize The maximum size of the returned preview size.
    */
  def calculatePreviewSize(nSlideAspectRatio: Double, aMaximumPreviewPixelSize: Size): Size
  
  /**
    * Create a preview for the given slide that has the same aspect ratio as the page and is as large as possible but not larger than the specified size.
    *
    * The reason for not using the given size directly as preview size and thus possibly changing the aspect ratio is that a) a different aspect ratio is
    * not used often, and b) leaving the adaption of the actual preview size (according to the aspect ratio of the slide) to the slide renderer is more
    * convenient to the caller than having to this itself.
    * @param xSlide The slide for which a preview will be created.
    * @param aMaximumPreviewPixelSize The maximum size of the preview measured in pixels. When the aspect ratios of this size and of the given slide differ, t
    * @param nSuperSampleFactor When larger than the default 1 then internally a larger preview is created which, before it is returned, is scaled down to the
    */
  def createPreview(xSlide: XDrawPage, aMaximumPreviewPixelSize: Size, nSuperSampleFactor: Double): XBitmap
  
  /**
    * Exactly the same functionality as {@link createPreview()} , only a different return type: {@link com.sun.star.rendering.XBitmap} instead of {@link
    * com.sun.star.awt.XBitmap} .
    * @param xSlide See description in {@link createPreview} .
    * @param aMaximumPreviewPixelSize See description in {@link createPreview} .
    * @param nSuperSampleFactor See description in {@link createPreview} .
    * @param xCanvas This canvas is used create a canvas specific bitmap.
    * @see createPreview
    */
  def createPreviewForCanvas(xSlide: XDrawPage, aMaximumPreviewPixelSize: Size, nSuperSampleFactor: Double, xCanvas: XCanvas): typings.activexLibreoffice.com_.sun.star.rendering.XBitmap
}
object XSlideRenderer {
  
  inline def apply(
    calculatePreviewSize: (Double, Size) => Size,
    createPreview: (XDrawPage, Size, Double) => XBitmap,
    createPreviewForCanvas: (XDrawPage, Size, Double, XCanvas) => typings.activexLibreoffice.com_.sun.star.rendering.XBitmap
  ): XSlideRenderer = {
    val __obj = js.Dynamic.literal(calculatePreviewSize = js.Any.fromFunction2(calculatePreviewSize), createPreview = js.Any.fromFunction3(createPreview), createPreviewForCanvas = js.Any.fromFunction4(createPreviewForCanvas))
    __obj.asInstanceOf[XSlideRenderer]
  }
  
  extension [Self <: XSlideRenderer](x: Self) {
    
    inline def setCalculatePreviewSize(value: (Double, Size) => Size): Self = StObject.set(x, "calculatePreviewSize", js.Any.fromFunction2(value))
    
    inline def setCreatePreview(value: (XDrawPage, Size, Double) => XBitmap): Self = StObject.set(x, "createPreview", js.Any.fromFunction3(value))
    
    inline def setCreatePreviewForCanvas(
      value: (XDrawPage, Size, Double, XCanvas) => typings.activexLibreoffice.com_.sun.star.rendering.XBitmap
    ): Self = StObject.set(x, "createPreviewForCanvas", js.Any.fromFunction4(value))
  }
}
