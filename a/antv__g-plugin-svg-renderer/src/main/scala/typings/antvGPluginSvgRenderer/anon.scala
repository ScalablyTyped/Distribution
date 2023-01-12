package typings.antvGPluginSvgRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@antv/g-plugin-svg-renderer.@antv/g-plugin-svg-renderer/dist/tokens.SVGRendererPluginOptions> */
  trait PartialSVGRendererPluginO extends StObject {
    
    var outputSVGElementId: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSVGRendererPluginO {
    
    inline def apply(): PartialSVGRendererPluginO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSVGRendererPluginO]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSVGRendererPluginO] (val x: Self) extends AnyVal {
      
      inline def setOutputSVGElementId(value: Boolean): Self = StObject.set(x, "outputSVGElementId", value.asInstanceOf[js.Any])
      
      inline def setOutputSVGElementIdUndefined: Self = StObject.set(x, "outputSVGElementId", js.undefined)
    }
  }
}
