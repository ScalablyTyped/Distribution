package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceMembers extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val ItemCountExceeded: scala.Boolean = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): SharedWorkspaceMember = js.native
  def Add(Email: java.lang.String, DomainName: java.lang.String, DisplayName: java.lang.String): SharedWorkspaceMember = js.native
  def Add(
    Email: java.lang.String,
    DomainName: java.lang.String,
    DisplayName: java.lang.String,
    Role: java.lang.String
  ): SharedWorkspaceMember = js.native
  def Item(Index: scala.Double): SharedWorkspaceMember = js.native
}

