package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.Array[java.lang.String]
  var label: java.lang.String
  var name: java.lang.String
}

object Anon_Fields {
  @scala.inline
  def apply(fields: js.Array[java.lang.String], label: java.lang.String, name: java.lang.String): Anon_Fields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Fields]
  }
}

