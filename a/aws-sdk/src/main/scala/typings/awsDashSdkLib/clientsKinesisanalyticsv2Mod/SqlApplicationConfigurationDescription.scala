package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlApplicationConfigurationDescription extends js.Object {
  /**
    * The array of InputDescription objects describing the input streams used by the application.
    */
  var InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined
  /**
    * The array of OutputDescription objects describing the destination streams used by the application.
    */
  var OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined
  /**
    * The array of ReferenceDataSourceDescription objects describing the reference data sources used by the application.
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined
}

object SqlApplicationConfigurationDescription {
  @scala.inline
  def apply(
    InputDescriptions: InputDescriptions = null,
    OutputDescriptions: OutputDescriptions = null,
    ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions = null
  ): SqlApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (InputDescriptions != null) __obj.updateDynamic("InputDescriptions")(InputDescriptions)
    if (OutputDescriptions != null) __obj.updateDynamic("OutputDescriptions")(OutputDescriptions)
    if (ReferenceDataSourceDescriptions != null) __obj.updateDynamic("ReferenceDataSourceDescriptions")(ReferenceDataSourceDescriptions)
    __obj.asInstanceOf[SqlApplicationConfigurationDescription]
  }
}

