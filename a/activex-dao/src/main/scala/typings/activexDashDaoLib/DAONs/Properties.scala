package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Property = js.native
  def apply(Item: scala.Double): Property = js.native
  def Append(Property: Property): scala.Unit = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Item: java.lang.String): Property = js.native
  def Item(Item: scala.Double): Property = js.native
  def Refresh(): scala.Unit = js.native
}

