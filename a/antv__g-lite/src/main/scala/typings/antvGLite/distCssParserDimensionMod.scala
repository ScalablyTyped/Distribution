package typings.antvGLite

import typings.antvGLite.distCssCssomMod.CSSStyleValue
import typings.antvGLite.distCssCssomMod.CSSUnitValue
import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import typings.antvGLite.distDomInterfacesMod.IElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssParserDimensionMod {
  
  @JSImport("@antv/g-lite/dist/css/parser/dimension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertAngleUnit(value: CSSUnitValue): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertAngleUnit")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def convertPercentUnit(valueWithUnit: CSSUnitValue, vec3Index: Double, target: DisplayObject[Any, Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPercentUnit")(valueWithUnit.asInstanceOf[js.Any], vec3Index.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mergeDimensions(left: CSSUnitValue, right: CSSUnitValue, target: IElement[Any, Any]): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
  inline def mergeDimensions(left: CSSUnitValue, right: CSSUnitValue, target: IElement[Any, Any], nonNegative: Boolean): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
  inline def mergeDimensions(
    left: CSSUnitValue,
    right: CSSUnitValue,
    target: IElement[Any, Any],
    nonNegative: Boolean,
    index: Double
  ): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
  inline def mergeDimensions(
    left: CSSUnitValue,
    right: CSSUnitValue,
    target: IElement[Any, Any],
    nonNegative: Unit,
    index: Double
  ): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
  
  object parseAngle {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser/dimension", "parseAngle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser/dimension", "parseAngle.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  inline def parseDimension(unitRegExp: js.RegExp, string: String): js.UndefOr[CSSStyleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDimension")(unitRegExp.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CSSStyleValue]]
  
  inline def parseDimensionArray(string: String): js.Array[CSSUnitValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDimensionArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSUnitValue]]
  inline def parseDimensionArray(string: js.Array[String | Double]): js.Array[CSSUnitValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDimensionArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSUnitValue]]
  
  object parseLength {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser/dimension", "parseLength")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser/dimension", "parseLength.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object parseLengthOrPercentage {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser/dimension", "parseLengthOrPercentage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser/dimension", "parseLengthOrPercentage.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object parserPercentage {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser/dimension", "parserPercentage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser/dimension", "parserPercentage.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
}
