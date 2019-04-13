package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationUpdate extends js.Object {
  /**
    * Describes application code updates.
    */
  var ApplicationCodeUpdate: js.UndefOr[ApplicationCode] = js.undefined
  /**
    * Describes application CloudWatch logging option updates.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined
  /**
    * Describes application input configuration updates.
    */
  var InputUpdates: js.UndefOr[InputUpdates] = js.undefined
  /**
    * Describes application output configuration updates.
    */
  var OutputUpdates: js.UndefOr[OutputUpdates] = js.undefined
  /**
    * Describes application reference data source updates.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates] = js.undefined
}

object ApplicationUpdate {
  @scala.inline
  def apply(
    ApplicationCodeUpdate: ApplicationCode = null,
    CloudWatchLoggingOptionUpdates: CloudWatchLoggingOptionUpdates = null,
    InputUpdates: InputUpdates = null,
    OutputUpdates: OutputUpdates = null,
    ReferenceDataSourceUpdates: ReferenceDataSourceUpdates = null
  ): ApplicationUpdate = {
    val __obj = js.Dynamic.literal()
    if (ApplicationCodeUpdate != null) __obj.updateDynamic("ApplicationCodeUpdate")(ApplicationCodeUpdate)
    if (CloudWatchLoggingOptionUpdates != null) __obj.updateDynamic("CloudWatchLoggingOptionUpdates")(CloudWatchLoggingOptionUpdates)
    if (InputUpdates != null) __obj.updateDynamic("InputUpdates")(InputUpdates)
    if (OutputUpdates != null) __obj.updateDynamic("OutputUpdates")(OutputUpdates)
    if (ReferenceDataSourceUpdates != null) __obj.updateDynamic("ReferenceDataSourceUpdates")(ReferenceDataSourceUpdates)
    __obj.asInstanceOf[ApplicationUpdate]
  }
}

