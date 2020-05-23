package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageNumber extends js.Object {
  var Alignment: WdPageNumberAlignment
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Parent: js.Any
  @JSName("Word.PageNumber_typekey")
  var WordDotPageNumber_typekey: PageNumber
  def Copy(): Unit
  def Cut(): Unit
  def Delete(): Unit
  def Select(): Unit
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
}

