package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait Indexes extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Index = js.native
  def apply(Item: scala.Double): Index = js.native
  def Append(Index: Index): scala.Unit = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Item: java.lang.String): Index = js.native
  def Item(Item: scala.Double): Index = js.native
  def Refresh(): scala.Unit = js.native
}

