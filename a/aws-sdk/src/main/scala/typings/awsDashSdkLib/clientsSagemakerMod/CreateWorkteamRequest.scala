package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkteamRequest extends js.Object {
  /**
    * A description of the work team.
    */
  var Description: String200
  /**
    * A list of MemberDefinition objects that contains objects that identify the Amazon Cognito user pool that makes up the work team. For more information, see Amazon Cognito User Pools. All of the CognitoMemberDefinition objects that make up the member definition must have the same ClientId and UserPool values.
    */
  var MemberDefinitions: awsDashSdkLib.clientsSagemakerMod.MemberDefinitions
  /**
    * Configures notification of workers regarding available or expiring work items.
    */
  var NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The name of the work team. Use this name to identify the work team.
    */
  var WorkteamName: awsDashSdkLib.clientsSagemakerMod.WorkteamName
}

object CreateWorkteamRequest {
  @scala.inline
  def apply(
    Description: String200,
    MemberDefinitions: MemberDefinitions,
    WorkteamName: WorkteamName,
    NotificationConfiguration: NotificationConfiguration = null,
    Tags: TagList = null
  ): CreateWorkteamRequest = {
    val __obj = js.Dynamic.literal(Description = Description, MemberDefinitions = MemberDefinitions, WorkteamName = WorkteamName)
    if (NotificationConfiguration != null) __obj.updateDynamic("NotificationConfiguration")(NotificationConfiguration)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateWorkteamRequest]
  }
}

