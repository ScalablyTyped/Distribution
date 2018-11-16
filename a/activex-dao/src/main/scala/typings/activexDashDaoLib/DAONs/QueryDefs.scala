package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDefs extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): QueryDef = js.native
  def apply(Item: scala.Double): QueryDef = js.native
  def Append(QueryDef: QueryDef): scala.Unit = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Item: java.lang.String): QueryDef = js.native
  def Item(Item: scala.Double): QueryDef = js.native
  def Refresh(): scala.Unit = js.native
}

