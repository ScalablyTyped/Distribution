package typings.apostrophe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: js.Array[String]
  var label: String
  var name: String
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[String], label: String, name: String): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

