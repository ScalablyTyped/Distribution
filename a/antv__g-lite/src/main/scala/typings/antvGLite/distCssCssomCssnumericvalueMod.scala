package typings.antvGLite

import typings.antvGLite.antvGLiteStrings._empty
import typings.antvGLite.antvGLiteStrings.angle
import typings.antvGLite.antvGLiteStrings.flex
import typings.antvGLite.antvGLiteStrings.frequency
import typings.antvGLite.antvGLiteStrings.length
import typings.antvGLite.antvGLiteStrings.percent
import typings.antvGLite.antvGLiteStrings.resolution
import typings.antvGLite.antvGLiteStrings.time
import typings.antvGLite.distCssCssomCssnumericsumvalueMod.CSSNumericSumValue
import typings.antvGLite.distCssCssomCssnumericsumvalueMod.UnitMap
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kAngle
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kLength
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kPercent
import typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kTime
import typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValue
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

object distCssCssomCssnumericvalueMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait BaseType extends StObject
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "BaseType")
  @js.native
  object BaseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BaseType & Double] = js.native
    
    @js.native
    sealed trait kAngle
      extends StObject
         with BaseType
    /* 1 */ val kAngle: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kAngle & Double = js.native
    
    @js.native
    sealed trait kFlex
      extends StObject
         with BaseType
    /* 5 */ val kFlex: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kFlex & Double = js.native
    
    @js.native
    sealed trait kFrequency
      extends StObject
         with BaseType
    /* 3 */ val kFrequency: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kFrequency & Double = js.native
    
    @js.native
    sealed trait kLength
      extends StObject
         with BaseType
    /* 0 */ val kLength: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kLength & Double = js.native
    
    @js.native
    sealed trait kNumBaseTypes
      extends StObject
         with BaseType
    /* 7 */ val kNumBaseTypes: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kNumBaseTypes & Double = js.native
    
    @js.native
    sealed trait kPercent
      extends StObject
         with BaseType
    /* 6 */ val kPercent: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kPercent & Double = js.native
    
    @js.native
    sealed trait kResolution
      extends StObject
         with BaseType
    /* 4 */ val kResolution: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kResolution & Double = js.native
    
    @js.native
    sealed trait kTime
      extends StObject
         with BaseType
    /* 2 */ val kTime: typings.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kTime & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathInvert")
  @js.native
  open class CSSMathInvert protected () extends CSSMathValue {
    def this(value: CSSNumericValue, `type`: CSSNumericValueType) = this()
    
    def equals(other: CSSNumericValue): Any = js.native
    
    /* private */ var value: Any = js.native
  }
  /* static members */
  object CSSMathInvert {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathInvert")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(value: CSSNumericValue): CSSMathInvert = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[CSSMathInvert]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathMax")
  @js.native
  open class CSSMathMax protected () extends CSSMathVariadic {
    def this(values: js.Array[CSSNumericValue], `type`: CSSNumericValueType) = this()
  }
  /* static members */
  object CSSMathMax {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathMax")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[CSSNumericValue]): CSSMathMax = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[CSSMathMax]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathMin")
  @js.native
  open class CSSMathMin protected () extends CSSMathVariadic {
    def this(values: js.Array[CSSNumericValue], `type`: CSSNumericValueType) = this()
  }
  /* static members */
  object CSSMathMin {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathMin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[CSSNumericValue]): CSSMathMin = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[CSSMathMin]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathNegate")
  @js.native
  open class CSSMathNegate protected () extends CSSMathValue {
    def this(value: CSSNumericValue, `type`: CSSNumericValueType) = this()
    
    def equals(other: CSSNumericValue): Any = js.native
    
    var value: CSSNumericValue = js.native
  }
  /* static members */
  object CSSMathNegate {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathNegate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(value: CSSNumericValue): CSSMathNegate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[CSSMathNegate]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathProduct")
  @js.native
  open class CSSMathProduct protected () extends CSSMathVariadic {
    def this(values: js.Array[CSSNumericValue], `type`: CSSNumericValueType) = this()
  }
  /* static members */
  object CSSMathProduct {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathProduct")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[CSSNumericValue]): CSSMathProduct = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[CSSMathProduct]
    
    inline def multiplyUnitMaps(a: UnitMap, b: UnitMap): UnitMap = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyUnitMaps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[UnitMap]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathSum")
  @js.native
  open class CSSMathSum protected () extends CSSMathVariadic {
    def this(values: js.Array[CSSNumericValue], `type`: CSSNumericValueType) = this()
  }
  /* static members */
  object CSSMathSum {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathSum")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canCreateNumericTypeFromSumValue(sum: CSSNumericSumValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateNumericTypeFromSumValue")(sum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def create(values: js.Array[CSSNumericValue]): CSSMathSum = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[CSSMathSum]
    
    inline def numericTypeFromUnitMap(units: UnitMap): CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("numericTypeFromUnitMap")(units.asInstanceOf[js.Any]).asInstanceOf[CSSNumericValueType]
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathValue")
  @js.native
  open class CSSMathValue protected () extends CSSNumericValue {
    /**
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#296
      */
    def this(type_ : CSSNumericValueType) = this()
    
    def isUnitValue(): Boolean = js.native
    
    var operator: String = js.native
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSMathVariadic")
  @js.native
  open class CSSMathVariadic protected () extends CSSMathValue {
    def this(values: js.Array[CSSNumericValue], `type`: CSSNumericValueType) = this()
    
    def equals(other: CSSNumericValue): Boolean = js.native
    
    def numericValues(): js.Array[CSSNumericValue] = js.native
    
    var values: js.Array[CSSNumericValue] = js.native
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSNumericValue")
  @js.native
  open class CSSNumericValue protected () extends CSSStyleValue {
    /**
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#296
      */
    def this(type_ : CSSNumericValueType) = this()
    
    /**
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#439
      */
    def add(numberishes: CSSNumberish*): CSSNumericValue = js.native
    
    /**
      * eg. calc(24px / 4%)
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CSSNumericValue/div
      */
    def div(numberishes: CSSNumberish*): CSSNumericValue = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CSSNumericValue/equals
      */
    def equals(numberishes: CSSNumberish*): Any = js.native
    
    def invert(): CSSNumericValue = js.native
    
    def max(numberishes: CSSNumberish*): CSSNumericValue = js.native
    
    def min(numberishes: CSSNumberish*): CSSNumericValue = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CSSNumericValue/mul
      */
    def mul(numberishes: CSSNumberish*): CSSNumericValue = js.native
    
    def negate(): CSSNumericValue = js.native
    
    /**
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#452
      */
    def sub(numberishes: CSSNumberish*): CSSNumericValue = js.native
    
    def sumValue(): CSSNumericSumValue = js.native
    
    def to(unitOrName: String): CSSUnitValue = js.native
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CSSNumericValue/to
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#331
      */
    def to(unitOrName: UnitType): CSSUnitValue = js.native
    
    /**
      * converts the object's value to a CSSMathSum object to values of the specified unit.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CSSNumericValue/toSum
      */
    def toSum(unit_strings: String*): CSSMathSum = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CSSNumericValue/type
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#414
      */
    def `type`(): CSSNumericType = js.native
    
    var type_ : CSSNumericValueType = js.native
  }
  /* static members */
  object CSSNumericValue {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSNumericValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isValidUnit(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSNumericValueType")
  @js.native
  open class CSSNumericValueType () extends StObject {
    def this(unit: UnitType) = this()
    def this(unit: Unit, exponent: Double) = this()
    def this(unit: UnitType, exponent: Double) = this()
    
    def applyPercentHint(hint: BaseType): Unit = js.native
    
    def exponent(`type`: BaseType): Double = js.native
    
    /* private */ var exponents: Any = js.native
    
    def hasNonZeroEntries(): Boolean = js.native
    
    var hasPercentHint: Boolean = js.native
    
    def isOnlyNonZeroEntry(baseType: BaseType, value: Double): Boolean = js.native
    
    def matchesBaseType(baseType: BaseType): Boolean = js.native
    
    def matchesBaseTypePercentage(baseType: BaseType): Boolean = js.native
    
    def matchesNumber(): Boolean = js.native
    
    def matchesNumberPercentage(): Boolean = js.native
    
    def matchesPercentage(): Boolean = js.native
    
    /* private */ var numNonZeroEntries: Any = js.native
    
    var percentHint: BaseType = js.native
    
    def setExponent(`type`: BaseType, newValue: Double): Unit = js.native
  }
  /* static members */
  object CSSNumericValueType {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSNumericValueType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(type1: CSSNumericValueType, type2: CSSNumericValueType, error: Boolean): CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[CSSNumericValueType]
    
    inline def multiply(type1: CSSNumericValueType, type2: CSSNumericValueType, error: Boolean): CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[CSSNumericValueType]
    
    inline def negateExponents(`type`: CSSNumericValueType): CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("negateExponents")(`type`.asInstanceOf[js.Any]).asInstanceOf[CSSNumericValueType]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "CSSUnitValue")
  @js.native
  open class CSSUnitValue protected () extends CSSNumericValue {
    def this(value: Double) = this()
    def this(value: Double, unitOrName: String) = this()
    def this(value: Double, unitOrName: UnitType) = this()
    
    def convertTo(target_unit: UnitType): CSSUnitValue = js.native
    
    def equals(other: CSSNumericValue): Boolean = js.native
    
    var unit: UnitType = js.native
    
    var value: Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "Odeg")
  @js.native
  val Odeg: CSSUnitValue = js.native
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSNumericValue", "Opx")
  @js.native
  val Opx: CSSUnitValue = js.native
  
  inline def baseTypeToString(baseType: BaseType): length | angle | time | frequency | resolution | flex | percent | _empty = ^.asInstanceOf[js.Dynamic].applyDynamic("baseTypeToString")(baseType.asInstanceOf[js.Any]).asInstanceOf[length | angle | time | frequency | resolution | flex | percent | _empty]
  
  inline def toCanonicalUnit(unit: UnitType): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanonicalUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]
  
  inline def typeCheck(values: js.Array[CSSNumericValue], op: js.Function, error: Boolean): CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("typeCheck")(values.asInstanceOf[js.Any], op.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[CSSNumericValueType]
  
  inline def unitTypeToBaseType(unit: UnitType): kLength | kAngle | kTime | kPercent = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToBaseType")(unit.asInstanceOf[js.Any]).asInstanceOf[kLength | kAngle | kTime | kPercent]
  
  type CSSNumberish = Double | CSSNumericValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteStrings.length
    - typings.antvGLite.antvGLiteStrings.angle
    - typings.antvGLite.antvGLiteStrings.time
    - typings.antvGLite.antvGLiteStrings.frequency
    - typings.antvGLite.antvGLiteStrings.resolution
    - typings.antvGLite.antvGLiteStrings.flex
    - typings.antvGLite.antvGLiteStrings.percent
  */
  trait CSSNumericBaseType extends StObject
  object CSSNumericBaseType {
    
    inline def angle: typings.antvGLite.antvGLiteStrings.angle = "angle".asInstanceOf[typings.antvGLite.antvGLiteStrings.angle]
    
    inline def flex: typings.antvGLite.antvGLiteStrings.flex = "flex".asInstanceOf[typings.antvGLite.antvGLiteStrings.flex]
    
    inline def frequency: typings.antvGLite.antvGLiteStrings.frequency = "frequency".asInstanceOf[typings.antvGLite.antvGLiteStrings.frequency]
    
    inline def length: typings.antvGLite.antvGLiteStrings.length = "length".asInstanceOf[typings.antvGLite.antvGLiteStrings.length]
    
    inline def percent: typings.antvGLite.antvGLiteStrings.percent = "percent".asInstanceOf[typings.antvGLite.antvGLiteStrings.percent]
    
    inline def resolution: typings.antvGLite.antvGLiteStrings.resolution = "resolution".asInstanceOf[typings.antvGLite.antvGLiteStrings.resolution]
    
    inline def time: typings.antvGLite.antvGLiteStrings.time = "time".asInstanceOf[typings.antvGLite.antvGLiteStrings.time]
  }
  
  trait CSSNumericType extends StObject {
    
    var angle: Double
    
    var flex: Double
    
    var frequency: Double
    
    var length: Double
    
    var percent: Double
    
    var percentHint: CSSNumericBaseType
    
    var resolution: Double
    
    var time: Double
  }
  object CSSNumericType {
    
    inline def apply(
      angle: Double,
      flex: Double,
      frequency: Double,
      length: Double,
      percent: Double,
      percentHint: CSSNumericBaseType,
      resolution: Double,
      time: Double
    ): CSSNumericType = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], percentHint = percentHint.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSNumericType]
    }
    
    extension [Self <: CSSNumericType](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentHint(value: CSSNumericBaseType): Self = StObject.set(x, "percentHint", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
