package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoAuthors extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.CoAuthors_typekey")
  var WordDotCoAuthors_typekey: CoAuthors
  def Item(Index: js.Any): CoAuthor
}

object CoAuthors {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => CoAuthor,
    Parent: js.Any,
    WordDotCoAuthors_typekey: CoAuthors
  ): CoAuthors = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthors_typekey")(WordDotCoAuthors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthors]
  }
}

