package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkteamRequest extends js.Object {
  /**
    * An updated description for the work team.
    */
  var Description: js.UndefOr[String200] = js.undefined
  /**
    * A list of MemberDefinition objects that contain the updated work team members.
    */
  var MemberDefinitions: js.UndefOr[MemberDefinitions] = js.undefined
  /**
    * Configures SNS topic notifications for available or expiring work items
    */
  var NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
  /**
    * The name of the work team to update.
    */
  var WorkteamName: awsDashSdkLib.clientsSagemakerMod.WorkteamName
}

object UpdateWorkteamRequest {
  @scala.inline
  def apply(
    WorkteamName: WorkteamName,
    Description: String200 = null,
    MemberDefinitions: MemberDefinitions = null,
    NotificationConfiguration: NotificationConfiguration = null
  ): UpdateWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (MemberDefinitions != null) __obj.updateDynamic("MemberDefinitions")(MemberDefinitions)
    if (NotificationConfiguration != null) __obj.updateDynamic("NotificationConfiguration")(NotificationConfiguration)
    __obj.asInstanceOf[UpdateWorkteamRequest]
  }
}

