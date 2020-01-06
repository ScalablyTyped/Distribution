package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningProfileResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.native
  /**
    * A list of overrides applied by the target signing profile for signing operations.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.native
  /**
    * The ID of the platform that is used by the target signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  /**
    * The name of the target signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  /**
    * The ARN of the certificate that the target profile uses for signing operations.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  /**
    * A map of key-value pairs for signing operations that is attached to the target signing profile.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  /**
    * The status of the target signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.native
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object GetSigningProfileResponse {
  @scala.inline
  def apply(
    arn: java.lang.String = null,
    overrides: SigningPlatformOverrides = null,
    platformId: PlatformId = null,
    profileName: ProfileName = null,
    signingMaterial: SigningMaterial = null,
    signingParameters: SigningParameters = null,
    status: SigningProfileStatus = null,
    tags: TagMap = null
  ): GetSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (platformId != null) __obj.updateDynamic("platformId")(platformId.asInstanceOf[js.Any])
    if (profileName != null) __obj.updateDynamic("profileName")(profileName.asInstanceOf[js.Any])
    if (signingMaterial != null) __obj.updateDynamic("signingMaterial")(signingMaterial.asInstanceOf[js.Any])
    if (signingParameters != null) __obj.updateDynamic("signingParameters")(signingParameters.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningProfileResponse]
  }
}

