package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSoftwareUpdateJobRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  var S3UrlSignerRole: typings.awsDashSdk.clientsGreengrassMod.S3UrlSignerRole
  var SoftwareToUpdate: typings.awsDashSdk.clientsGreengrassMod.SoftwareToUpdate
  var UpdateAgentLogLevel: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.UpdateAgentLogLevel] = js.undefined
  var UpdateTargets: typings.awsDashSdk.clientsGreengrassMod.UpdateTargets
  var UpdateTargetsArchitecture: typings.awsDashSdk.clientsGreengrassMod.UpdateTargetsArchitecture
  var UpdateTargetsOperatingSystem: typings.awsDashSdk.clientsGreengrassMod.UpdateTargetsOperatingSystem
}

object CreateSoftwareUpdateJobRequest {
  @scala.inline
  def apply(
    S3UrlSignerRole: S3UrlSignerRole,
    SoftwareToUpdate: SoftwareToUpdate,
    UpdateTargets: UpdateTargets,
    UpdateTargetsArchitecture: UpdateTargetsArchitecture,
    UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem,
    AmznClientToken: __string = null,
    UpdateAgentLogLevel: UpdateAgentLogLevel = null
  ): CreateSoftwareUpdateJobRequest = {
    val __obj = js.Dynamic.literal(S3UrlSignerRole = S3UrlSignerRole, SoftwareToUpdate = SoftwareToUpdate.asInstanceOf[js.Any], UpdateTargets = UpdateTargets, UpdateTargetsArchitecture = UpdateTargetsArchitecture.asInstanceOf[js.Any], UpdateTargetsOperatingSystem = UpdateTargetsOperatingSystem.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (UpdateAgentLogLevel != null) __obj.updateDynamic("UpdateAgentLogLevel")(UpdateAgentLogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
  }
}

