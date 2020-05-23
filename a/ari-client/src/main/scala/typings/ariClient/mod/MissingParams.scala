package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingParams extends Message {
  /* Properties */
  var params: String | js.Array[String]
}

object MissingParams {
  @scala.inline
  def apply(params: String | js.Array[String], `type`: String, asterisk_id: String = null): MissingParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingParams]
  }
}

