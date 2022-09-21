package typings.antvGLite.cssMod

import typings.antvGLite.cssnumericsumvalueMod.UnitMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSMathProduct")
@js.native
open class CSSMathProduct protected ()
  extends typings.antvGLite.cssomMod.CSSMathProduct {
  def this(
    values: js.Array[typings.antvGLite.cssnumericvalueMod.CSSNumericValue],
    `type`: typings.antvGLite.cssnumericvalueMod.CSSNumericValueType
  ) = this()
}
/* static members */
object CSSMathProduct {
  
  @JSImport("@antv/g-lite/dist/css", "CSSMathProduct")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(values: js.Array[typings.antvGLite.cssnumericvalueMod.CSSNumericValue]): typings.antvGLite.cssnumericvalueMod.CSSMathProduct = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.cssnumericvalueMod.CSSMathProduct]
  
  inline def multiplyUnitMaps(a: UnitMap, b: UnitMap): UnitMap = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyUnitMaps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[UnitMap]
}
