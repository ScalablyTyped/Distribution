package typings.activexWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Revision extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Author: String = js.native
  val Cells: typings.activexWord.Word.Cells = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val FormatDescription: String = js.native
  val Index: Double = js.native
  val MovedRange: typings.activexWord.Word.Range = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  val Style: typings.activexWord.Word.Style = js.native
  val Type: WdRevisionType = js.native
  @JSName("Word.Revision_typekey")
  var WordDotRevision_typekey: Revision = js.native
  def Accept(): Unit = js.native
  def Reject(): Unit = js.native
}

object Revision {
  @scala.inline
  def apply(
    Accept: () => Unit,
    Application: Application,
    Author: String,
    Cells: Cells,
    Creator: Double,
    Date: VarDate,
    FormatDescription: String,
    Index: Double,
    MovedRange: Range,
    Parent: js.Any,
    Range: Range,
    Reject: () => Unit,
    Style: Style,
    Type: WdRevisionType,
    WordDotRevision_typekey: Revision
  ): Revision = {
    val __obj = js.Dynamic.literal(Accept = js.Any.fromFunction0(Accept), Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], FormatDescription = FormatDescription.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MovedRange = MovedRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = js.Any.fromFunction0(Reject), Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Revision_typekey")(WordDotRevision_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  @scala.inline
  implicit class RevisionOps[Self <: Revision] (val x: Self) extends AnyVal {
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
    def setAccept(value: () => Unit): Self = this.set("Accept", js.Any.fromFunction0(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    @scala.inline
    def setCells(value: Cells): Self = this.set("Cells", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: VarDate): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatDescription(value: String): Self = this.set("FormatDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovedRange(value: Range): Self = this.set("MovedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setReject(value: () => Unit): Self = this.set("Reject", js.Any.fromFunction0(value))
    @scala.inline
    def setStyle(value: Style): Self = this.set("Style", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WdRevisionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotRevision_typekey(value: Revision): Self = this.set("Word.Revision_typekey", value.asInstanceOf[js.Any])
  }
  
}

