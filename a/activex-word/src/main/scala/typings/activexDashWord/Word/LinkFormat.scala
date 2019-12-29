package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.LinkFormat")
@js.native
class LinkFormat protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  var AutoUpdate: Boolean = js.native
  val Creator: Double = js.native
  var Locked: Boolean = js.native
  val Parent: js.Any = js.native
  var SavePictureWithDocument: Boolean = js.native
  var SourceFullName: String = js.native
  val SourceName: String = js.native
  val SourcePath: String = js.native
  val Type: WdLinkType = js.native
  @JSName("Word.LinkFormat_typekey")
  var WordDotLinkFormat_typekey: LinkFormat = js.native
  def BreakLink(): Unit = js.native
  def Update(): Unit = js.native
}

