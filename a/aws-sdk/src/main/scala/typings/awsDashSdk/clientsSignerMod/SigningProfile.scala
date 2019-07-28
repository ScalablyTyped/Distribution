package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningProfile extends js.Object {
  /**
    * The ID of a platform that is available for use by a signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  /**
    * The name of the AWS Signer profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  /**
    * The ACM certificate that is available for use by a signing profile.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  /**
    * The parameters that are available for use by an AWS Signer user.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  /**
    * The status of an AWS Signer profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.undefined
}

object SigningProfile {
  @scala.inline
  def apply(
    platformId: PlatformId = null,
    profileName: ProfileName = null,
    signingMaterial: SigningMaterial = null,
    signingParameters: SigningParameters = null,
    status: SigningProfileStatus = null
  ): SigningProfile = {
    val __obj = js.Dynamic.literal()
    if (platformId != null) __obj.updateDynamic("platformId")(platformId)
    if (profileName != null) __obj.updateDynamic("profileName")(profileName)
    if (signingMaterial != null) __obj.updateDynamic("signingMaterial")(signingMaterial)
    if (signingParameters != null) __obj.updateDynamic("signingParameters")(signingParameters)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningProfile]
  }
}

