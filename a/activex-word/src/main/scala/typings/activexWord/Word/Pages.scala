package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pages extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Pages_typekey")
  var WordDotPages_typekey: Pages
  def Item(Index: Double): Page
}

object Pages {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Page,
    Parent: js.Any,
    WordDotPages_typekey: Pages
  ): Pages = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Pages_typekey")(WordDotPages_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
}

