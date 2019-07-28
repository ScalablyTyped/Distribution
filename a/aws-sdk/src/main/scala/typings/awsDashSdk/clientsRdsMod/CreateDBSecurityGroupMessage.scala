package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBSecurityGroupMessage extends js.Object {
  /**
    * The description for the DB security group.
    */
  var DBSecurityGroupDescription: String
  /**
    * The name for the DB security group. This value is stored as a lowercase string. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Must not be "Default"   Example: mysecuritygroup 
    */
  var DBSecurityGroupName: String
  /**
    * Tags to assign to the DB security group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateDBSecurityGroupMessage {
  @scala.inline
  def apply(DBSecurityGroupDescription: String, DBSecurityGroupName: String, Tags: TagList = null): CreateDBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupDescription = DBSecurityGroupDescription, DBSecurityGroupName = DBSecurityGroupName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateDBSecurityGroupMessage]
  }
}

