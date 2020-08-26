package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadersFooters extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.HeadersFooters_typekey")
  var WordDotHeadersFooters_typekey: HeadersFooters = js.native
  def Item(Index: WdHeaderFooterIndex): HeaderFooter = js.native
}

object HeadersFooters {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdHeaderFooterIndex => HeaderFooter,
    Parent: js.Any,
    WordDotHeadersFooters_typekey: HeadersFooters
  ): HeadersFooters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadersFooters_typekey")(WordDotHeadersFooters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersFooters]
  }
  @scala.inline
  implicit class HeadersFootersOps[Self <: HeadersFooters] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: WdHeaderFooterIndex => HeaderFooter): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotHeadersFooters_typekey(value: HeadersFooters): Self = this.set("Word.HeadersFooters_typekey", value.asInstanceOf[js.Any])
  }
  
}

