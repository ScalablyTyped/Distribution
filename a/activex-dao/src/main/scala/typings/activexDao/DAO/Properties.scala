package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Property = js.native
  def apply(Item: Double): Property = js.native
  def Append(Property: Property): Unit = js.native
  def Delete(Name: String): Unit = js.native
  def Item(Item: String): Property = js.native
  def Item(Item: Double): Property = js.native
  def Refresh(): Unit = js.native
}

