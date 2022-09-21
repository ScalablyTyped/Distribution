package typings.antvGLite.cssMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSNumericValue")
@js.native
abstract class CSSNumericValue protected ()
  extends typings.antvGLite.cssomMod.CSSNumericValue {
  /**
    * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#296
    */
  def this(type_ : typings.antvGLite.cssnumericvalueMod.CSSNumericValueType) = this()
}
/* static members */
object CSSNumericValue {
  
  @JSImport("@antv/g-lite/dist/css", "CSSNumericValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidUnit(unit: typings.antvGLite.typesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
