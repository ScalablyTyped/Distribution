package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkFormat extends js.Object {
  val Application: typings.activexWord.Word.Application
  var AutoUpdate: Boolean
  val Creator: Double
  var Locked: Boolean
  val Parent: js.Any
  var SavePictureWithDocument: Boolean
  var SourceFullName: String
  val SourceName: String
  val SourcePath: String
  val Type: WdLinkType
  @JSName("Word.LinkFormat_typekey")
  var WordDotLinkFormat_typekey: LinkFormat
  def BreakLink(): Unit
  def Update(): Unit
}

object LinkFormat {
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: Boolean,
    BreakLink: () => Unit,
    Creator: Double,
    Locked: Boolean,
    Parent: js.Any,
    SavePictureWithDocument: Boolean,
    SourceFullName: String,
    SourceName: String,
    SourcePath: String,
    Type: WdLinkType,
    Update: () => Unit,
    WordDotLinkFormat_typekey: LinkFormat
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = js.Any.fromFunction0(BreakLink), Creator = Creator.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SavePictureWithDocument = SavePictureWithDocument.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourcePath = SourcePath.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.LinkFormat_typekey")(WordDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
}

