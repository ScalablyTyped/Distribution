package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecentFile extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  val Path: String
  var ReadOnly: Boolean
  @JSName("Word.RecentFile_typekey")
  var WordDotRecentFile_typekey: RecentFile
  def Delete(): Unit
  def Open(): Document
}

object RecentFile {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Open: () => Document,
    Parent: js.Any,
    Path: String,
    ReadOnly: Boolean,
    WordDotRecentFile_typekey: RecentFile
  ): RecentFile = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.RecentFile_typekey")(WordDotRecentFile_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentFile]
  }
}

