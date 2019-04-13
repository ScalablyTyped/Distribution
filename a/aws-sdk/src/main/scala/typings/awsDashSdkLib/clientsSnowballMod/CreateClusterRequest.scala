package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterRequest extends js.Object {
  /**
    * The ID for the address that you want the cluster shipped to.
    */
  var AddressId: awsDashSdkLib.clientsSnowballMod.AddressId
  /**
    * An optional description of this specific cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The forwarding address ID for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: awsDashSdkLib.clientsSnowballMod.JobType
  /**
    * The KmsKeyARN value that you want to associate with this cluster. KmsKeyARN values are created by using the CreateKey API action in AWS Key Management Service (AWS KMS). 
    */
  var KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[Notification] = js.undefined
  /**
    * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda functions written in the Python language. 
    */
  var Resources: JobResource
  /**
    * The RoleARN that you want to associate with this cluster. RoleArn values are created by using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: awsDashSdkLib.clientsSnowballMod.RoleARN
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, devices are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: awsDashSdkLib.clientsSnowballMod.ShippingOption
  /**
    * The type of AWS Snowball device to use for this cluster. The only supported device types for cluster jobs are EDGE, EDGE_C, and EDGE_CG.
    */
  var SnowballType: js.UndefOr[SnowballType] = js.undefined
}

object CreateClusterRequest {
  @scala.inline
  def apply(
    AddressId: AddressId,
    JobType: JobType,
    Resources: JobResource,
    RoleARN: RoleARN,
    ShippingOption: ShippingOption,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    KmsKeyARN: KmsKeyARN = null,
    Notification: Notification = null,
    SnowballType: SnowballType = null
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId, JobType = JobType.asInstanceOf[js.Any], Resources = Resources, RoleARN = RoleARN, ShippingOption = ShippingOption.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId)
    if (KmsKeyARN != null) __obj.updateDynamic("KmsKeyARN")(KmsKeyARN)
    if (Notification != null) __obj.updateDynamic("Notification")(Notification)
    if (SnowballType != null) __obj.updateDynamic("SnowballType")(SnowballType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

