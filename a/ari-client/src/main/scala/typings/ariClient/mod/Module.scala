package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var description: String
  /* Properties */
  var name: String
  var status: String
  var support_level: String
  var use_count: Double
}

object Module {
  @scala.inline
  def apply(description: String, name: String, status: String, support_level: String, use_count: Double): Module = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], support_level = support_level.asInstanceOf[js.Any], use_count = use_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

