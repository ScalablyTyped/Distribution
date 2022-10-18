package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcUtilSimpleSortByMod {
  
  @JSImport("@antv/data-set/lib/src/util/simple-sort-by", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def default(arr: js.Array[Any], keys: SortTarget): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  type SortTarget = String | js.Array[String] | (js.Function2[/* a */ Any, /* b */ Any, Double])
}
