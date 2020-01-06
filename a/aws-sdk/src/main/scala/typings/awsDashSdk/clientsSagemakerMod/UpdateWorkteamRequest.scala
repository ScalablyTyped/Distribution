package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkteamRequest extends js.Object {
  /**
    * An updated description for the work team.
    */
  var Description: js.UndefOr[String200] = js.native
  /**
    * A list of MemberDefinition objects that contain the updated work team members.
    */
  var MemberDefinitions: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MemberDefinitions] = js.native
  /**
    * Configures SNS topic notifications for available or expiring work items
    */
  var NotificationConfiguration: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NotificationConfiguration] = js.native
  /**
    * The name of the work team to update.
    */
  var WorkteamName: typings.awsDashSdk.clientsSagemakerMod.WorkteamName = js.native
}

object UpdateWorkteamRequest {
  @scala.inline
  def apply(
    WorkteamName: WorkteamName,
    Description: String200 = null,
    MemberDefinitions: MemberDefinitions = null,
    NotificationConfiguration: NotificationConfiguration = null
  ): UpdateWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (MemberDefinitions != null) __obj.updateDynamic("MemberDefinitions")(MemberDefinitions.asInstanceOf[js.Any])
    if (NotificationConfiguration != null) __obj.updateDynamic("NotificationConfiguration")(NotificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkteamRequest]
  }
}

