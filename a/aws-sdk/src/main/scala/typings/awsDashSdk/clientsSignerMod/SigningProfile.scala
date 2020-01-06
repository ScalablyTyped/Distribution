package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningProfile extends js.Object {
  /**
    * Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.native
  /**
    * The ID of a platform that is available for use by a signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  /**
    * The ACM certificate that is available for use by a signing profile.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  /**
    * The parameters that are available for use by a code signing user.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  /**
    * The status of a code signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.native
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object SigningProfile {
  @scala.inline
  def apply(
    arn: java.lang.String = null,
    platformId: PlatformId = null,
    profileName: ProfileName = null,
    signingMaterial: SigningMaterial = null,
    signingParameters: SigningParameters = null,
    status: SigningProfileStatus = null,
    tags: TagMap = null
  ): SigningProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (platformId != null) __obj.updateDynamic("platformId")(platformId.asInstanceOf[js.Any])
    if (profileName != null) __obj.updateDynamic("profileName")(profileName.asInstanceOf[js.Any])
    if (signingMaterial != null) __obj.updateDynamic("signingMaterial")(signingMaterial.asInstanceOf[js.Any])
    if (signingParameters != null) __obj.updateDynamic("signingParameters")(signingParameters.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningProfile]
  }
}

