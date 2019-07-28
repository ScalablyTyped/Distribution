package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterSubnetGroupMessage extends js.Object {
  /**
    * The name for the subnet group. Amazon Redshift stores the value as a lowercase string. Constraints:   Must contain no more than 255 alphanumeric characters or hyphens.   Must not be "Default".   Must be unique for all subnet groups that are created by your AWS account.   Example: examplesubnetgroup 
    */
  var ClusterSubnetGroupName: String
  /**
    * A description for the subnet group.
    */
  var Description: String
  /**
    * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
    */
  var SubnetIds: SubnetIdentifierList
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateClusterSubnetGroupMessage {
  @scala.inline
  def apply(
    ClusterSubnetGroupName: String,
    Description: String,
    SubnetIds: SubnetIdentifierList,
    Tags: TagList = null
  ): CreateClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName, Description = Description, SubnetIds = SubnetIds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateClusterSubnetGroupMessage]
  }
}

