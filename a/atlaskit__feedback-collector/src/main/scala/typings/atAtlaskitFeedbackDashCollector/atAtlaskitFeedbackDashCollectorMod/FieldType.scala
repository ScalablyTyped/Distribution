package typings.atAtlaskitFeedbackDashCollector.atAtlaskitFeedbackDashCollectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldType extends js.Object {
  var id: String
  var value: FieldValueType
}

object FieldType {
  @scala.inline
  def apply(id: String, value: FieldValueType): FieldType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldType]
  }
}

