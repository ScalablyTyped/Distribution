package typings.antvUtil

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqMod {
  
  @JSImport("@antv/util/lib/lodash/uniq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def default(arr: js.Array[Any], cache: Map[Any, Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
