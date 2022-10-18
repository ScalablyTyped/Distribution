package typings.antvGLite

import typings.antvGLite.distCssCssomMod.CSSKeywordValue
import typings.antvGLite.distCssParserTransformMod.ParsedTransform
import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssPropertiesCsspropertytransformMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSKeywordValue | std.Array<@antv/g-lite.@antv/g-lite/dist/css/parser/transform.ParsedTransform>, std.Array<@antv/g-lite.@antv/g-lite/dist/css/parser/transform.ParsedTransform>> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSKeywordValue | std.Array<@antv/g-lite.@antv/g-lite/dist/css/parser/transform.ParsedTransform>, std.Array<@antv/g-lite.@antv/g-lite/dist/css/parser/transform.ParsedTransform>>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyTransform", "CSSPropertyTransform")
  @js.native
  open class CSSPropertyTransform () extends StObject {
    
    def calculator(
      name: String,
      oldParsed: js.Array[ParsedTransform],
      parsed: js.Array[ParsedTransform],
      `object`: DisplayObject[Any, Any]
    ): js.Array[ParsedTransform] = js.native
    def calculator(
      name: String,
      oldParsed: js.Array[ParsedTransform],
      parsed: CSSKeywordValue,
      `object`: DisplayObject[Any, Any]
    ): js.Array[ParsedTransform] = js.native
    def calculator(
      name: String,
      oldParsed: CSSKeywordValue,
      parsed: js.Array[ParsedTransform],
      `object`: DisplayObject[Any, Any]
    ): js.Array[ParsedTransform] = js.native
    def calculator(
      name: String,
      oldParsed: CSSKeywordValue,
      parsed: CSSKeywordValue,
      `object`: DisplayObject[Any, Any]
    ): js.Array[ParsedTransform] = js.native
    
    def mixer(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform]): js.Tuple3[
        js.Array[js.Array[Double]], 
        js.Array[js.Array[Double]], 
        js.Function1[/* d */ js.Array[js.Array[Double]], String]
      ] = js.native
    def mixer(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform], target: DisplayObject[Any, Any]): js.Tuple3[
        js.Array[js.Array[Double]], 
        js.Array[js.Array[Double]], 
        js.Function1[/* d */ js.Array[js.Array[Double]], String]
      ] = js.native
    @JSName("mixer")
    var mixer_Original: js.Function3[
        /* left */ js.Array[ParsedTransform], 
        /* right */ js.Array[ParsedTransform], 
        /* target */ (DisplayObject[Any, Any]) | Null, 
        js.Tuple3[
          js.Array[js.Array[Double]], 
          js.Array[js.Array[Double]], 
          js.Function1[/* d */ js.Array[js.Array[Double]], String]
        ]
      ] = js.native
    
    def parser(string: String): js.Array[ParsedTransform] = js.native
    @JSName("parser")
    var parser_Original: js.Function1[/* string */ String, js.Array[ParsedTransform]] = js.native
    
    def postProcessor(`object`: DisplayObject[Any, Any]): Unit = js.native
    
    /* private */ var tmpMat4: Any = js.native
  }
}
