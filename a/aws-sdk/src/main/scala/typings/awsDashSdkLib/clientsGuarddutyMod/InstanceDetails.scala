package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceDetails extends js.Object {
  /**
    * The availability zone of the EC2 instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The profile information of the EC2 instance.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined
  /**
    * The image description of the EC2 instance.
    */
  var ImageDescription: js.UndefOr[String] = js.undefined
  /**
    * The image ID of the EC2 instance.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the EC2 instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The state of the EC2 instance.
    */
  var InstanceState: js.UndefOr[String] = js.undefined
  /**
    * The type of the EC2 instance.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The launch time of the EC2 instance.
    */
  var LaunchTime: js.UndefOr[String] = js.undefined
  /**
    * The network interface information of the EC2 instance.
    */
  var NetworkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  /**
    * The platform of the EC2 instance.
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * The product code of the EC2 instance.
    */
  var ProductCodes: js.UndefOr[ProductCodes] = js.undefined
  /**
    * The tags of the EC2 instance.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
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
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (ImageDescription != null) __obj.updateDynamic("ImageDescription")(ImageDescription)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceState != null) __obj.updateDynamic("InstanceState")(InstanceState)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (LaunchTime != null) __obj.updateDynamic("LaunchTime")(LaunchTime)
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[InstanceDetails]
  }
}

