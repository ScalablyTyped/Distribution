package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.HTMLProject")
@js.native
class HTMLProject protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  @JSName("HTMLProjectItems")
  val HTMLProjectItems_Original: HTMLProjectItems = js.native
  var `Office.HTMLProject_typekey`: HTMLProject = js.native
  val Parent: js.Any = js.native
  val State: MsoHTMLProjectState = js.native
  def HTMLProjectItems(Index: js.Any): HTMLProjectItem = js.native
  /** @param OpenKind [OpenKind=0] */
  def Open(): scala.Unit = js.native
  /** @param OpenKind [OpenKind=0] */
  def Open(OpenKind: MsoHTMLProjectOpen): scala.Unit = js.native
  /** @param Refresh [Refresh=true] */
  def RefreshDocument(): scala.Unit = js.native
  /** @param Refresh [Refresh=true] */
  def RefreshDocument(Refresh: scala.Boolean): scala.Unit = js.native
  /** @param Refresh [Refresh=true] */
  def RefreshProject(): scala.Unit = js.native
  /** @param Refresh [Refresh=true] */
  def RefreshProject(Refresh: scala.Boolean): scala.Unit = js.native
}

