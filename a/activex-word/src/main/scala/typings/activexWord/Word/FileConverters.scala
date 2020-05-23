package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConverters extends js.Object {
  val Application: typings.activexWord.Word.Application
  var ConvertMacWordChevrons: WdChevronConvertRule
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.FileConverters_typekey")
  var WordDotFileConverters_typekey: FileConverters
  def Item(Index: js.Any): FileConverter
}

object FileConverters {
  @scala.inline
  def apply(
    Application: Application,
    ConvertMacWordChevrons: WdChevronConvertRule,
    Count: Double,
    Creator: Double,
    Item: js.Any => FileConverter,
    Parent: js.Any,
    WordDotFileConverters_typekey: FileConverters
  ): FileConverters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ConvertMacWordChevrons = ConvertMacWordChevrons.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FileConverters_typekey")(WordDotFileConverters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverters]
  }
}

