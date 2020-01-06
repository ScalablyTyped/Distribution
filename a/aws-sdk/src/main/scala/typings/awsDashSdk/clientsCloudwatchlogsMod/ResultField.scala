package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultField extends js.Object {
  /**
    * The log event field.
    */
  var field: js.UndefOr[Field] = js.native
  /**
    * The value of this field.
    */
  var value: js.UndefOr[Value] = js.native
}

object ResultField {
  @scala.inline
  def apply(field: Field = null, value: Value = null): ResultField = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultField]
  }
}

