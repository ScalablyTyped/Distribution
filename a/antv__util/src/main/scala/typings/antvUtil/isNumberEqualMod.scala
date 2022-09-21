package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNumberEqualMod {
  
  @JSImport("@antv/util/lib/lodash/is-number-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(a: Double, b: Double, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
