package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workspaces extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Workspace = js.native
  def apply(Item: scala.Double): Workspace = js.native
  def Append(Workspace: Workspace): scala.Unit = js.native
  def Delete(Name: java.lang.String): scala.Unit = js.native
  def Item(Item: java.lang.String): Workspace = js.native
  def Item(Item: scala.Double): Workspace = js.native
  def Refresh(): scala.Unit = js.native
}

