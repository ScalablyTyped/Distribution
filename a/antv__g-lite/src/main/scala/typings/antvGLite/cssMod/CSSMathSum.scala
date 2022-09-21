package typings.antvGLite.cssMod

import typings.antvGLite.cssnumericsumvalueMod.CSSNumericSumValue
import typings.antvGLite.cssnumericsumvalueMod.UnitMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSMathSum")
@js.native
open class CSSMathSum protected ()
  extends typings.antvGLite.cssomMod.CSSMathSum {
  def this(
    values: js.Array[typings.antvGLite.cssnumericvalueMod.CSSNumericValue],
    `type`: typings.antvGLite.cssnumericvalueMod.CSSNumericValueType
  ) = this()
}
/* static members */
object CSSMathSum {
  
  @JSImport("@antv/g-lite/dist/css", "CSSMathSum")
  @js.native
  val ^ : js.Any = js.native
  
  inline def canCreateNumericTypeFromSumValue(sum: CSSNumericSumValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateNumericTypeFromSumValue")(sum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def create(values: js.Array[typings.antvGLite.cssnumericvalueMod.CSSNumericValue]): typings.antvGLite.cssnumericvalueMod.CSSMathSum = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSMathSum]
  
  inline def numericTypeFromUnitMap(units: UnitMap): typings.antvGLite.cssnumericvalueMod.CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("numericTypeFromUnitMap")(units.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSNumericValueType]
}
