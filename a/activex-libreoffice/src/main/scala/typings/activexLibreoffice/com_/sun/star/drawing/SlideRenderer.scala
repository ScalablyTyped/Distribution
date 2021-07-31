package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.rendering.XCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Create preview bitmaps for single slides. */
trait SlideRenderer
  extends StObject
     with XSlideRenderer {
  
  /** Create a new {@link SlideRenderer} object. */
  def create(): Unit
}
object SlideRenderer {
  
  @scala.inline
  def apply(
    calculatePreviewSize: (Double, Size) => Size,
    create: () => Unit,
    createPreview: (XDrawPage, Size, Double) => XBitmap,
    createPreviewForCanvas: (XDrawPage, Size, Double, XCanvas) => typings.activexLibreoffice.com_.sun.star.rendering.XBitmap
  ): SlideRenderer = {
    val __obj = js.Dynamic.literal(calculatePreviewSize = js.Any.fromFunction2(calculatePreviewSize), create = js.Any.fromFunction0(create), createPreview = js.Any.fromFunction3(createPreview), createPreviewForCanvas = js.Any.fromFunction4(createPreviewForCanvas))
    __obj.asInstanceOf[SlideRenderer]
  }
  
  @scala.inline
  implicit class SlideRendererMutableBuilder[Self <: SlideRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
