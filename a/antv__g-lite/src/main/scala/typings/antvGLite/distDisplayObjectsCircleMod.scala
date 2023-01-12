package typings.antvGLite

import typings.antvGLite.distCssParserTransformMod.ParsedTransform
import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsCircleMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Circle", "Circle")
  @js.native
  open class Circle () extends DisplayObject[CircleStyleProps, ParsedCircleStyleProps] {
    def this(param0: DisplayObjectConfig[CircleStyleProps]) = this()
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircleStyleProps] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedCircleStyleProps] (val x: Self) extends AnyVal {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
