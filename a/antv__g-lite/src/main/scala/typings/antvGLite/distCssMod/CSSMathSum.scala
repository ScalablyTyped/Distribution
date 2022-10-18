package typings.antvGLite.distCssMod

import typings.antvGLite.distCssCssomCssnumericsumvalueMod.CSSNumericSumValue
import typings.antvGLite.distCssCssomCssnumericsumvalueMod.UnitMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSMathSum")
@js.native
open class CSSMathSum protected ()
  extends typings.antvGLite.distCssCssomMod.CSSMathSum {
  def this(
    values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
    `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
  ) = this()
}
/* static members */
object CSSMathSum {
  
  @JSImport("@antv/g-lite/dist/css", "CSSMathSum")
  @js.native
  val ^ : js.Any = js.native
  
  inline def canCreateNumericTypeFromSumValue(sum: CSSNumericSumValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateNumericTypeFromSumValue")(sum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def create(values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum]
  
  inline def numericTypeFromUnitMap(units: UnitMap): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("numericTypeFromUnitMap")(units.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
}
