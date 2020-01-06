package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConformancePack extends js.Object {
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack template that is used to create a pack. 
    */
  var DeliveryS3Bucket: typings.awsDashSdk.clientsConfigserviceMod.DeliveryS3Bucket = js.native
  /**
    * Any folder structure you want to add to an Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * A comma-separated list of accounts excluded from organization conformance pack.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ExcludedAccounts] = js.native
  /**
    * Last time when organization conformation pack was updated.
    */
  var LastUpdateTime: _Date = js.native
  /**
    * Amazon Resource Name (ARN) of organization conformance pack.
    */
  var OrganizationConformancePackArn: StringWithCharLimit256 = js.native
  /**
    * The name you assign to an organization conformance pack.
    */
  var OrganizationConformancePackName: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConformancePackName = js.native
}

object OrganizationConformancePack {
  @scala.inline
  def apply(
    DeliveryS3Bucket: DeliveryS3Bucket,
    LastUpdateTime: _Date,
    OrganizationConformancePackArn: StringWithCharLimit256,
    OrganizationConformancePackName: OrganizationConformancePackName,
    ConformancePackInputParameters: ConformancePackInputParameters = null,
    DeliveryS3KeyPrefix: DeliveryS3KeyPrefix = null,
    ExcludedAccounts: ExcludedAccounts = null
  ): OrganizationConformancePack = {
    val __obj = js.Dynamic.literal(DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], OrganizationConformancePackArn = OrganizationConformancePackArn.asInstanceOf[js.Any], OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    if (ConformancePackInputParameters != null) __obj.updateDynamic("ConformancePackInputParameters")(ConformancePackInputParameters.asInstanceOf[js.Any])
    if (DeliveryS3KeyPrefix != null) __obj.updateDynamic("DeliveryS3KeyPrefix")(DeliveryS3KeyPrefix.asInstanceOf[js.Any])
    if (ExcludedAccounts != null) __obj.updateDynamic("ExcludedAccounts")(ExcludedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConformancePack]
  }
}

