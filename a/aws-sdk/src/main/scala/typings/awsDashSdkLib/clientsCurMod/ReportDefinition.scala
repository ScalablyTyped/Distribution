package typings
package awsDashSdkLib.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDefinition extends js.Object {
  /**
    * A list of manifests that you want Amazon Web Services to create for this report.
    */
  var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.undefined
  /**
    * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as individual resource IDs. 
    */
  var AdditionalSchemaElements: SchemaElementList
  var Compression: CompressionFormat
  var Format: ReportFormat
  /**
    * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services detects charges related to previous months. These charges can include refunds, credits, or support fees.
    */
  var RefreshClosedReports: js.UndefOr[RefreshClosedReports] = js.undefined
  var ReportName: awsDashSdkLib.clientsCurMod.ReportName
  /**
    * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in addition to the previous versions.
    */
  var ReportVersioning: js.UndefOr[ReportVersioning] = js.undefined
  var S3Bucket: awsDashSdkLib.clientsCurMod.S3Bucket
  var S3Prefix: awsDashSdkLib.clientsCurMod.S3Prefix
  var S3Region: AWSRegion
  var TimeUnit: awsDashSdkLib.clientsCurMod.TimeUnit
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
    RefreshClosedReports: js.UndefOr[RefreshClosedReports] = js.undefined,
    ReportVersioning: ReportVersioning = null
  ): ReportDefinition = {
    val __obj = js.Dynamic.literal(AdditionalSchemaElements = AdditionalSchemaElements, Compression = Compression.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ReportName = ReportName, S3Bucket = S3Bucket, S3Prefix = S3Prefix, S3Region = S3Region.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
    if (AdditionalArtifacts != null) __obj.updateDynamic("AdditionalArtifacts")(AdditionalArtifacts)
    if (!js.isUndefined(RefreshClosedReports)) __obj.updateDynamic("RefreshClosedReports")(RefreshClosedReports)
    if (ReportVersioning != null) __obj.updateDynamic("ReportVersioning")(ReportVersioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDefinition]
  }
}

