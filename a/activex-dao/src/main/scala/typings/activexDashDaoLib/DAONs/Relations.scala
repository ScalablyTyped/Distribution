package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relations extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Relation = js.native
  def apply(Item: scala.Double): Relation = js.native
  def Append(Relation: Relation): scala.Unit = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Item: java.lang.String): Relation = js.native
  def Item(Item: scala.Double): Relation = js.native
  def Refresh(): scala.Unit = js.native
}

