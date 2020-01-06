package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBParameterGroupMessage extends js.Object {
  /**
    * The DB parameter group family name. A DB parameter group can be associated with one and only one DB parameter group family, and can be applied only to a DB instance running a database engine and engine version compatible with that DB parameter group family. To list all of the available parameter group families, use the following command:  aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"   The output contains duplicates. 
    */
  var DBParameterGroupFamily: String = js.native
  /**
    * The name of the DB parameter group. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens    This value is stored as a lowercase string. 
    */
  var DBParameterGroupName: String = js.native
  /**
    * The description for the DB parameter group.
    */
  var Description: String = js.native
  /**
    * Tags to assign to the DB parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBParameterGroupMessage {
  @scala.inline
  def apply(
    DBParameterGroupFamily: String,
    DBParameterGroupName: String,
    Description: String,
    Tags: TagList = null
  ): CreateDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupFamily = DBParameterGroupFamily.asInstanceOf[js.Any], DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBParameterGroupMessage]
  }
}

