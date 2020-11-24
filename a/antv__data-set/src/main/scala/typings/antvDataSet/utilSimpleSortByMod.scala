package typings.antvDataSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/data-set/lib/util/simple-sort-by", JSImport.Namespace)
@js.native
object utilSimpleSortByMod extends js.Object {
  
  def default(arr: js.Array[_]): js.Array[_] = js.native
  def default(arr: js.Array[_], keys: SortTarget): js.Array[_] = js.native
  
  type SortTarget = String | js.Array[String] | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])
}
