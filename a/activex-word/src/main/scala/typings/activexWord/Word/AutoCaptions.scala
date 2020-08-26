package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCaptions extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AutoCaptions_typekey")
  var WordDotAutoCaptions_typekey: AutoCaptions = js.native
  def CancelAutoInsert(): Unit = js.native
  def Item(Index: js.Any): AutoCaption = js.native
}

object AutoCaptions {
  @scala.inline
  def apply(
    Application: Application,
    CancelAutoInsert: () => Unit,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoCaption,
    Parent: js.Any,
    WordDotAutoCaptions_typekey: AutoCaptions
  ): AutoCaptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CancelAutoInsert = js.Any.fromFunction0(CancelAutoInsert), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaptions_typekey")(WordDotAutoCaptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaptions]
  }
  @scala.inline
  implicit class AutoCaptionsOps[Self <: AutoCaptions] (val x: Self) extends AnyVal {
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
    def setCancelAutoInsert(value: () => Unit): Self = this.set("CancelAutoInsert", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => AutoCaption): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotAutoCaptions_typekey(value: AutoCaptions): Self = this.set("Word.AutoCaptions_typekey", value.asInstanceOf[js.Any])
  }
  
}

