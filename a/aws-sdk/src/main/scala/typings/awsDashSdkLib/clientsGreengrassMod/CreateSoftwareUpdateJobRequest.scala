package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSoftwareUpdateJobRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  var S3UrlSignerRole: js.UndefOr[S3UrlSignerRole] = js.undefined
  var SoftwareToUpdate: js.UndefOr[SoftwareToUpdate] = js.undefined
  var UpdateAgentLogLevel: js.UndefOr[UpdateAgentLogLevel] = js.undefined
  var UpdateTargets: js.UndefOr[UpdateTargets] = js.undefined
  var UpdateTargetsArchitecture: js.UndefOr[UpdateTargetsArchitecture] = js.undefined
  var UpdateTargetsOperatingSystem: js.UndefOr[UpdateTargetsOperatingSystem] = js.undefined
}

object CreateSoftwareUpdateJobRequest {
  @scala.inline
  def apply(
    AmznClientToken: __string = null,
    S3UrlSignerRole: S3UrlSignerRole = null,
    SoftwareToUpdate: SoftwareToUpdate = null,
    UpdateAgentLogLevel: UpdateAgentLogLevel = null,
    UpdateTargets: UpdateTargets = null,
    UpdateTargetsArchitecture: UpdateTargetsArchitecture = null,
    UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem = null
  ): CreateSoftwareUpdateJobRequest = {
    val __obj = js.Dynamic.literal()
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (S3UrlSignerRole != null) __obj.updateDynamic("S3UrlSignerRole")(S3UrlSignerRole)
    if (SoftwareToUpdate != null) __obj.updateDynamic("SoftwareToUpdate")(SoftwareToUpdate.asInstanceOf[js.Any])
    if (UpdateAgentLogLevel != null) __obj.updateDynamic("UpdateAgentLogLevel")(UpdateAgentLogLevel.asInstanceOf[js.Any])
    if (UpdateTargets != null) __obj.updateDynamic("UpdateTargets")(UpdateTargets)
    if (UpdateTargetsArchitecture != null) __obj.updateDynamic("UpdateTargetsArchitecture")(UpdateTargetsArchitecture.asInstanceOf[js.Any])
    if (UpdateTargetsOperatingSystem != null) __obj.updateDynamic("UpdateTargetsOperatingSystem")(UpdateTargetsOperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
  }
}

