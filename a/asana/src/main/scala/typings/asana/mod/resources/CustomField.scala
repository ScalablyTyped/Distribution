package typings.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomField extends Resource {
  var enabled: Boolean = js.native
  var enum_options: js.Array[EnumValue] | Null = js.native
  var enum_value: EnumValue | Null = js.native
}

