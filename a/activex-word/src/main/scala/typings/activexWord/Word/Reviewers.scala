package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reviewers extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Reviewers_typekey")
  var WordDotReviewers_typekey: Reviewers
  def Item(Index: js.Any): Reviewer
}

object Reviewers {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Reviewer,
    Parent: js.Any,
    WordDotReviewers_typekey: Reviewers
  ): Reviewers = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Reviewers_typekey")(WordDotReviewers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewers]
  }
}

