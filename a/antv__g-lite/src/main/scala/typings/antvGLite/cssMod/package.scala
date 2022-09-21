package typings.antvGLite.cssMod

import typings.antvGLite.anon.AbsolutePath
import typings.antvGLite.anon.Points
import typings.antvGLite.antvGLiteStrings.Percentsign
import typings.antvGLite.antvGLiteStrings._empty
import typings.antvGLite.antvGLiteStrings.angle
import typings.antvGLite.antvGLiteStrings.deg
import typings.antvGLite.antvGLiteStrings.em
import typings.antvGLite.antvGLiteStrings.flex
import typings.antvGLite.antvGLiteStrings.frequency
import typings.antvGLite.antvGLiteStrings.grad
import typings.antvGLite.antvGLiteStrings.length
import typings.antvGLite.antvGLiteStrings.ms
import typings.antvGLite.antvGLiteStrings.percent
import typings.antvGLite.antvGLiteStrings.px
import typings.antvGLite.antvGLiteStrings.rad
import typings.antvGLite.antvGLiteStrings.rem
import typings.antvGLite.antvGLiteStrings.resolution
import typings.antvGLite.antvGLiteStrings.s
import typings.antvGLite.antvGLiteStrings.time
import typings.antvGLite.antvGLiteStrings.turn
import typings.antvGLite.colorMod.Pattern
import typings.antvGLite.cssInterfacesMod.PropertyMetadata
import typings.antvGLite.cssMod.^
import typings.antvGLite.cssnumericvalueMod.BaseType.kAngle
import typings.antvGLite.cssnumericvalueMod.BaseType.kLength
import typings.antvGLite.cssnumericvalueMod.BaseType.kPercent
import typings.antvGLite.cssnumericvalueMod.BaseType.kTime
import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.domInterfacesMod.IElement
import typings.antvGLite.filterMod.ParsedFilterStyleProperty
import typings.antvGLite.parserTransformMod.ParsedTransform
import typings.antvGLite.typesMod.UnitType.kDegrees
import typings.antvGLite.typesMod.UnitType.kNumber
import typings.antvGLite.typesMod.UnitType.kPercentage
import typings.antvGLite.typesMod.UnitType.kPixels
import typings.antvGLite.typesMod.UnitType.kSeconds
import typings.antvGLite.typesMod.UnitType.kUnknown
import typings.antvUtil.pathTypesMod.CurveArray
import typings.antvUtil.pathTypesMod.PathArray
import typings.manaSyringe.mod.Syringe.DefinedToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BUILT_IN_PROPERTIES: js.Array[PropertyMetadata] = ^.asInstanceOf[js.Dynamic].selectDynamic("BUILT_IN_PROPERTIES").asInstanceOf[js.Array[PropertyMetadata]]

inline def CSSProperty: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("CSSProperty").asInstanceOf[DefinedToken]

inline def CSSPropertySyntaxFactory: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("CSSPropertySyntaxFactory").asInstanceOf[DefinedToken]

inline def LayoutRegistry: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("LayoutRegistry").asInstanceOf[DefinedToken]

inline def Odeg: typings.antvGLite.cssnumericvalueMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].selectDynamic("Odeg").asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSUnitValue]

inline def Opx: typings.antvGLite.cssnumericvalueMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].selectDynamic("Opx").asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSUnitValue]

inline def StyleValueRegistry: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("StyleValueRegistry").asInstanceOf[DefinedToken]

inline def baseTypeToString(baseType: typings.antvGLite.cssnumericvalueMod.BaseType): length | angle | time | frequency | resolution | flex | percent | _empty = ^.asInstanceOf[js.Dynamic].applyDynamic("baseTypeToString")(baseType.asInstanceOf[js.Any]).asInstanceOf[length | angle | time | frequency | resolution | flex | percent | _empty]

inline def canonicalUnitTypeForCategory(category: typings.antvGLite.typesMod.UnitCategory): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalUnitTypeForCategory")(category.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]

inline def clampedMergeNumbers(min: Double, max: Double): js.Function2[
/* left */ Double, 
/* right */ Double, 
js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampedMergeNumbers")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
/* left */ Double, 
/* right */ Double, 
js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]]]]

