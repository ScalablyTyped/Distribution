package typings.antvDataSet

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/data-set/lib/util/partition", JSImport.Namespace)
@js.native
object utilPartitionMod extends js.Object {
  
  def default(rows: js.Array[_], group_by: String): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: String, order_by: String): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: String, order_by: js.Array[String]): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: String, order_by: js.Function1[/* item */ js.Any, Double]): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: js.Array[String]): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: js.Array[String], order_by: String): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: js.Array[String], order_by: js.Array[String]): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: js.Array[String], order_by: js.Function1[/* item */ js.Any, Double]): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: js.Function1[/* item */ js.Any, String]): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: js.Function1[/* item */ js.Any, String], order_by: String): Record[String, js.Array[_]] = js.native
  def default(rows: js.Array[_], group_by: js.Function1[/* item */ js.Any, String], order_by: js.Array[String]): Record[String, js.Array[_]] = js.native
  def default(
    rows: js.Array[_],
    group_by: js.Function1[/* item */ js.Any, String],
    order_by: js.Function1[/* item */ js.Any, Double]
  ): Record[String, js.Array[_]] = js.native
}
