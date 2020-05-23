package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDown extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Default: Double
  val ListEntries: typings.activexWord.Word.ListEntries
  val Parent: js.Any
  val Valid: Boolean
  var Value: Double
  @JSName("Word.DropDown_typekey")
  var WordDotDropDown_typekey: DropDown
}

object DropDown {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Default: Double,
    ListEntries: ListEntries,
    Parent: js.Any,
    Valid: Boolean,
    Value: Double,
    WordDotDropDown_typekey: DropDown
  ): DropDown = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ListEntries = ListEntries.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DropDown_typekey")(WordDotDropDown_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDown]
  }
}

