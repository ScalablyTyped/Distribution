package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Databases extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Database = js.native
  def apply(Item: Double): Database = js.native
  def Item(Item: String): Database = js.native
  def Item(Item: Double): Database = js.native
  def Refresh(): Unit = js.native
}

