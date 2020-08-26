package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageNumber extends js.Object {
  var Alignment: WdPageNumberAlignment = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.PageNumber_typekey")
  var WordDotPageNumber_typekey: PageNumber = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object PageNumber {
  @scala.inline
  def apply(
    Alignment: WdPageNumberAlignment,
    Application: Application,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Index: Double,
    Parent: js.Any,
    Select: () => Unit,
    WordDotPageNumber_typekey: PageNumber
  ): PageNumber = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.PageNumber_typekey")(WordDotPageNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageNumber]
  }
  @scala.inline
  implicit class PageNumberOps[Self <: PageNumber] (val x: Self) extends AnyVal {
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
    def setAlignment(value: WdPageNumberAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("Cut", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotPageNumber_typekey(value: PageNumber): Self = this.set("Word.PageNumber_typekey", value.asInstanceOf[js.Any])
  }
  
}

