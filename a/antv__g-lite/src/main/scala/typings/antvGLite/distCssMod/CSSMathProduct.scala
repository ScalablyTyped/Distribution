package typings.antvGLite.distCssMod

import typings.antvGLite.distCssCssomCssnumericsumvalueMod.UnitMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSMathProduct")
@js.native
open class CSSMathProduct protected ()
  extends typings.antvGLite.distCssCssomMod.CSSMathProduct {
  def this(
    values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
    `type`: typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
  ) = this()
}
/* static members */
object CSSMathProduct {
  
  @JSImport("@antv/g-lite/dist/css", "CSSMathProduct")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(values: js.Array[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct]
  
  inline def multiplyUnitMaps(a: UnitMap, b: UnitMap): UnitMap = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyUnitMaps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[UnitMap]
}
