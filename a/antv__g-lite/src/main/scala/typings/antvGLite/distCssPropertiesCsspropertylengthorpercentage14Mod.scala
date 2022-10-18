package typings.antvGLite

import typings.antvGLite.distCssCssomMod.CSSUnitValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssPropertiesCsspropertylengthorpercentage14Mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<[@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue], [number, number, number, number]> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<[@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue], [number, number, number, number]>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyLengthOrPercentage14", "CSSPropertyLengthOrPercentage14")
  @js.native
  open class CSSPropertyLengthOrPercentage14 () extends StObject {
    
    def calculator(
      name: String,
      oldParsed: js.Tuple4[CSSUnitValue, CSSUnitValue, CSSUnitValue, CSSUnitValue],
      computed: js.Tuple4[CSSUnitValue, CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): js.Tuple4[Double, Double, Double, Double] = js.native
    
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
    
    def parser(radius: String): js.Tuple4[CSSUnitValue, CSSUnitValue, CSSUnitValue, CSSUnitValue] = js.native
    def parser(radius: js.Array[Double]): js.Tuple4[CSSUnitValue, CSSUnitValue, CSSUnitValue, CSSUnitValue] = js.native
    def parser(radius: Double): js.Tuple4[CSSUnitValue, CSSUnitValue, CSSUnitValue, CSSUnitValue] = js.native
  }
}
