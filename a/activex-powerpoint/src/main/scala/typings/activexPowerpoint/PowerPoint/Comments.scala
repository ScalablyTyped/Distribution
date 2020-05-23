package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comments extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.Comments_typekey")
  var PowerPointDotComments_typekey: Comments
  def Add(Left: Double, Top: Double, Author: String, AuthorInitials: String, Text: String): Comment
  def Item(Index: Double): Comment
}

object Comments {
  @scala.inline
  def apply(
    Add: (Double, Double, String, String, String) => Comment,
    Application: Application,
    Count: Double,
    Item: Double => Comment,
    Parent: js.Any,
    PowerPointDotComments_typekey: Comments
  ): Comments = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction5(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Comments_typekey")(PowerPointDotComments_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comments]
  }
}

