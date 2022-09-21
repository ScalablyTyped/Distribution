package typings.antvGLite

import typings.antvGLite.anon.AbsolutePath
import typings.antvGLite.anon.Points
import typings.antvGLite.colorMod.Pattern
import typings.antvGLite.cssomMod.CSSGradientValue
import typings.antvGLite.cssomMod.CSSRGB
import typings.antvGLite.cssomMod.CSSStyleValue
import typings.antvGLite.cssomMod.CSSUnitValue
import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.domInterfacesMod.IElement
import typings.antvGLite.filterMod.ParsedFilterStyleProperty
import typings.antvGLite.parserTransformMod.ParsedTransform
import typings.antvUtil.pathTypesMod.CurveArray
import typings.antvUtil.pathTypesMod.PathArray
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@antv/g-lite/dist/css/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clampedMergeNumbers(min: Double, max: Double): js.Function2[
    /* left */ Double, 
    /* right */ Double, 
    js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampedMergeNumbers")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* left */ Double, 
    /* right */ Double, 
    js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]]
  ]]
  
  inline def composeMatrix(translate: Any, scale: Any, skew: Any, quat: Any, perspective: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeMatrix")(translate.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], skew.asInstanceOf[js.Any], quat.asInstanceOf[js.Any], perspective.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def convertAngleUnit(value: CSSUnitValue): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertAngleUnit")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def convertItemToMatrix(item: ParsedTransform): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertItemToMatrix")(item.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def convertPercentUnit(valueWithUnit: CSSUnitValue, vec3Index: Double, target: DisplayObject[Any, Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPercentUnit")(valueWithUnit.asInstanceOf[js.Any], vec3Index.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isPattern(`object`: Any): /* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean]
  
  inline def mergeColors(left: js.Array[CSSGradientValue], right: js.Array[CSSGradientValue]): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: js.Array[CSSGradientValue], right: Pattern): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: js.Array[CSSGradientValue], right: CSSRGB): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: Pattern, right: js.Array[CSSGradientValue]): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: Pattern, right: Pattern): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: Pattern, right: CSSRGB): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: CSSRGB, right: js.Array[CSSGradientValue]): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: CSSRGB, right: Pattern): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: CSSRGB, right: CSSRGB): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  
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
  
  inline def mergeNumberLists(left: js.Array[Double], right: js.Array[Double]): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNumberLists")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
    ]
  ]]
  
  inline def mergeNumbers(left: Double, right: Double): js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNumbers")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]]]
  
  inline def mergePaths(left: AbsolutePath, right: AbsolutePath, `object`: IElement[Any, Any]): js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergePaths")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]]]
  
  inline def mergeTransforms(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform]): js.Tuple3[
    js.Array[js.Array[Double]], 
    js.Array[js.Array[Double]], 
    js.Function1[/* d */ js.Array[js.Array[Double]], String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransforms")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.Array[js.Array[Double]], 
    js.Array[js.Array[Double]], 
    js.Function1[/* d */ js.Array[js.Array[Double]], String]
  ]]
  inline def mergeTransforms(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform], target: DisplayObject[Any, Any]): js.Tuple3[
    js.Array[js.Array[Double]], 
    js.Array[js.Array[Double]], 
    js.Function1[/* d */ js.Array[js.Array[Double]], String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransforms")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.Array[js.Array[Double]], 
    js.Array[js.Array[Double]], 
    js.Function1[/* d */ js.Array[js.Array[Double]], String]
  ]]
  
  inline def numberToString(x: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToString")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object parseAngle {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseAngle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseAngle.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object parseColor {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseColor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseColor.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  inline def parseDimension(unitRegExp: js.RegExp, string: String): js.UndefOr[CSSStyleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDimension")(unitRegExp.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CSSStyleValue]]
  
  inline def parseDimensionArray(string: String): js.Array[CSSUnitValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDimensionArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSUnitValue]]
  inline def parseDimensionArray(string: js.Array[String | Double]): js.Array[CSSUnitValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDimensionArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSUnitValue]]
  
  inline def parseFilter(): js.Array[ParsedFilterStyleProperty] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")().asInstanceOf[js.Array[ParsedFilterStyleProperty]]
  inline def parseFilter(filterStr: String): js.Array[ParsedFilterStyleProperty] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")(filterStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedFilterStyleProperty]]
  
  object parseLength {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseLength")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseLength.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object parseLengthOrPercentage {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseLengthOrPercentage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseLengthOrPercentage.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object parseNumber {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseNumber.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object parseNumberList {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseNumberList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseNumberList.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  inline def parseParam(css: String): CSSStyleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parseParam")(css.asInstanceOf[js.Any]).asInstanceOf[CSSStyleValue]
  
  inline def parsePath(path: String, `object`: DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]
  inline def parsePath(path: PathArray, `object`: DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]
  
  inline def parsePoints(pointsOrStr: String, `object`: typings.antvGLite.mod.DisplayObject[Any, Any]): Points = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePoints")(pointsOrStr.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Points]
  inline def parsePoints(
    pointsOrStr: js.Array[js.Tuple2[Double, Double]],
    `object`: typings.antvGLite.mod.DisplayObject[Any, Any]
  ): Points = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePoints")(pointsOrStr.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Points]
  
  inline def parseTransform(string: String): js.Array[ParsedTransform] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransform")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedTransform]]
  
  object parseTransformOrigin {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseTransformOrigin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser", "parseTransformOrigin.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object parserPercentage {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser", "parserPercentage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser", "parserPercentage.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
}