inline def composeMatrix(translate: Any, scale: Any, skew: Any, quat: Any, perspective: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeMatrix")(translate.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], skew.asInstanceOf[js.Any], quat.asInstanceOf[js.Any], perspective.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

inline def conversionToCanonicalUnitsScaleFactor(unit_type: typings.antvGLite.typesMod.UnitType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("conversionToCanonicalUnitsScaleFactor")(unit_type.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def convertAngleUnit(value: typings.antvGLite.cssomMod.CSSUnitValue): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertAngleUnit")(value.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def convertItemToMatrix(item: ParsedTransform): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertItemToMatrix")(item.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]

inline def convertPercentUnit(
  valueWithUnit: typings.antvGLite.cssomMod.CSSUnitValue,
  vec3Index: Double,
  target: DisplayObject[Any, Any]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPercentUnit")(valueWithUnit.asInstanceOf[js.Any], vec3Index.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getOrCreateKeyword(name: String): typings.antvGLite.cssomMod.CSSKeywordValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateKeyword")(name.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.cssomMod.CSSKeywordValue]

inline def inheritKeywordValue: typings.antvGLite.cssomMod.CSSKeywordValue = ^.asInstanceOf[js.Dynamic].selectDynamic("inheritKeywordValue").asInstanceOf[typings.antvGLite.cssomMod.CSSKeywordValue]

inline def initialKeywordValue: typings.antvGLite.cssomMod.CSSKeywordValue = ^.asInstanceOf[js.Dynamic].selectDynamic("initialKeywordValue").asInstanceOf[typings.antvGLite.cssomMod.CSSKeywordValue]

inline def isPattern(`object`: Any): /* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean]

inline def mergeColors(
  left: js.Array[typings.antvGLite.cssomMod.CSSGradientValue],
  right: js.Array[typings.antvGLite.cssomMod.CSSGradientValue]
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: js.Array[typings.antvGLite.cssomMod.CSSGradientValue], right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(
  left: js.Array[typings.antvGLite.cssomMod.CSSGradientValue],
  right: typings.antvGLite.cssomMod.CSSRGB
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: js.Array[typings.antvGLite.cssomMod.CSSGradientValue]): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: typings.antvGLite.cssomMod.CSSRGB): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(
  left: typings.antvGLite.cssomMod.CSSRGB,
  right: js.Array[typings.antvGLite.cssomMod.CSSGradientValue]
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: typings.antvGLite.cssomMod.CSSRGB, right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: typings.antvGLite.cssomMod.CSSRGB, right: typings.antvGLite.cssomMod.CSSRGB): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]

inline def mergeDimensions(
  left: typings.antvGLite.cssomMod.CSSUnitValue,
  right: typings.antvGLite.cssomMod.CSSUnitValue,
  target: IElement[Any, Any]
): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
inline def mergeDimensions(
  left: typings.antvGLite.cssomMod.CSSUnitValue,
  right: typings.antvGLite.cssomMod.CSSUnitValue,
  target: IElement[Any, Any],
  nonNegative: Boolean
): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
inline def mergeDimensions(
  left: typings.antvGLite.cssomMod.CSSUnitValue,
  right: typings.antvGLite.cssomMod.CSSUnitValue,
  target: IElement[Any, Any],
  nonNegative: Boolean,
  index: Double
): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
inline def mergeDimensions(
  left: typings.antvGLite.cssomMod.CSSUnitValue,
  right: typings.antvGLite.cssomMod.CSSUnitValue,
  target: IElement[Any, Any],
  nonNegative: Unit,
  index: Double
): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]

inline def mergeNumberLists(left: js.Array[Double], right: js.Array[Double]): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNumberLists")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
]]]

inline def mergeNumbers(left: Double, right: Double): js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNumbers")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]]]

inline def mergePaths(left: AbsolutePath, right: AbsolutePath, `object`: IElement[Any, Any]): js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergePaths")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]]]

inline def mergeTransforms(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform]): js.Tuple3[
js.Array[js.Array[Double]], 
js.Array[js.Array[Double]], 
js.Function1[/* d */ js.Array[js.Array[Double]], String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransforms")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
js.Array[js.Array[Double]], 
js.Array[js.Array[Double]], 
js.Function1[/* d */ js.Array[js.Array[Double]], String]]]
inline def mergeTransforms(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform], target: DisplayObject[Any, Any]): js.Tuple3[
js.Array[js.Array[Double]], 
js.Array[js.Array[Double]], 
js.Function1[/* d */ js.Array[js.Array[Double]], String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransforms")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
js.Array[js.Array[Double]], 
js.Array[js.Array[Double]], 
js.Function1[/* d */ js.Array[js.Array[Double]], String]]]

