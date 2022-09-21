package typings.antvGLite

import typings.antvGLite.anon.Call
import typings.antvGLite.colorMod.Pattern
import typings.antvGLite.cssomMod.CSSGradientValue
import typings.antvGLite.cssomMod.CSSKeywordValue
import typings.antvGLite.cssomMod.CSSRGB
import typings.antvGLite.displayObjectsMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertycolorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSRGB | std.Array<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSGradientValue> | @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern | @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSKeywordValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSRGB | std.Array<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSGradientValue> | @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSRGB | std.Array<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSGradientValue> | @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern | @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSKeywordValue, @antv/g-lite.@antv/g-lite/dist/css/cssom.CSSRGB | std.Array<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSGradientValue> | @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyColor", "CSSPropertyColor")
  @js.native
  open class CSSPropertyColor () extends StObject {
    
    def calculator(
      name: String,
      oldParsed: js.Array[CSSGradientValue],
      parsed: js.Array[CSSGradientValue],
      `object`: DisplayObject[Any, Any]
    ): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(
      name: String,
      oldParsed: js.Array[CSSGradientValue],
      parsed: Pattern,
      `object`: DisplayObject[Any, Any]
    ): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(
      name: String,
      oldParsed: js.Array[CSSGradientValue],
      parsed: CSSKeywordValue,
      `object`: DisplayObject[Any, Any]
    ): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(
      name: String,
      oldParsed: js.Array[CSSGradientValue],
      parsed: CSSRGB,
      `object`: DisplayObject[Any, Any]
    ): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(
      name: String,
      oldParsed: Pattern,
      parsed: js.Array[CSSGradientValue],
      `object`: DisplayObject[Any, Any]
    ): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(name: String, oldParsed: Pattern, parsed: Pattern, `object`: DisplayObject[Any, Any]): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(name: String, oldParsed: Pattern, parsed: CSSKeywordValue, `object`: DisplayObject[Any, Any]): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(name: String, oldParsed: Pattern, parsed: CSSRGB, `object`: DisplayObject[Any, Any]): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(
      name: String,
      oldParsed: CSSKeywordValue,
      parsed: js.Array[CSSGradientValue],
      `object`: DisplayObject[Any, Any]
    ): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(name: String, oldParsed: CSSKeywordValue, parsed: Pattern, `object`: DisplayObject[Any, Any]): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(
      name: String,
      oldParsed: CSSKeywordValue,
      parsed: CSSKeywordValue,
      `object`: DisplayObject[Any, Any]
    ): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(name: String, oldParsed: CSSKeywordValue, parsed: CSSRGB, `object`: DisplayObject[Any, Any]): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(
      name: String,
      oldParsed: CSSRGB,
      parsed: js.Array[CSSGradientValue],
      `object`: DisplayObject[Any, Any]
    ): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(name: String, oldParsed: CSSRGB, parsed: Pattern, `object`: DisplayObject[Any, Any]): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(name: String, oldParsed: CSSRGB, parsed: CSSKeywordValue, `object`: DisplayObject[Any, Any]): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    def calculator(name: String, oldParsed: CSSRGB, parsed: CSSRGB, `object`: DisplayObject[Any, Any]): CSSRGB | Pattern | js.Array[CSSGradientValue] = js.native
    
    def mixer(left: js.Array[CSSGradientValue], right: js.Array[CSSGradientValue]): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    def mixer(left: js.Array[CSSGradientValue], right: Pattern): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    def mixer(left: js.Array[CSSGradientValue], right: CSSRGB): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    def mixer(left: Pattern, right: js.Array[CSSGradientValue]): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    def mixer(left: Pattern, right: Pattern): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    def mixer(left: Pattern, right: CSSRGB): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    def mixer(left: CSSRGB, right: js.Array[CSSGradientValue]): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    def mixer(left: CSSRGB, right: Pattern): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    def mixer(left: CSSRGB, right: CSSRGB): js.UndefOr[
        js.Tuple3[
          js.Array[Double], 
          js.Array[Double], 
          js.Function1[/* color */ js.Array[Double], String]
        ]
      ] = js.native
    @JSName("mixer")
    var mixer_Original: js.Function2[
        /* left */ CSSRGB | js.Array[CSSGradientValue] | Pattern, 
        /* right */ CSSRGB | js.Array[CSSGradientValue] | Pattern, 
        js.UndefOr[
          js.Tuple3[
            js.Array[Double], 
            js.Array[Double], 
            js.Function1[/* color */ js.Array[Double], String]
          ]
        ]
      ] = js.native
    
    def parser(args: Any*): Any = js.native
    @JSName("parser")
    var parser_Original: Call = js.native
  }
}
