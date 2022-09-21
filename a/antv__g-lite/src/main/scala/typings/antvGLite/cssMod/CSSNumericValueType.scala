package typings.antvGLite.cssMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSNumericValueType")
@js.native
open class CSSNumericValueType ()
  extends typings.antvGLite.cssomMod.CSSNumericValueType {
  def this(unit: typings.antvGLite.typesMod.UnitType) = this()
  def this(unit: Unit, exponent: Double) = this()
  def this(unit: typings.antvGLite.typesMod.UnitType, exponent: Double) = this()
}
/* static members */
object CSSNumericValueType {
  
  @JSImport("@antv/g-lite/dist/css", "CSSNumericValueType")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(
    type1: typings.antvGLite.cssnumericvalueMod.CSSNumericValueType,
    type2: typings.antvGLite.cssnumericvalueMod.CSSNumericValueType,
    error: Boolean
  ): typings.antvGLite.cssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSNumericValueType]
  
  inline def multiply(
    type1: typings.antvGLite.cssnumericvalueMod.CSSNumericValueType,
    type2: typings.antvGLite.cssnumericvalueMod.CSSNumericValueType,
    error: Boolean
  ): typings.antvGLite.cssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSNumericValueType]
  
  inline def negateExponents(`type`: typings.antvGLite.cssnumericvalueMod.CSSNumericValueType): typings.antvGLite.cssnumericvalueMod.CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("negateExponents")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSNumericValueType]
}
