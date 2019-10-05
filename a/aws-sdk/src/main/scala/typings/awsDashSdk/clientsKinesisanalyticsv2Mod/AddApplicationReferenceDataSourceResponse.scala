package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationReferenceDataSourceResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is updated.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  /**
    * Describes reference data sources configured for the application. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.undefined
}

object AddApplicationReferenceDataSourceResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: Int | Double = null,
    ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions = null
  ): AddApplicationReferenceDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN)
    if (ApplicationVersionId != null) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.asInstanceOf[js.Any])
    if (ReferenceDataSourceDescriptions != null) __obj.updateDynamic("ReferenceDataSourceDescriptions")(ReferenceDataSourceDescriptions)
    __obj.asInstanceOf[AddApplicationReferenceDataSourceResponse]
  }
}

