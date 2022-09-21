package typings.antvGLite

import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.domInterfacesMod.DisplayObjectConfig
import typings.antvGLite.parserTransformMod.ParsedTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Circle", "Circle")
  @js.native
  open class Circle () extends DisplayObject[CircleStyleProps, ParsedCircleStyleProps] {
    def this(hasStyleRest: DisplayObjectConfig[CircleStyleProps]) = this()
  }
  
  trait CircleStyleProps
    extends StObject
       with BaseStyleProps {
    
    var cx: js.UndefOr[Double | String | Null] = js.undefined
    
    var cy: js.UndefOr[Double | String | Null] = js.undefined
    
    var r: Double | String | Null
  }
  object CircleStyleProps {
    
    inline def apply(): CircleStyleProps = {
      val __obj = js.Dynamic.literal(r = null)
      __obj.asInstanceOf[CircleStyleProps]
    }
    
    extension [Self <: CircleStyleProps](x: Self) {
      
      inline def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxNull: Self = StObject.set(x, "cx", null)
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyNull: Self = StObject.set(x, "cy", null)
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRNull: Self = StObject.set(x, "r", null)
    }
  }
  
  trait ParsedCircleStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var cx: Double
    
    var cy: Double
    
    var r: Double
  }
  object ParsedCircleStyleProps {
    
    inline def apply(cx: Double, cy: Double, r: Double, transform: js.Array[ParsedTransform]): ParsedCircleStyleProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedCircleStyleProps]
    }
    
    extension [Self <: ParsedCircleStyleProps](x: Self) {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
