package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashMaxByMod {
  
  @JSImport("@antv/util/lib/lodash/max-by", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](arr: js.Array[T], fn: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def default[T](arr: js.Array[T], fn: js.Function1[/* v */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
}
