package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLProject extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("HTMLProjectItems")
  val HTMLProjectItems_Original: HTMLProjectItems = js.native
  @JSName("Office.HTMLProject_typekey")
  var OfficeDotHTMLProject_typekey: HTMLProject = js.native
  val Parent: js.Any = js.native
  val State: MsoHTMLProjectState = js.native
  def HTMLProjectItems(Index: js.Any): HTMLProjectItem = js.native
  /** @param OpenKind [OpenKind=0] */
  def Open(): Unit = js.native
  def Open(OpenKind: MsoHTMLProjectOpen): Unit = js.native
  /** @param Refresh [Refresh=true] */
  def RefreshDocument(): Unit = js.native
  def RefreshDocument(Refresh: Boolean): Unit = js.native
  /** @param Refresh [Refresh=true] */
  def RefreshProject(): Unit = js.native
  def RefreshProject(Refresh: Boolean): Unit = js.native
}

