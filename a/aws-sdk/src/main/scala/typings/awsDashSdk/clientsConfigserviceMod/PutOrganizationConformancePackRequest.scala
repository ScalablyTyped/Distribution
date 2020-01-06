package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConformancePackRequest extends js.Object {
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results. AWS Config stores intermediate files while processing conformance pack template.  The delivery bucket name should start with awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/ *". For more information, see Permissions for cross account bucket access.
    */
  var DeliveryS3Bucket: typings.awsDashSdk.clientsConfigserviceMod.DeliveryS3Bucket = js.native
  /**
    * The prefix for the Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * A list of AWS accounts to be excluded from an organization conformance pack while deploying a conformance pack.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ExcludedAccounts] = js.native
  /**
    * Name of the organization conformance pack you want to create.
    */
  var OrganizationConformancePackName: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConformancePackName = js.native
  /**
    * A string containing full conformance pack template body. Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes.
    */
  var TemplateBody: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.TemplateBody] = js.native
  /**
    * Location of file containing the template body. The uri must point to the conformance pack template (max size: 300 KB).  You must have access to read Amazon S3 bucket. 
    */
  var TemplateS3Uri: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.TemplateS3Uri] = js.native
}

object PutOrganizationConformancePackRequest {
  @scala.inline
  def apply(
    DeliveryS3Bucket: DeliveryS3Bucket,
    OrganizationConformancePackName: OrganizationConformancePackName,
    ConformancePackInputParameters: ConformancePackInputParameters = null,
    DeliveryS3KeyPrefix: DeliveryS3KeyPrefix = null,
    ExcludedAccounts: ExcludedAccounts = null,
    TemplateBody: TemplateBody = null,
    TemplateS3Uri: TemplateS3Uri = null
  ): PutOrganizationConformancePackRequest = {
    val __obj = js.Dynamic.literal(DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any], OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    if (ConformancePackInputParameters != null) __obj.updateDynamic("ConformancePackInputParameters")(ConformancePackInputParameters.asInstanceOf[js.Any])
    if (DeliveryS3KeyPrefix != null) __obj.updateDynamic("DeliveryS3KeyPrefix")(DeliveryS3KeyPrefix.asInstanceOf[js.Any])
    if (ExcludedAccounts != null) __obj.updateDynamic("ExcludedAccounts")(ExcludedAccounts.asInstanceOf[js.Any])
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody.asInstanceOf[js.Any])
    if (TemplateS3Uri != null) __obj.updateDynamic("TemplateS3Uri")(TemplateS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConformancePackRequest]
  }
}

