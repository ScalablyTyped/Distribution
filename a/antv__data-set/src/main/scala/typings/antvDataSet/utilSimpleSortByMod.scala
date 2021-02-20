package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilSimpleSortByMod {
  
  @JSImport("@antv/data-set/lib/util/simple-sort-by", JSImport.Default)
  @js.native
  def default(arr: js.Array[_]): js.Array[_] = js.native
  @JSImport("@antv/data-set/lib/util/simple-sort-by", JSImport.Default)
  @js.native
  def default(arr: js.Array[_], keys: SortTarget): js.Array[_] = js.native
  
  type SortTarget = String | js.Array[String] | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])
}
