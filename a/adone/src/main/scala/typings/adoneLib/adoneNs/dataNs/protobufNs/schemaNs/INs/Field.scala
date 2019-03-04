package typings
package adoneLib.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var map: adoneLib.Anon_From | scala.Null
  var name: java.lang.String | scala.Null
  var oneof: java.lang.String | scala.Null
  var options: js.Object
  var repeated: scala.Boolean
  var required: scala.Boolean
  var tag: scala.Double
  var `type`: java.lang.String | scala.Null
}

object Field {
  @scala.inline
  def apply(
    options: js.Object,
    repeated: scala.Boolean,
    required: scala.Boolean,
    tag: scala.Double,
    map: adoneLib.Anon_From = null,
    name: java.lang.String = null,
    oneof: java.lang.String = null,
    `type`: java.lang.String = null
  ): Field = {
    val __obj = js.Dynamic.literal(options = options, repeated = repeated, required = required, tag = tag)
    if (map != null) __obj.updateDynamic("map")(map)
    if (name != null) __obj.updateDynamic("name")(name)
    if (oneof != null) __obj.updateDynamic("oneof")(oneof)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Field]
  }
}

