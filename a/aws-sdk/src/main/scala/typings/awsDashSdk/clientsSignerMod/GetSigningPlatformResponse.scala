package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSigningPlatformResponse extends js.Object {
  /**
    * The category type of the target signing platform.
    */
  var category: js.UndefOr[Category] = js.undefined
  /**
    * The display name of the target signing platform.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * The maximum size (in MB) of the payload that can be signed by the target platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined
  /**
    * A list of partner entities that use the target signing platform.
    */
  var partner: js.UndefOr[String] = js.undefined
  /**
    * The ID of the target signing platform.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  /**
    * A list of configurations applied to the target platform at signing.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined
  /**
    * The format of the target platform's signing image.
    */
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.undefined
}

object GetSigningPlatformResponse {
  @scala.inline
  def apply(
    category: Category = null,
    displayName: DisplayName = null,
    maxSizeInMB: Int | Double = null,
    partner: String = null,
    platformId: PlatformId = null,
    signingConfiguration: SigningConfiguration = null,
    signingImageFormat: SigningImageFormat = null,
    target: String = null
  ): GetSigningPlatformResponse = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (maxSizeInMB != null) __obj.updateDynamic("maxSizeInMB")(maxSizeInMB.asInstanceOf[js.Any])
    if (partner != null) __obj.updateDynamic("partner")(partner)
    if (platformId != null) __obj.updateDynamic("platformId")(platformId)
    if (signingConfiguration != null) __obj.updateDynamic("signingConfiguration")(signingConfiguration)
    if (signingImageFormat != null) __obj.updateDynamic("signingImageFormat")(signingImageFormat)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[GetSigningPlatformResponse]
  }
}

