package typings.antvGLite

import typings.antvGLite.antvGLiteStrings.Percentsign
import typings.antvGLite.antvGLiteStrings._empty
import typings.antvGLite.antvGLiteStrings.deg
import typings.antvGLite.antvGLiteStrings.em
import typings.antvGLite.antvGLiteStrings.grad
import typings.antvGLite.antvGLiteStrings.ms
import typings.antvGLite.antvGLiteStrings.px
import typings.antvGLite.antvGLiteStrings.rad
import typings.antvGLite.antvGLiteStrings.rem
import typings.antvGLite.antvGLiteStrings.s
import typings.antvGLite.antvGLiteStrings.turn
import typings.antvGLite.typesMod.Nested
import typings.antvGLite.typesMod.ParenLess
import typings.antvGLite.typesMod.UnitCategory
import typings.antvGLite.typesMod.UnitType
import typings.antvGLite.typesMod.UnitType.kDegrees
import typings.antvGLite.typesMod.UnitType.kNumber
import typings.antvGLite.typesMod.UnitType.kPercentage
import typings.antvGLite.typesMod.UnitType.kPixels
import typings.antvGLite.typesMod.UnitType.kSeconds
import typings.antvGLite.typesMod.UnitType.kUnknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssstylevalueMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSStyleValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSStyleValue", "CSSStyleValue")
  @js.native
  abstract class CSSStyleValue () extends StObject {
    
    def buildCSSText(n: Nested, p: ParenLess, result: String): String = js.native
    
    /* protected */ def getType(): CSSStyleValueType = js.native
    
    def isNumericValue(): Boolean = js.native
  }
  /* static members */
  object CSSStyleValue {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSStyleValue", "CSSStyleValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAngle(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngle")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isLength(`type`: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRelativeUnit(`type`: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUnit")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isTime(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTime")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  sealed trait CSSStyleValueType extends StObject
  @JSImport("@antv/g-lite/dist/css/cssom/CSSStyleValue", "CSSStyleValueType")
  @js.native
  object CSSStyleValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CSSStyleValueType & Double] = js.native
    
    @js.native
    sealed trait kClampType
      extends StObject
         with CSSStyleValueType
    /* 10 */ val kClampType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kClampType & Double = js.native
    
    @js.native
    sealed trait kColorType
      extends StObject
         with CSSStyleValueType
    /* 14 */ val kColorType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kColorType & Double = js.native
    
    @js.native
    sealed trait kInvertType
      extends StObject
         with CSSStyleValueType
    /* 7 */ val kInvertType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kInvertType & Double = js.native
    
    @js.native
    sealed trait kKeywordType
      extends StObject
         with CSSStyleValueType
    /* 2 */ val kKeywordType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kKeywordType & Double = js.native
    
    @js.native
    sealed trait kMaxType
      extends StObject
         with CSSStyleValueType
    /* 9 */ val kMaxType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kMaxType & Double = js.native
    
    @js.native
    sealed trait kMinType
      extends StObject
         with CSSStyleValueType
    /* 8 */ val kMinType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kMinType & Double = js.native
    
    @js.native
    sealed trait kNegateType
      extends StObject
         with CSSStyleValueType
    /* 6 */ val kNegateType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kNegateType & Double = js.native
    
    @js.native
    sealed trait kPositionType
      extends StObject
         with CSSStyleValueType
    /* 12 */ val kPositionType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kPositionType & Double = js.native
    
    @js.native
    sealed trait kProductType
      extends StObject
         with CSSStyleValueType
    /* 5 */ val kProductType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kProductType & Double = js.native
    
    @js.native
    sealed trait kSumType
      extends StObject
         with CSSStyleValueType
    /* 4 */ val kSumType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kSumType & Double = js.native
    
    @js.native
    sealed trait kTransformType
      extends StObject
         with CSSStyleValueType
    /* 11 */ val kTransformType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kTransformType & Double = js.native
    
    @js.native
    sealed trait kURLImageType
      extends StObject
         with CSSStyleValueType
    /* 13 */ val kURLImageType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kURLImageType & Double = js.native
    
    @js.native
    sealed trait kUnitType
      extends StObject
         with CSSStyleValueType
    /* 3 */ val kUnitType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kUnitType & Double = js.native
    
    @js.native
    sealed trait kUnknownType
      extends StObject
         with CSSStyleValueType
    /* 0 */ val kUnknownType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kUnknownType & Double = js.native
    
    @js.native
    sealed trait kUnparsedType
      extends StObject
         with CSSStyleValueType
    /* 1 */ val kUnparsedType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kUnparsedType & Double = js.native
    
    @js.native
    sealed trait kUnsupportedColorType
      extends StObject
         with CSSStyleValueType
    /* 15 */ val kUnsupportedColorType: typings.antvGLite.cssstylevalueMod.CSSStyleValueType.kUnsupportedColorType & Double = js.native
  }
  
  inline def canonicalUnitTypeForCategory(category: UnitCategory): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalUnitTypeForCategory")(category.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]
  
  inline def conversionToCanonicalUnitsScaleFactor(unit_type: UnitType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("conversionToCanonicalUnitsScaleFactor")(unit_type.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def unitFromName(name: String): UnitType = ^.asInstanceOf[js.Dynamic].applyDynamic("unitFromName")(name.asInstanceOf[js.Any]).asInstanceOf[UnitType]
  
  inline def unitTypeToString(`type`: UnitType): em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToString")(`type`.asInstanceOf[js.Any]).asInstanceOf[em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign]
  
  inline def unitTypeToUnitCategory(`type`: UnitType): UnitCategory = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToUnitCategory")(`type`.asInstanceOf[js.Any]).asInstanceOf[UnitCategory]
}
