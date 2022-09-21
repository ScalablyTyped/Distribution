package typings.antvGLite

import typings.antvGLite.anon.Call
import typings.antvGLite.cssInterfacesMod.StyleValueRegistry
import typings.antvGLite.cssomMod.CSSUnitValue
import typings.antvGLite.displayObjectsMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertylengthorpercentageMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, number> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, number>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyLengthOrPercentage", "CSSPropertyLengthOrPercentage")
  @js.native
  open class CSSPropertyLengthOrPercentage () extends StObject {
    
    /**
      * according to parent's bounds
      *
      * @example
      * CSS.percent(50) -> CSS.px(0.5 * parent.width)
      */
    def calculator(
      name: String,
      oldParsed: CSSUnitValue,
      computed: CSSUnitValue,
      `object`: DisplayObject[Any, Any],
      registry: StyleValueRegistry
    ): Double = js.native
    
    def mixer(left: Double, right: Double): js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]] = js.native
    @JSName("mixer")
    var mixer_Original: js.Function2[
        /* left */ Double, 
        /* right */ Double, 
        js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]]
      ] = js.native
    
    def parser(args: Any*): Any = js.native
    @JSName("parser")
    var parser_Original: Call = js.native
  }
}
