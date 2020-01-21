package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relations extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Relation = js.native
  def apply(Item: Double): Relation = js.native
  def Append(Relation: Relation): Unit = js.native
  def Delete(Name: String): Unit = js.native
  def Item(Item: String): Relation = js.native
  def Item(Item: Double): Relation = js.native
  def Refresh(): Unit = js.native
}

