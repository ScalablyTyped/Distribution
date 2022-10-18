package typings.antvGLite.distCssMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSNumericValueType")
@js.native
open class CSSNumericValueType ()
  extends typings.antvGLite.distCssCssomMod.CSSNumericValueType {
  def this(unit: typings.antvGLite.distCssCssomTypesMod.UnitType) = this()
  def this(unit: Unit, exponent: Double) = this()
  def this(unit: typings.antvGLite.distCssCssomTypesMod.UnitType, exponent: Double) = this()
}
/* static members */
object CSSNumericValueType {
  
  @JSImport("@antv/g-lite/dist/css", "CSSNumericValueType")
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
