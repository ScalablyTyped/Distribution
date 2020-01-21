package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedbackType extends js.Object {
  var fields: js.Array[FieldType]
}

object FeedbackType {
  @scala.inline
  def apply(fields: js.Array[FieldType]): FeedbackType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeedbackType]
  }
}

