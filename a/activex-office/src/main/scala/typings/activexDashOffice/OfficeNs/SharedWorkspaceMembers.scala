package typings.activexDashOffice.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceMembers extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val ItemCountExceeded: Boolean = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): SharedWorkspaceMember = js.native
  def Add(Email: String, DomainName: String, DisplayName: String): SharedWorkspaceMember = js.native
  def Add(Email: String, DomainName: String, DisplayName: String, Role: String): SharedWorkspaceMember = js.native
  def Item(Index: Double): SharedWorkspaceMember = js.native
}

