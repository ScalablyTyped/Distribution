package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordOutput extends js.Object {
  /**
    * The description of the output.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The output key.
    */
  var OutputKey: js.UndefOr[OutputKey] = js.undefined
  /**
    * The output value.
    */
  var OutputValue: js.UndefOr[OutputValue] = js.undefined
}

object RecordOutput {
  @scala.inline
  def apply(Description: Description = null, OutputKey: OutputKey = null, OutputValue: OutputValue = null): RecordOutput = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (OutputKey != null) __obj.updateDynamic("OutputKey")(OutputKey)
    if (OutputValue != null) __obj.updateDynamic("OutputValue")(OutputValue)
    __obj.asInstanceOf[RecordOutput]
  }
}

