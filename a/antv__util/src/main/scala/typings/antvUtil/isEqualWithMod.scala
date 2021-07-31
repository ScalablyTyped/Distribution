package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEqualWithMod {
  
  @JSImport("@antv/util/lib/is-equal-with", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](value: T, other: T, fn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
