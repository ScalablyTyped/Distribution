package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDefs extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): TableDef = js.native
  def apply(Item: scala.Double): TableDef = js.native
  def Append(TableDef: TableDef): scala.Unit = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Item: java.lang.String): TableDef = js.native
  def Item(Item: scala.Double): TableDef = js.native
  def Refresh(): scala.Unit = js.native
}

