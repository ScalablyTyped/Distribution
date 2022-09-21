package typings.antvGLite

import typings.antvGLite.cssomMod.CSSUnitValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertylengthorpercentage12Mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<[@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue], [number, number]> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<[@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue], [number, number]>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyLengthOrPercentage12", "CSSPropertyLengthOrPercentage12")
  @js.native
  open class CSSPropertyLengthOrPercentage12 () extends StObject {
    
    def calculator(
      name: String,
      oldParsed: js.Tuple2[CSSUnitValue, CSSUnitValue],
      computed: js.Tuple2[CSSUnitValue, CSSUnitValue]
    ): js.Tuple2[Double, Double] = js.native
    
    def mixer(left: js.Array[Double], right: js.Array[Double]): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
        ]
      ] = js.native
    @JSName("mixer")
    var mixer_Original: js.Function2[
        /* left */ js.Array[Double], 
        /* right */ js.Array[Double], 
        js.UndefOr[
          js.Tuple3[
            js.Array[Double], 
            js.Array[Double], 
            js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
          ]
        ]
      ] = js.native
    
    def parser(radius: String): js.Tuple2[CSSUnitValue, CSSUnitValue] = js.native
    def parser(radius: js.Array[Double]): js.Tuple2[CSSUnitValue, CSSUnitValue] = js.native
    def parser(radius: Double): js.Tuple2[CSSUnitValue, CSSUnitValue] = js.native
  }
}
