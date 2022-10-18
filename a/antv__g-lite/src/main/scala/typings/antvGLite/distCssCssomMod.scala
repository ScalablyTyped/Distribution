package typings.antvGLite

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
import typings.antvGLite.distCssCssomCsscolorvalueMod.CSSColorPercent
import typings.antvGLite.distCssCssomCsscolorvalueMod.CSSColorRGBComp
import typings.antvGLite.distCssCssomCsscolorvalueMod.ColorSpace
import typings.antvGLite.distCssCssomCssgradientvalueMod.GradientType
import typings.antvGLite.distCssCssomCssgradientvalueMod.LinearGradient
import typings.antvGLite.distCssCssomCssgradientvalueMod.RadialGradient
import typings.antvGLite.distCssCssomCssnumericsumvalueMod.CSSNumericSumValue
import typings.antvGLite.distCssCssomCssnumericsumvalueMod.UnitMap
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kAngle
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kLength
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kPercent
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kTime
import typings.antvGLite.distCssCssomTypesMod.UnitCategory
import typings.antvGLite.distCssCssomTypesMod.UnitType
import typings.antvGLite.distCssCssomTypesMod.UnitType.kDegrees
import typings.antvGLite.distCssCssomTypesMod.UnitType.kNumber
import typings.antvGLite.distCssCssomTypesMod.UnitType.kPercentage
import typings.antvGLite.distCssCssomTypesMod.UnitType.kPixels
import typings.antvGLite.distCssCssomTypesMod.UnitType.kSeconds
import typings.antvGLite.distCssCssomTypesMod.UnitType.kUnknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssomMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-lite/dist/css/cssom", "BaseType")
  @js.native
  object BaseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType & Double] = js.native
    
    /* 1 */ val kAngle: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kAngle & Double = js.native
    
    /* 5 */ val kFlex: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kFlex & Double = js.native
    
    /* 3 */ val kFrequency: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kFrequency & Double = js.native
    
    /* 0 */ val kLength: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kLength & Double = js.native
    
    /* 7 */ val kNumBaseTypes: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kNumBaseTypes & Double = js.native
    
    /* 6 */ val kPercent: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kPercent & Double = js.native
    
    /* 4 */ val kResolution: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kResolution & Double = js.native
    
    /* 2 */ val kTime: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kTime & Double = js.native
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSColorValue")
  @js.native
  open class CSSColorValue protected ()
    extends typings.antvGLite.distCssCssomCsscolorvalueMod.CSSColorValue {
    def this(colorSpace: ColorSpace) = this()
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSGradientValue")
  @js.native
  open class CSSGradientValue protected ()
    extends typings.antvGLite.distCssCssomCssgradientvalueMod.CSSGradientValue {
    def this(`type`: GradientType, value: LinearGradient) = this()
    def this(`type`: GradientType, value: RadialGradient) = this()
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSKeywordValue")
  @js.native
  open class CSSKeywordValue protected ()
    extends typings.antvGLite.distCssCssomCsskeywordvalueMod.CSSKeywordValue {
    def this(value: String) = this()
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathInvert")
  @js.native
  open class CSSMathInvert protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathInvert {
    def this(
      value: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue,
      `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathInvert {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathInvert")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(value: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathInvert = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathInvert]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathMax")
  @js.native
  open class CSSMathMax protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMax {
    def this(
      values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathMax {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathMax")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMax = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMax]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathMin")
  @js.native
  open class CSSMathMin protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMin {
    def this(
      values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathMin {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathMin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMin = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMin]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathNegate")
  @js.native
  open class CSSMathNegate protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathNegate {
    def this(
      value: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue,
      `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathNegate {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathNegate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(value: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathNegate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathNegate]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathProduct")
  @js.native
  open class CSSMathProduct protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct {
    def this(
      values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathProduct {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathProduct")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct]
    
    inline def multiplyUnitMaps(a: UnitMap, b: UnitMap): UnitMap = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyUnitMaps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[UnitMap]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathSum")
  @js.native
  open class CSSMathSum protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum {
    def this(
      values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathSum {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathSum")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canCreateNumericTypeFromSumValue(sum: CSSNumericSumValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateNumericTypeFromSumValue")(sum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def create(values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum]
    
    inline def numericTypeFromUnitMap(units: UnitMap): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("numericTypeFromUnitMap")(units.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathValue")
  @js.native
  open class CSSMathValue protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathValue {
    /**
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#296
      */
    def this(type_ : typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathVariadic")
  @js.native
  open class CSSMathVariadic protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathVariadic {
    def this(
      values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSNumericValue")
  @js.native
  open class CSSNumericValue protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue {
    /**
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#296
      */
    def this(type_ : typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType) = this()
  }
  /* static members */
  object CSSNumericValue {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSNumericValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isValidUnit(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSNumericValueType")
  @js.native
  open class CSSNumericValueType ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType {
    def this(unit: UnitType) = this()
    def this(unit: Unit, exponent: Double) = this()
    def this(unit: UnitType, exponent: Double) = this()
  }
  /* static members */
  object CSSNumericValueType {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSNumericValueType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(
      type1: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType,
      type2: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType,
      error: Boolean
    ): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
    
    inline def multiply(
      type1: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType,
      type2: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType,
      error: Boolean
    ): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
    
    inline def negateExponents(`type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("negateExponents")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSRGB")
  @js.native
  open class CSSRGB protected ()
    extends typings.antvGLite.distCssCssomCssrgbMod.CSSRGB {
    def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp) = this()
    def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp, alpha: CSSColorPercent) = this()
    def this(
      r: CSSColorRGBComp,
      g: CSSColorRGBComp,
      b: CSSColorRGBComp,
      alpha: Unit,
      /**
      * 'transparent' & 'none' has the same rgba data
      */
    isNone: Boolean
    ) = this()
    def this(
      r: CSSColorRGBComp,
      g: CSSColorRGBComp,
      b: CSSColorRGBComp,
      alpha: CSSColorPercent,
      /**
      * 'transparent' & 'none' has the same rgba data
      */
    isNone: Boolean
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSStyleValue")
  @js.native
  open class CSSStyleValue ()
    extends typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValue
  /* static members */
  object CSSStyleValue {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSStyleValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAngle(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngle")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isLength(`type`: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRelativeUnit(`type`: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUnit")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isTime(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTime")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSStyleValueType")
  @js.native
  object CSSStyleValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType & Double] = js.native
    
    /* 10 */ val kClampType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kClampType & Double = js.native
    
    /* 14 */ val kColorType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kColorType & Double = js.native
    
    /* 7 */ val kInvertType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kInvertType & Double = js.native
    
    /* 2 */ val kKeywordType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kKeywordType & Double = js.native
    
    /* 9 */ val kMaxType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kMaxType & Double = js.native
    
    /* 8 */ val kMinType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kMinType & Double = js.native
    
    /* 6 */ val kNegateType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kNegateType & Double = js.native
    
    /* 12 */ val kPositionType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kPositionType & Double = js.native
    
    /* 5 */ val kProductType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kProductType & Double = js.native
    
    /* 4 */ val kSumType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kSumType & Double = js.native
    
    /* 11 */ val kTransformType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kTransformType & Double = js.native
    
    /* 13 */ val kURLImageType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kURLImageType & Double = js.native
    
    /* 3 */ val kUnitType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnitType & Double = js.native
    
    /* 0 */ val kUnknownType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnknownType & Double = js.native
    
    /* 1 */ val kUnparsedType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnparsedType & Double = js.native
    
    /* 15 */ val kUnsupportedColorType: typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnsupportedColorType & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSUnitValue")
  @js.native
  open class CSSUnitValue protected ()
    extends typings.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue {
    def this(value: Double) = this()
    def this(value: Double, unitOrName: String) = this()
    def this(value: Double, unitOrName: UnitType) = this()
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "GradientType")
  @js.native
  object GradientType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCssCssomCssgradientvalueMod.GradientType & Double] = js.native
    
    /* 0 */ val Constant: typings.antvGLite.distCssCssomCssgradientvalueMod.GradientType.Constant & Double = js.native
    
    /* 1 */ val LinearGradient: typings.antvGLite.distCssCssomCssgradientvalueMod.GradientType.LinearGradient & Double = js.native
    
    /* 2 */ val RadialGradient: typings.antvGLite.distCssCssomCssgradientvalueMod.GradientType.RadialGradient & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "Nested")
  @js.native
  object Nested extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCssCssomTypesMod.Nested & Double] = js.native
    
    /* 1 */ val kNo: typings.antvGLite.distCssCssomTypesMod.Nested.kNo & Double = js.native
    
    /* 0 */ val kYes: typings.antvGLite.distCssCssomTypesMod.Nested.kYes & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "Odeg")
  @js.native
  val Odeg: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue = js.native
  
  @JSImport("@antv/g-lite/dist/css/cssom", "Opx")
  @js.native
  val Opx: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue = js.native
  
  @JSImport("@antv/g-lite/dist/css/cssom", "ParenLess")
  @js.native
  object ParenLess extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCssCssomTypesMod.ParenLess & Double] = js.native
    
    /* 1 */ val kNo: typings.antvGLite.distCssCssomTypesMod.ParenLess.kNo & Double = js.native
    
    /* 0 */ val kYes: typings.antvGLite.distCssCssomTypesMod.ParenLess.kYes & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "UnitCategory")
  @js.native
  object UnitCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCssCssomTypesMod.UnitCategory & Double] = js.native
    
    /* 3 */ val kUAngle: typings.antvGLite.distCssCssomTypesMod.UnitCategory.kUAngle & Double = js.native
    
    /* 2 */ val kULength: typings.antvGLite.distCssCssomTypesMod.UnitCategory.kULength & Double = js.native
    
    /* 0 */ val kUNumber: typings.antvGLite.distCssCssomTypesMod.UnitCategory.kUNumber & Double = js.native
    
    /* 5 */ val kUOther: typings.antvGLite.distCssCssomTypesMod.UnitCategory.kUOther & Double = js.native
    
    /* 1 */ val kUPercent: typings.antvGLite.distCssCssomTypesMod.UnitCategory.kUPercent & Double = js.native
    
    /* 4 */ val kUTime: typings.antvGLite.distCssCssomTypesMod.UnitCategory.kUTime & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "UnitType")
  @js.native
  object UnitType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCssCssomTypesMod.UnitType & Double] = js.native
    
    /* 6 */ val kDegrees: typings.antvGLite.distCssCssomTypesMod.UnitType.kDegrees & Double = js.native
    
    /* 3 */ val kEms: typings.antvGLite.distCssCssomTypesMod.UnitType.kEms & Double = js.native
    
    /* 8 */ val kGradians: typings.antvGLite.distCssCssomTypesMod.UnitType.kGradians & Double = js.native
    
    /* 12 */ val kInteger: typings.antvGLite.distCssCssomTypesMod.UnitType.kInteger & Double = js.native
    
    /* 10 */ val kMilliseconds: typings.antvGLite.distCssCssomTypesMod.UnitType.kMilliseconds & Double = js.native
    
    /* 1 */ val kNumber: typings.antvGLite.distCssCssomTypesMod.UnitType.kNumber & Double = js.native
    
    /* 2 */ val kPercentage: typings.antvGLite.distCssCssomTypesMod.UnitType.kPercentage & Double = js.native
    
    /* 4 */ val kPixels: typings.antvGLite.distCssCssomTypesMod.UnitType.kPixels & Double = js.native
    
    /* 7 */ val kRadians: typings.antvGLite.distCssCssomTypesMod.UnitType.kRadians & Double = js.native
    
    /* 5 */ val kRems: typings.antvGLite.distCssCssomTypesMod.UnitType.kRems & Double = js.native
    
    /* 11 */ val kSeconds: typings.antvGLite.distCssCssomTypesMod.UnitType.kSeconds & Double = js.native
    
    /* 9 */ val kTurns: typings.antvGLite.distCssCssomTypesMod.UnitType.kTurns & Double = js.native
    
    /* 0 */ val kUnknown: typings.antvGLite.distCssCssomTypesMod.UnitType.kUnknown & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "ValueRange")
  @js.native
  object ValueRange extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distCssCssomTypesMod.ValueRange & Double] = js.native
    
    /* 0 */ val kAll: typings.antvGLite.distCssCssomTypesMod.ValueRange.kAll & Double = js.native
    
    /* 2 */ val kInteger: typings.antvGLite.distCssCssomTypesMod.ValueRange.kInteger & Double = js.native
    
    /* 1 */ val kNonNegative: typings.antvGLite.distCssCssomTypesMod.ValueRange.kNonNegative & Double = js.native
    
    /* 3 */ val kNonNegativeInteger: typings.antvGLite.distCssCssomTypesMod.ValueRange.kNonNegativeInteger & Double = js.native
    
    /* 4 */ val kPositiveInteger: typings.antvGLite.distCssCssomTypesMod.ValueRange.kPositiveInteger & Double = js.native
  }
  
  inline def baseTypeToString(baseType: BaseType): length | angle | time | frequency | resolution | flex | percent | _empty = ^.asInstanceOf[js.Dynamic].applyDynamic("baseTypeToString")(baseType.asInstanceOf[js.Any]).asInstanceOf[length | angle | time | frequency | resolution | flex | percent | _empty]
  
  inline def canonicalUnitTypeForCategory(category: UnitCategory): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalUnitTypeForCategory")(category.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]
  
  inline def conversionToCanonicalUnitsScaleFactor(unit_type: UnitType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("conversionToCanonicalUnitsScaleFactor")(unit_type.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toCanonicalUnit(unit: UnitType): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanonicalUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]
  
  inline def typeCheck(
    values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
    op: js.Function,
    error: Boolean
  ): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("typeCheck")(values.asInstanceOf[js.Any], op.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
  
  inline def unitFromName(name: String): UnitType = ^.asInstanceOf[js.Dynamic].applyDynamic("unitFromName")(name.asInstanceOf[js.Any]).asInstanceOf[UnitType]
  
  inline def unitTypeToBaseType(unit: UnitType): kLength | kAngle | kTime | kPercent = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToBaseType")(unit.asInstanceOf[js.Any]).asInstanceOf[kLength | kAngle | kTime | kPercent]
  
  inline def unitTypeToString(`type`: UnitType): em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToString")(`type`.asInstanceOf[js.Any]).asInstanceOf[em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign]
  
  inline def unitTypeToUnitCategory(`type`: UnitType): UnitCategory = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToUnitCategory")(`type`.asInstanceOf[js.Any]).asInstanceOf[UnitCategory]
}
