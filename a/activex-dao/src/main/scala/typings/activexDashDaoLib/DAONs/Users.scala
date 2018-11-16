package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): User = js.native
  def apply(Item: scala.Double): User = js.native
  def Append(User: User): scala.Unit = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Item: java.lang.String): User = js.native
  def Item(Item: scala.Double): User = js.native
  def Refresh(): scala.Unit = js.native
}

