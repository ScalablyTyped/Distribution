package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Revisions extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Revisions_typekey")
  var WordDotRevisions_typekey: Revisions = js.native
  def AcceptAll(): Unit = js.native
  def Item(Index: Double): Revision = js.native
  def RejectAll(): Unit = js.native
}

object Revisions {
  @scala.inline
  def apply(
    AcceptAll: () => Unit,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Revision,
    Parent: js.Any,
    RejectAll: () => Unit,
    WordDotRevisions_typekey: Revisions
  ): Revisions = {
    val __obj = js.Dynamic.literal(AcceptAll = js.Any.fromFunction0(AcceptAll), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], RejectAll = js.Any.fromFunction0(RejectAll))
    __obj.updateDynamic("Word.Revisions_typekey")(WordDotRevisions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revisions]
  }
  @scala.inline
  implicit class RevisionsOps[Self <: Revisions] (val x: Self) extends AnyVal {
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
    def setAcceptAll(value: () => Unit): Self = this.set("AcceptAll", js.Any.fromFunction0(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => Revision): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejectAll(value: () => Unit): Self = this.set("RejectAll", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotRevisions_typekey(value: Revisions): Self = this.set("Word.Revisions_typekey", value.asInstanceOf[js.Any])
  }
  
}

