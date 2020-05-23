package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Languages extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Languages_typekey")
  var WordDotLanguages_typekey: Languages
  def Item(Index: js.Any): Language
}

object Languages {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Language,
    Parent: js.Any,
    WordDotLanguages_typekey: Languages
  ): Languages = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Languages_typekey")(WordDotLanguages_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Languages]
  }
}

