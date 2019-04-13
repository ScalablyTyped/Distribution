package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterParameterGroupMessage extends js.Object {
  /**
    * A description of the parameter group.
    */
  var Description: String
  /**
    * The Amazon Redshift engine version to which the cluster parameter group applies. The cluster engine version determines the set of parameters. To get a list of valid parameter group family names, you can call DescribeClusterParameterGroups. By default, Amazon Redshift returns a list of all the parameter groups that are owned by your AWS account, including the default parameter groups for each Amazon Redshift engine version. The parameter group family names associated with the default parameter groups provide you the valid values. For example, a valid family name is "redshift-1.0". 
    */
  var ParameterGroupFamily: String
  /**
    * The name of the cluster parameter group. Constraints:   Must be 1 to 255 alphanumeric characters or hyphens   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique withing your AWS account.    This value is stored as a lower-case string. 
    */
  var ParameterGroupName: String
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateClusterParameterGroupMessage {
  @scala.inline
  def apply(
    Description: String,
    ParameterGroupFamily: String,
    ParameterGroupName: String,
    Tags: TagList = null
  ): CreateClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(Description = Description, ParameterGroupFamily = ParameterGroupFamily, ParameterGroupName = ParameterGroupName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateClusterParameterGroupMessage]
  }
}

