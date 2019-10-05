package typings.activexDashDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDefs extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): TableDef = js.native
  def apply(Item: Double): TableDef = js.native
  def Append(TableDef: TableDef): Unit = js.native
  def Delete(Name: String): Unit = js.native
  def Item(Item: String): TableDef = js.native
  def Item(Item: Double): TableDef = js.native
  def Refresh(): Unit = js.native
}

