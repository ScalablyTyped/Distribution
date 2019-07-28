package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingParameters extends js.Object {
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var CSVMappingParameters: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CSVMappingParameters] = js.undefined
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var JSONMappingParameters: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.JSONMappingParameters] = js.undefined
}

object MappingParameters {
  @scala.inline
  def apply(
    CSVMappingParameters: CSVMappingParameters = null,
    JSONMappingParameters: JSONMappingParameters = null
  ): MappingParameters = {
    val __obj = js.Dynamic.literal()
    if (CSVMappingParameters != null) __obj.updateDynamic("CSVMappingParameters")(CSVMappingParameters)
    if (JSONMappingParameters != null) __obj.updateDynamic("JSONMappingParameters")(JSONMappingParameters)
    __obj.asInstanceOf[MappingParameters]
  }
}

