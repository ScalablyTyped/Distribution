package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDefs extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): QueryDef = js.native
  def apply(Item: Double): QueryDef = js.native
  def Append(QueryDef: QueryDef): Unit = js.native
  def Delete(Name: String): Unit = js.native
  def Item(Item: String): QueryDef = js.native
  def Item(Item: Double): QueryDef = js.native
  def Refresh(): Unit = js.native
}

