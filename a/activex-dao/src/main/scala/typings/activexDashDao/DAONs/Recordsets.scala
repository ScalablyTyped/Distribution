package typings.activexDashDao.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recordsets extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Recordset = js.native
  def apply(Item: Double): Recordset = js.native
  def Item(Item: String): Recordset = js.native
  def Item(Item: Double): Recordset = js.native
  def Refresh(): Unit = js.native
}

