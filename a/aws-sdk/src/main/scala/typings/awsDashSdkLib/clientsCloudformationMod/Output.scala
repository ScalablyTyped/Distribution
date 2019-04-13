package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * User defined description associated with the output.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the export associated with the output.
    */
  var ExportName: js.UndefOr[ExportName] = js.undefined
  /**
    * The key associated with the output.
    */
  var OutputKey: js.UndefOr[OutputKey] = js.undefined
  /**
    * The value associated with the output.
    */
  var OutputValue: js.UndefOr[OutputValue] = js.undefined
}

object Output {
  @scala.inline
  def apply(
    Description: Description = null,
    ExportName: ExportName = null,
    OutputKey: OutputKey = null,
    OutputValue: OutputValue = null
  ): Output = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExportName != null) __obj.updateDynamic("ExportName")(ExportName)
    if (OutputKey != null) __obj.updateDynamic("OutputKey")(OutputKey)
    if (OutputValue != null) __obj.updateDynamic("OutputValue")(OutputValue)
    __obj.asInstanceOf[Output]
  }
}

