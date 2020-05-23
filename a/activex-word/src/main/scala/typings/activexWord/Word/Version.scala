package typings.activexWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Comment: String
  val Creator: Double
  val Date: VarDate
  val Index: Double
  val Parent: js.Any
  val SavedBy: String
  @JSName("Word.Version_typekey")
  var WordDotVersion_typekey: Version
  def Delete(): Unit
  def Open(): Document
  def OpenOld(): Unit
}

object Version {
  @scala.inline
  def apply(
    Application: Application,
    Comment: String,
    Creator: Double,
    Date: VarDate,
    Delete: () => Unit,
    Index: Double,
    Open: () => Document,
    OpenOld: () => Unit,
    Parent: js.Any,
    SavedBy: String,
    WordDotVersion_typekey: Version
  ): Version = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), OpenOld = js.Any.fromFunction0(OpenOld), Parent = Parent.asInstanceOf[js.Any], SavedBy = SavedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Version_typekey")(WordDotVersion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

