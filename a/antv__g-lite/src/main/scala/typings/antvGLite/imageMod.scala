package typings.antvGLite

import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.domInterfacesMod.DisplayObjectConfig
import typings.antvGLite.parserTransformMod.ParsedTransform
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Image", "Image")
  @js.native
  open class Image () extends DisplayObject[ImageStyleProps, ParsedImageStyleProps] {
    def this(hasStyleRest: DisplayObjectConfig[ImageStyleProps]) = this()
  }
  
  trait ImageStyleProps
    extends StObject
       with BaseStyleProps {
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var img: js.UndefOr[String | HTMLImageElement] = js.undefined
    
    var src: js.UndefOr[String | HTMLImageElement] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
  }
  object ImageStyleProps {
    
    inline def apply(): ImageStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageStyleProps]
    }
    
    extension [Self <: ImageStyleProps](x: Self) {
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImg(value: String | HTMLImageElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setSrc(value: String | HTMLImageElement): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ParsedImageStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var img: js.UndefOr[String | HTMLImageElement] = js.undefined
    
    var src: js.UndefOr[String | HTMLImageElement] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: Double
    
    var y: Double
  }
  object ParsedImageStyleProps {
    
    inline def apply(transform: js.Array[ParsedTransform], x: Double, y: Double): ParsedImageStyleProps = {
      val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedImageStyleProps]
    }
    
    extension [Self <: ParsedImageStyleProps](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImg(value: String | HTMLImageElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setSrc(value: String | HTMLImageElement): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
