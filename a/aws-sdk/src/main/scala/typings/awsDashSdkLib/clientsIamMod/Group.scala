package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the group. For more information about ARNs and how to use them in policies, see IAM Identifiers in the Using IAM guide. 
    */
  var Arn: arnType
  /**
    * The date and time, in ISO 8601 date-time format, when the group was created.
    */
  var CreateDate: dateType
  /**
    *  The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the Using IAM guide. 
    */
  var GroupId: idType
  /**
    * The friendly name that identifies the group.
    */
  var GroupName: groupNameType
  /**
    * The path to the group. For more information about paths, see IAM Identifiers in the Using IAM guide. 
    */
  var Path: pathType
}

object Group {
  @scala.inline
  def apply(Arn: arnType, CreateDate: dateType, GroupId: idType, GroupName: groupNameType, Path: pathType): Group = {
    val __obj = js.Dynamic.literal(Arn = Arn, CreateDate = CreateDate, GroupId = GroupId, GroupName = GroupName, Path = Path)
  
    __obj.asInstanceOf[Group]
  }
}

