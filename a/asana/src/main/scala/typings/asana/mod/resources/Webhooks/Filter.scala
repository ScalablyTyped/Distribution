package typings.asana.mod.resources.Webhooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var action: String
  var fields: js.Array[String]
  var resource_subtype: String
  var resource_type: String
}

object Filter {
  @scala.inline
  def apply(action: String, fields: js.Array[String], resource_subtype: String, resource_type: String): Filter = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

