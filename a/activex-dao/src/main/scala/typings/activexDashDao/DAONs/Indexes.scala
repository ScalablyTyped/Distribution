package typings.activexDashDao.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait Indexes extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Index = js.native
  def apply(Item: Double): Index = js.native
  def Append(Index: Index): Unit = js.native
  def Delete(Name: String): Unit = js.native
  def Item(Item: String): Index = js.native
  def Item(Item: Double): Index = js.native
  def Refresh(): Unit = js.native
}

