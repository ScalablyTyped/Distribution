package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashFilterMod {
  
  @JSImport("@antv/util/lib/lodash/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ Double, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
