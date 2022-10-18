package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashSetMod {
  
  @JSImport("@antv/util/lib/lodash/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(obj: Any, path: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default(obj: Any, path: js.Array[Any], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
}
