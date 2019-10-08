package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMetadata extends js.Object {
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.AddressId] = js.undefined
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[String] = js.undefined
  /**
    * The current status of the cluster.
    */
  var ClusterState: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.ClusterState] = js.undefined
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The optional description of the cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the address that you want a cluster shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.JobType] = js.undefined
  /**
    * The KmsKeyARN Amazon Resource Name (ARN) associated with this cluster. This ARN was created using the CreateKey API action in AWS Key Management Service (AWS KMS).
    */
  var KmsKeyARN: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.KmsKeyARN] = js.undefined
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.Notification] = js.undefined
  /**
    * The arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.undefined
  /**
    * The role ARN associated with this cluster. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.RoleARN] = js.undefined
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowball Edges are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.ShippingOption] = js.undefined
  /**
    * The type of AWS Snowball device to use for this cluster. Currently, the only supported device type for cluster jobs is EDGE.
    */
  var SnowballType: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.SnowballType] = js.undefined
}

object ClusterMetadata {
  @scala.inline
  def apply(
    AddressId: AddressId = null,
    ClusterId: String = null,
    ClusterState: ClusterState = null,
    CreationDate: Timestamp = null,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    JobType: JobType = null,
    KmsKeyARN: KmsKeyARN = null,
    Notification: Notification = null,
    Resources: JobResource = null,
    RoleARN: RoleARN = null,
    ShippingOption: ShippingOption = null,
    SnowballType: SnowballType = null
  ): ClusterMetadata = {
    val __obj = js.Dynamic.literal()
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId)
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (ClusterState != null) __obj.updateDynamic("ClusterState")(ClusterState.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId)
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (KmsKeyARN != null) __obj.updateDynamic("KmsKeyARN")(KmsKeyARN)
    if (Notification != null) __obj.updateDynamic("Notification")(Notification)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (ShippingOption != null) __obj.updateDynamic("ShippingOption")(ShippingOption.asInstanceOf[js.Any])
    if (SnowballType != null) __obj.updateDynamic("SnowballType")(SnowballType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMetadata]
  }
}

