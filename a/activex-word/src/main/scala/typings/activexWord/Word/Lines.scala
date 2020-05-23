package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lines extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Lines_typekey")
  var WordDotLines_typekey: Lines
  def Item(Index: Double): Line
}

object Lines {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Line,
    Parent: js.Any,
    WordDotLines_typekey: Lines
  ): Lines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Lines_typekey")(WordDotLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
}

