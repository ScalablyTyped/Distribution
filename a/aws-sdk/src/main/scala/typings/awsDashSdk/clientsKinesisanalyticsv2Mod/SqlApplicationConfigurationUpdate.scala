package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlApplicationConfigurationUpdate extends js.Object {
  /**
    * The array of InputUpdate objects describing the new input streams used by the application.
    */
  var InputUpdates: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputUpdates] = js.undefined
  /**
    * The array of OutputUpdate objects describing the new destination streams used by the application.
    */
  var OutputUpdates: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.OutputUpdates] = js.undefined
  /**
    * The array of ReferenceDataSourceUpdate objects describing the new reference data sources used by the application.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ReferenceDataSourceUpdates] = js.undefined
}

object SqlApplicationConfigurationUpdate {
  @scala.inline
  def apply(
    InputUpdates: InputUpdates = null,
    OutputUpdates: OutputUpdates = null,
    ReferenceDataSourceUpdates: ReferenceDataSourceUpdates = null
  ): SqlApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (InputUpdates != null) __obj.updateDynamic("InputUpdates")(InputUpdates)
    if (OutputUpdates != null) __obj.updateDynamic("OutputUpdates")(OutputUpdates)
    if (ReferenceDataSourceUpdates != null) __obj.updateDynamic("ReferenceDataSourceUpdates")(ReferenceDataSourceUpdates)
    __obj.asInstanceOf[SqlApplicationConfigurationUpdate]
  }
}

