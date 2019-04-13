package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultField extends js.Object {
  /**
    * The log event field.
    */
  var field: js.UndefOr[Field] = js.undefined
  /**
    * The value of this field.
    */
  var value: js.UndefOr[Value] = js.undefined
}

object ResultField {
  @scala.inline
  def apply(field: Field = null, value: Value = null): ResultField = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ResultField]
  }
}

