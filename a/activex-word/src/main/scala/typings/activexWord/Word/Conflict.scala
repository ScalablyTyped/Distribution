package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conflict extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  val Type: WdRevisionType = js.native
  @JSName("Word.Conflict_typekey")
  var WordDotConflict_typekey: Conflict = js.native
  def Accept(): Unit = js.native
  def Reject(): Unit = js.native
}

object Conflict {
  @scala.inline
  def apply(
    Accept: () => Unit,
    Application: Application,
    Creator: Double,
    Index: Double,
    Parent: js.Any,
    Range: Range,
    Reject: () => Unit,
    Type: WdRevisionType,
    WordDotConflict_typekey: Conflict
  ): Conflict = {
    val __obj = js.Dynamic.literal(Accept = js.Any.fromFunction0(Accept), Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = js.Any.fromFunction0(Reject), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Conflict_typekey")(WordDotConflict_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
  @scala.inline
  implicit class ConflictOps[Self <: Conflict] (val x: Self) extends AnyVal {
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setReject(value: () => Unit): Self = this.set("Reject", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: WdRevisionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotConflict_typekey(value: Conflict): Self = this.set("Word.Conflict_typekey", value.asInstanceOf[js.Any])
  }
  
}

