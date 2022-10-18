package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashFlattenDeepMod {
  
  @JSImport("@antv/util/lib/lodash/flatten-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def default(arr: js.Array[Any], result: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
