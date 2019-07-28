package typings.adone.adoneNs.dataNs.protobufNs.schemaNs.INs

import typings.adone.Anon_From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var map: Anon_From | Null
  var name: String | Null
  var oneof: String | Null
  var options: js.Object
  var repeated: Boolean
  var required: Boolean
  var tag: Double
  var `type`: String | Null
}

object Field {
  @scala.inline
  def apply(
    options: js.Object,
    repeated: Boolean,
    required: Boolean,
    tag: Double,
    map: Anon_From = null,
    name: String = null,
    oneof: String = null,
    `type`: String = null
  ): Field = {
    val __obj = js.Dynamic.literal(options = options, repeated = repeated, required = required, tag = tag)
    if (map != null) __obj.updateDynamic("map")(map)
    if (name != null) __obj.updateDynamic("name")(name)
    if (oneof != null) __obj.updateDynamic("oneof")(oneof)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Field]
  }
}

