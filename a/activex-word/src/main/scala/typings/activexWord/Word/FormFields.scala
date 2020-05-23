package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFields extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  var Shaded: Boolean
  @JSName("Word.FormFields_typekey")
  var WordDotFormFields_typekey: FormFields
  def Add(Range: Range, Type: WdFieldType): FormField
  def Item(Index: js.Any): FormField
}

object FormFields {
  @scala.inline
  def apply(
    Add: (Range, WdFieldType) => FormField,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => FormField,
    Parent: js.Any,
    Shaded: Boolean,
    WordDotFormFields_typekey: FormFields
  ): FormFields = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Shaded = Shaded.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FormFields_typekey")(WordDotFormFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFields]
  }
}

