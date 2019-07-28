package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSigningProfileRequest extends js.Object {
  /**
    * A subfield of platform. This specifies any different configuration options that you want to apply to the chosen platform (such as a different hash-algorithm or signing-algorithm).
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
  /**
    * The ID of the signing profile to be created.
    */
  var platformId: PlatformId
  /**
    * The name of the signing profile to be created.
    */
  var profileName: ProfileName
  /**
    * The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
    */
  var signingMaterial: SigningMaterial
  /**
    * Map of key-value pairs for signing. These can include any information that you want to use during signing.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
}

object PutSigningProfileRequest {
  @scala.inline
  def apply(
    platformId: PlatformId,
    profileName: ProfileName,
    signingMaterial: SigningMaterial,
    overrides: SigningPlatformOverrides = null,
    signingParameters: SigningParameters = null
  ): PutSigningProfileRequest = {
    val __obj = js.Dynamic.literal(platformId = platformId, profileName = profileName, signingMaterial = signingMaterial)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (signingParameters != null) __obj.updateDynamic("signingParameters")(signingParameters)
    __obj.asInstanceOf[PutSigningProfileRequest]
  }
}

