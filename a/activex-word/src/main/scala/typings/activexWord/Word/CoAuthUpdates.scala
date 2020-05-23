package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoAuthUpdates extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.CoAuthUpdates_typekey")
  var WordDotCoAuthUpdates_typekey: CoAuthUpdates
  def Item(Index: Double): CoAuthUpdate
}

object CoAuthUpdates {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => CoAuthUpdate,
    Parent: js.Any,
    WordDotCoAuthUpdates_typekey: CoAuthUpdates
  ): CoAuthUpdates = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthUpdates_typekey")(WordDotCoAuthUpdates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthUpdates]
  }
}

