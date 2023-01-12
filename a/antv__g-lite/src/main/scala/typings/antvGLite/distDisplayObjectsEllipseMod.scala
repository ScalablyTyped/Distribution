package typings.antvGLite

import typings.antvGLite.distCssParserTransformMod.ParsedTransform
import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsEllipseMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Ellipse", "Ellipse")
  @js.native
  open class Ellipse () extends DisplayObject[EllipseStyleProps, ParsedEllipseStyleProps] {
    def this(param0: DisplayObjectConfig[EllipseStyleProps]) = this()
  }
  
  trait EllipseStyleProps
    extends StObject
       with BaseStyleProps {
    
    var cx: js.UndefOr[Double | String] = js.undefined
    
    var cy: js.UndefOr[Double | String] = js.undefined
    
    var rx: Double | String
    
    var ry: Double | String
  }
  object EllipseStyleProps {
    
    inline def apply(rx: Double | String, ry: Double | String): EllipseStyleProps = {
      val __obj = js.Dynamic.literal(rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipseStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EllipseStyleProps] (val x: Self) extends AnyVal {
      
      inline def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedEllipseStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var cx: Double
    
    var cy: Double
    
    var rx: Double
    
    var ry: Double
  }
  object ParsedEllipseStyleProps {
    
    inline def apply(cx: Double, cy: Double, rx: Double, ry: Double, transform: js.Array[ParsedTransform]): ParsedEllipseStyleProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedEllipseStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedEllipseStyleProps] (val x: Self) extends AnyVal {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    }
  }
}