inline def noneColor: typings.antvGLite.cssomMod.CSSRGB = ^.asInstanceOf[js.Dynamic].selectDynamic("noneColor").asInstanceOf[typings.antvGLite.cssomMod.CSSRGB]

inline def numberToString(x: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToString")(x.asInstanceOf[js.Any]).asInstanceOf[String]

inline def parseDimension(unitRegExp: js.RegExp, string: String): js.UndefOr[typings.antvGLite.cssomMod.CSSStyleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDimension")(unitRegExp.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.antvGLite.cssomMod.CSSStyleValue]]

inline def parseDimensionArray(string: String): js.Array[typings.antvGLite.cssomMod.CSSUnitValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDimensionArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.antvGLite.cssomMod.CSSUnitValue]]
inline def parseDimensionArray(string: js.Array[String | Double]): js.Array[typings.antvGLite.cssomMod.CSSUnitValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDimensionArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.antvGLite.cssomMod.CSSUnitValue]]

inline def parseFilter(): js.Array[ParsedFilterStyleProperty] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")().asInstanceOf[js.Array[ParsedFilterStyleProperty]]
inline def parseFilter(filterStr: String): js.Array[ParsedFilterStyleProperty] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")(filterStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedFilterStyleProperty]]

inline def parseParam(css: String): typings.antvGLite.cssomMod.CSSStyleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parseParam")(css.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.cssomMod.CSSStyleValue]

inline def parsePath(path: String, `object`: DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]
inline def parsePath(path: PathArray, `object`: DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]

inline def parsePoints(pointsOrStr: String, `object`: typings.antvGLite.mod.DisplayObject[Any, Any]): Points = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePoints")(pointsOrStr.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Points]
inline def parsePoints(
  pointsOrStr: js.Array[js.Tuple2[Double, Double]],
  `object`: typings.antvGLite.mod.DisplayObject[Any, Any]
): Points = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePoints")(pointsOrStr.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Points]

inline def parseTransform(string: String): js.Array[ParsedTransform] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransform")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedTransform]]

inline def propertyMetadataCache: Record[String, PropertyMetadata] = ^.asInstanceOf[js.Dynamic].selectDynamic("propertyMetadataCache").asInstanceOf[Record[String, PropertyMetadata]]

inline def toCanonicalUnit(unit: typings.antvGLite.typesMod.UnitType): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanonicalUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]

inline def transparentColor: typings.antvGLite.cssomMod.CSSRGB = ^.asInstanceOf[js.Dynamic].selectDynamic("transparentColor").asInstanceOf[typings.antvGLite.cssomMod.CSSRGB]

inline def typeCheck(
  values: js.Array[typings.antvGLite.cssnumericvalueMod.CSSNumericValue],
  op: js.Function,
  error: Boolean
): typings.antvGLite.cssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("typeCheck")(values.asInstanceOf[js.Any], op.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSNumericValueType]

inline def unitFromName(name: String): typings.antvGLite.typesMod.UnitType = ^.asInstanceOf[js.Dynamic].applyDynamic("unitFromName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.typesMod.UnitType]

inline def unitTypeToBaseType(unit: typings.antvGLite.typesMod.UnitType): kLength | kAngle | kTime | kPercent = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToBaseType")(unit.asInstanceOf[js.Any]).asInstanceOf[kLength | kAngle | kTime | kPercent]

inline def unitTypeToString(`type`: typings.antvGLite.typesMod.UnitType): em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToString")(`type`.asInstanceOf[js.Any]).asInstanceOf[em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign]

inline def unitTypeToUnitCategory(`type`: typings.antvGLite.typesMod.UnitType): typings.antvGLite.typesMod.UnitCategory = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToUnitCategory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.typesMod.UnitCategory]

inline def unsetKeywordValue: typings.antvGLite.cssomMod.CSSKeywordValue = ^.asInstanceOf[js.Dynamic].selectDynamic("unsetKeywordValue").asInstanceOf[typings.antvGLite.cssomMod.CSSKeywordValue]
