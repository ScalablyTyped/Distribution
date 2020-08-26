package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathBreak extends js.Object {
  var AlignAt: Double = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  @JSName("Word.OMathBreak_typekey")
  var WordDotOMathBreak_typekey: OMathBreak = js.native
  def Delete(): Unit = js.native
}

object OMathBreak {
  @scala.inline
  def apply(
    AlignAt: Double,
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Parent: js.Any,
    Range: Range,
    WordDotOMathBreak_typekey: OMathBreak
  ): OMathBreak = {
    val __obj = js.Dynamic.literal(AlignAt = AlignAt.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBreak_typekey")(WordDotOMathBreak_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBreak]
  }
  @scala.inline
  implicit class OMathBreakOps[Self <: OMathBreak] (val x: Self) extends AnyVal {
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
    def setAlignAt(value: Double): Self = this.set("AlignAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathBreak_typekey(value: OMathBreak): Self = this.set("Word.OMathBreak_typekey", value.asInstanceOf[js.Any])
  }
  
}

