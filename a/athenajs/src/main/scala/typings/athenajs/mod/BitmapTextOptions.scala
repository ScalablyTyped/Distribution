package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitmapTextOptions
  extends StObject
     with DrawableOptions {
  
  var charHeight: Double
  
  var charWidth: Double
  
  var height: js.UndefOr[Double] = js.undefined
  
  var imageId: js.UndefOr[String] = js.undefined
  
  var imageSrc: js.UndefOr[String] = js.undefined
  
  var offsetX: Double
  
  var scrollOffsetX: js.UndefOr[Double] = js.undefined
  
  var scrollOffsetY: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var startY: Double
  
  var text: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object BitmapTextOptions {
  
  inline def apply(charHeight: Double, charWidth: Double, offsetX: Double, startY: Double): BitmapTextOptions = {
    val __obj = js.Dynamic.literal(charHeight = charHeight.asInstanceOf[js.Any], charWidth = charWidth.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitmapTextOptions] (val x: Self) extends AnyVal {
    
    inline def setCharHeight(value: Double): Self = StObject.set(x, "charHeight", value.asInstanceOf[js.Any])
    
    inline def setCharWidth(value: Double): Self = StObject.set(x, "charWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
    
    inline def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetX(value: Double): Self = StObject.set(x, "scrollOffsetX", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetXUndefined: Self = StObject.set(x, "scrollOffsetX", js.undefined)
    
    inline def setScrollOffsetY(value: Double): Self = StObject.set(x, "scrollOffsetY", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetYUndefined: Self = StObject.set(x, "scrollOffsetY", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
