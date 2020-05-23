package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontNames extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.FontNames_typekey")
  var WordDotFontNames_typekey: FontNames
  def Item(Index: Double): String
}

object FontNames {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => String,
    Parent: js.Any,
    WordDotFontNames_typekey: FontNames
  ): FontNames = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FontNames_typekey")(WordDotFontNames_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontNames]
  }
}

