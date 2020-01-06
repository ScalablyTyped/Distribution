package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointResult extends js.Object {
  /**
    * The name of the bucket associated with the specified access point.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * The date and time when the specified access point was created.
    */
  var CreationDate: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.CreationDate] = js.native
  /**
    * The name of the specified access point.
    */
  var Name: js.UndefOr[AccessPointName] = js.native
  /**
    * Indicates whether this access point allows access from the public Internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public Internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public Internet, subject to the access point and bucket access policies.
    */
  var NetworkOrigin: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.NetworkOrigin] = js.native
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.PublicAccessBlockConfiguration] = js.native
  /**
    * Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
    */
  var VpcConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.VpcConfiguration] = js.native
}

object GetAccessPointResult {
  @scala.inline
  def apply(
    Bucket: BucketName = null,
    CreationDate: CreationDate = null,
    Name: AccessPointName = null,
    NetworkOrigin: NetworkOrigin = null,
    PublicAccessBlockConfiguration: PublicAccessBlockConfiguration = null,
    VpcConfiguration: VpcConfiguration = null
  ): GetAccessPointResult = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NetworkOrigin != null) __obj.updateDynamic("NetworkOrigin")(NetworkOrigin.asInstanceOf[js.Any])
    if (PublicAccessBlockConfiguration != null) __obj.updateDynamic("PublicAccessBlockConfiguration")(PublicAccessBlockConfiguration.asInstanceOf[js.Any])
    if (VpcConfiguration != null) __obj.updateDynamic("VpcConfiguration")(VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointResult]
  }
}

