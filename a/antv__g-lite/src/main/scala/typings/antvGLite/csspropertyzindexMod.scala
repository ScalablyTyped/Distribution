package typings.antvGLite

import typings.antvGLite.anon.Call
import typings.antvGLite.cssomMod.CSSUnitValue
import typings.antvGLite.displayObjectsMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertyzindexMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, number> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, number>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyZIndex", "CSSPropertyZIndex")
  @js.native
  open class CSSPropertyZIndex () extends StObject {
    
    def calculator(name: String, oldParsed: CSSUnitValue, computed: CSSUnitValue, `object`: DisplayObject[Any, Any]): Double = js.native
    
    def parser(args: Any*): Any = js.native
    @JSName("parser")
    var parser_Original: Call = js.native
    
    def postProcessor(`object`: DisplayObject[Any, Any]): Unit = js.native
  }
}
