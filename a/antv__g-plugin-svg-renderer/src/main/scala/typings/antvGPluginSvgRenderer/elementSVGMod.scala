package typings.antvGPluginSvgRenderer

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementSVGMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/components/ElementSVG", "ElementSVG")
  @js.native
  open class ElementSVG () extends StObject {
    
    /**
      * basic element, eg. <circle>|<ellipse>
      */
    @JSName("$el")
    var $el: SVGElement | Null = js.native
    
    /**
      * group wrapper for basic element, eg. <group><circle /></group>.
      * if current element is <group>, same as `$el`
      */
    @JSName("$groupEl")
    var $groupEl: SVGElement | Null = js.native
    
    /**
      * hitArea:
      * $groupEl -> $el
      *          -> $hitTestingEl
      */
    @JSName("$hitTestingEl")
    var $hitTestingEl: SVGElement | Null = js.native
  }
  /* static members */
  object ElementSVG {
    
    @JSImport("@antv/g-plugin-svg-renderer/dist/components/ElementSVG", "ElementSVG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-svg-renderer/dist/components/ElementSVG", "ElementSVG.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
