package typings.activexWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Comment: String = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val Index: Double = js.native
  val Parent: js.Any = js.native
  val SavedBy: String = js.native
  @JSName("Word.Version_typekey")
  var WordDotVersion_typekey: Version = js.native
  def Delete(): Unit = js.native
  def Open(): Document = js.native
  def OpenOld(): Unit = js.native
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
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: VarDate): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: () => Document): Self = this.set("Open", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenOld(value: () => Unit): Self = this.set("OpenOld", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSavedBy(value: String): Self = this.set("SavedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotVersion_typekey(value: Version): Self = this.set("Word.Version_typekey", value.asInstanceOf[js.Any])
  }
  
}

