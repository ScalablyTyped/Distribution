package typings.awsDashSdk.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDefinition extends js.Object {
  /**
    * A list of manifests that you want Amazon Web Services to create for this report.
    */
  var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.native
  /**
    * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as individual resource IDs. 
    */
  var AdditionalSchemaElements: SchemaElementList = js.native
  var Compression: CompressionFormat = js.native
  var Format: ReportFormat = js.native
  /**
    * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services detects charges related to previous months. These charges can include refunds, credits, or support fees.
    */
  var RefreshClosedReports: js.UndefOr[typings.awsDashSdk.clientsCurMod.RefreshClosedReports] = js.native
  var ReportName: typings.awsDashSdk.clientsCurMod.ReportName = js.native
  /**
    * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in addition to the previous versions.
    */
  var ReportVersioning: js.UndefOr[typings.awsDashSdk.clientsCurMod.ReportVersioning] = js.native
  var S3Bucket: typings.awsDashSdk.clientsCurMod.S3Bucket = js.native
  var S3Prefix: typings.awsDashSdk.clientsCurMod.S3Prefix = js.native
  var S3Region: AWSRegion = js.native
  var TimeUnit: typings.awsDashSdk.clientsCurMod.TimeUnit = js.native
}

object ReportDefinition {
  @scala.inline
  def apply(
    AdditionalSchemaElements: SchemaElementList,
    Compression: CompressionFormat,
    Format: ReportFormat,
    ReportName: ReportName,
    S3Bucket: S3Bucket,
    S3Prefix: S3Prefix,
    S3Region: AWSRegion,
    TimeUnit: TimeUnit,
    AdditionalArtifacts: AdditionalArtifactList = null,
    RefreshClosedReports: js.UndefOr[Boolean] = js.undefined,
    ReportVersioning: ReportVersioning = null
  ): ReportDefinition = {
    val __obj = js.Dynamic.literal(AdditionalSchemaElements = AdditionalSchemaElements.asInstanceOf[js.Any], Compression = Compression.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ReportName = ReportName.asInstanceOf[js.Any], S3Bucket = S3Bucket.asInstanceOf[js.Any], S3Prefix = S3Prefix.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
    if (AdditionalArtifacts != null) __obj.updateDynamic("AdditionalArtifacts")(AdditionalArtifacts.asInstanceOf[js.Any])
    if (!js.isUndefined(RefreshClosedReports)) __obj.updateDynamic("RefreshClosedReports")(RefreshClosedReports.asInstanceOf[js.Any])
    if (ReportVersioning != null) __obj.updateDynamic("ReportVersioning")(ReportVersioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDefinition]
  }
}

