package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSigningProfileResponse extends js.Object {
  /**
    * A list of overrides applied by the target signing profile for signing operations.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
  /**
    * The ID of the platform that is used by the target signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  /**
    * The name of the target signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  /**
    * The ARN of the certificate that the target profile uses for signing operations.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  /**
    * A map of key-value pairs for signing operations that is attached to the target signing profile.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  /**
    * The status of the target signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.undefined
}

object GetSigningProfileResponse {
  @scala.inline
  def apply(
    overrides: SigningPlatformOverrides = null,
    platformId: PlatformId = null,
    profileName: ProfileName = null,
    signingMaterial: SigningMaterial = null,
    signingParameters: SigningParameters = null,
    status: SigningProfileStatus = null
  ): GetSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (platformId != null) __obj.updateDynamic("platformId")(platformId)
    if (profileName != null) __obj.updateDynamic("profileName")(profileName)
    if (signingMaterial != null) __obj.updateDynamic("signingMaterial")(signingMaterial)
    if (signingParameters != null) __obj.updateDynamic("signingParameters")(signingParameters)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningProfileResponse]
  }
}

