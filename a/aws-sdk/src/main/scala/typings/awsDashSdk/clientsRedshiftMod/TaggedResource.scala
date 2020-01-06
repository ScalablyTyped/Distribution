package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) with which the tag is associated, for example: arn:aws:redshift:us-east-1:123456789:cluster:t1.
    */
  var ResourceName: js.UndefOr[String] = js.native
  /**
    * The type of resource with which the tag is associated. Valid resource types are:    Cluster   CIDR/IP   EC2 security group   Snapshot   Cluster security group   Subnet group   HSM connection   HSM certificate   Parameter group   For more information about Amazon Redshift resource types and constructing ARNs, go to Constructing an Amazon Redshift Amazon Resource Name (ARN) in the Amazon Redshift Cluster Management Guide. 
    */
  var ResourceType: js.UndefOr[String] = js.native
  /**
    * The tag for the resource.
    */
  var Tag: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.Tag] = js.native
}

object TaggedResource {
  @scala.inline
  def apply(ResourceName: String = null, ResourceType: String = null, Tag: Tag = null): TaggedResource = {
    val __obj = js.Dynamic.literal()
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedResource]
  }
}

