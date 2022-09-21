package typings.antvGLite

import typings.antvGLite.anon.Call
import typings.antvGLite.cssomMod.CSSUnitValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertyopacityMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, number> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, number>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyOpacity", "CSSPropertyOpacity")
  @js.native
  open class CSSPropertyOpacity () extends StObject {
    
    def calculator(name: String, oldParsed: CSSUnitValue, computed: CSSUnitValue): Double = js.native
    
    def mixer(left: Double, right: Double): js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]] = js.native
    
    def parser(args: Any*): Any = js.native
    @JSName("parser")
    var parser_Original: Call = js.native
  }
}
