package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Field = js.native
  def apply(Item: scala.Double): Field = js.native
  def Append(Field: Field): scala.Unit = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Item: java.lang.String): Field = js.native
  def Item(Item: scala.Double): Field = js.native
  def Refresh(): scala.Unit = js.native
}

