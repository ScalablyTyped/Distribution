package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceDetails extends js.Object {
  /**
    * The availability zone of the EC2 instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The profile information of the EC2 instance.
    */
  var IamInstanceProfile: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.IamInstanceProfile] = js.native
  /**
    * The image description of the EC2 instance.
    */
  var ImageDescription: js.UndefOr[String] = js.native
  /**
    * The image ID of the EC2 instance.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The ID of the EC2 instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The state of the EC2 instance.
    */
  var InstanceState: js.UndefOr[String] = js.native
  /**
    * The type of the EC2 instance.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The launch time of the EC2 instance.
    */
  var LaunchTime: js.UndefOr[String] = js.native
  /**
    * The network interface information of the EC2 instance.
    */
  var NetworkInterfaces: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.NetworkInterfaces] = js.native
  /**
    * The platform of the EC2 instance.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The product code of the EC2 instance.
    */
  var ProductCodes: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.ProductCodes] = js.native
  /**
    * The tags of the EC2 instance.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Tags] = js.native
}

object InstanceDetails {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    IamInstanceProfile: IamInstanceProfile = null,
    ImageDescription: String = null,
    ImageId: String = null,
    InstanceId: String = null,
    InstanceState: String = null,
    InstanceType: String = null,
    LaunchTime: String = null,
    NetworkInterfaces: NetworkInterfaces = null,
    Platform: String = null,
    ProductCodes: ProductCodes = null,
    Tags: Tags = null
  ): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile.asInstanceOf[js.Any])
    if (ImageDescription != null) __obj.updateDynamic("ImageDescription")(ImageDescription.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceState != null) __obj.updateDynamic("InstanceState")(InstanceState.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LaunchTime != null) __obj.updateDynamic("LaunchTime")(LaunchTime.asInstanceOf[js.Any])
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceDetails]
  }
}

