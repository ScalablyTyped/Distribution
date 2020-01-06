package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  /**
    * The name of the field.
    */
  var name: js.UndefOr[FieldName] = js.native
  /**
    * The datatype of the field.
    */
  var `type`: js.UndefOr[FieldType] = js.native
}

object Field {
  @scala.inline
  def apply(name: FieldName = null, `type`: FieldType = null): Field = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

