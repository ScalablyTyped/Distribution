package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainResponse extends js.Object {
  /**
    * The domain's authentication mode.
    */
  var AuthMode: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.AuthMode] = js.native
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CreationTime] = js.native
  /**
    * Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in a given UserProfile. 
    */
  var DefaultUserSettings: js.UndefOr[UserSettings] = js.native
  /**
    * The domain's Amazon Resource Name (ARN).
    */
  var DomainArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DomainArn] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DomainId] = js.native
  /**
    * The domain name.
    */
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DomainName] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.native
  /**
    * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
    */
  var HomeEfsFileSystemId: js.UndefOr[ResourceId] = js.native
  /**
    * The AWS Key Management Service encryption key ID.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LastModifiedTime] = js.native
  /**
    * The SSO managed application instance ID.
    */
  var SingleSignOnManagedApplicationInstanceId: js.UndefOr[String256] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[DomainStatus] = js.native
  /**
    * Security setting to limit to a set of subnets.
    */
  var SubnetIds: js.UndefOr[Subnets] = js.native
  /**
    * The domain's URL.
    */
  var Url: js.UndefOr[String1024] = js.native
  /**
    * The ID of the Amazon Virtual Private Cloud.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.VpcId] = js.native
}

object DescribeDomainResponse {
  @scala.inline
  def apply(
    AuthMode: AuthMode = null,
    CreationTime: CreationTime = null,
    DefaultUserSettings: UserSettings = null,
    DomainArn: DomainArn = null,
    DomainId: DomainId = null,
    DomainName: DomainName = null,
    FailureReason: FailureReason = null,
    HomeEfsFileSystemId: ResourceId = null,
    HomeEfsFileSystemKmsKeyId: KmsKeyId = null,
    LastModifiedTime: LastModifiedTime = null,
    SingleSignOnManagedApplicationInstanceId: String256 = null,
    Status: DomainStatus = null,
    SubnetIds: Subnets = null,
    Url: String1024 = null,
    VpcId: VpcId = null
  ): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (AuthMode != null) __obj.updateDynamic("AuthMode")(AuthMode.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DefaultUserSettings != null) __obj.updateDynamic("DefaultUserSettings")(DefaultUserSettings.asInstanceOf[js.Any])
    if (DomainArn != null) __obj.updateDynamic("DomainArn")(DomainArn.asInstanceOf[js.Any])
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (HomeEfsFileSystemId != null) __obj.updateDynamic("HomeEfsFileSystemId")(HomeEfsFileSystemId.asInstanceOf[js.Any])
    if (HomeEfsFileSystemKmsKeyId != null) __obj.updateDynamic("HomeEfsFileSystemKmsKeyId")(HomeEfsFileSystemKmsKeyId.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (SingleSignOnManagedApplicationInstanceId != null) __obj.updateDynamic("SingleSignOnManagedApplicationInstanceId")(SingleSignOnManagedApplicationInstanceId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainResponse]
  }
}

