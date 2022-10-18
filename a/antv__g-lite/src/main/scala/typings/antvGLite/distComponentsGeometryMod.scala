package typings.antvGLite

import typings.antvGLite.distShapesMod.AABB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsGeometryMod {
  
  trait Geometry extends StObject {
    
    /**
      * excluding all children
      */
    var contentBounds: js.UndefOr[AABB] = js.undefined
    
    /**
      * including extra rendering effects, eg. shadowBlur filters(drop-shadow, blur)
      */
    var renderBounds: js.UndefOr[AABB] = js.undefined
  }
  object Geometry {
    
    inline def apply(): Geometry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Geometry]
    }
    
    extension [Self <: Geometry](x: Self) {
      
      inline def setContentBounds(value: AABB): Self = StObject.set(x, "contentBounds", value.asInstanceOf[js.Any])
      
      inline def setContentBoundsUndefined: Self = StObject.set(x, "contentBounds", js.undefined)
      
      inline def setRenderBounds(value: AABB): Self = StObject.set(x, "renderBounds", value.asInstanceOf[js.Any])
      
      inline def setRenderBoundsUndefined: Self = StObject.set(x, "renderBounds", js.undefined)
    }
  }
}
