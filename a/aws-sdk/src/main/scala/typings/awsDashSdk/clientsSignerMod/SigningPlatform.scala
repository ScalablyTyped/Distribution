package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningPlatform extends js.Object {
  /**
    * The category of an AWS Signer platform.
    */
  var category: js.UndefOr[Category] = js.undefined
  /**
    * The display name of an AWS Signer platform.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The maximum size (in MB) of code that can be signed by a AWS Signer platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined
  /**
    * Any partner entities linked to an AWS Signer platform.
    */
  var partner: js.UndefOr[String] = js.undefined
  /**
    * The ID of an AWS Signer platform.
    */
  var platformId: js.UndefOr[String] = js.undefined
  /**
    * The configuration of an AWS Signer platform. This includes the designated hash algorithm and encryption algorithm of a signing platform.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined
  /**
    * The signing image format that is used by an AWS Signer platform.
    */
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined
  /**
    * The types of targets that can be signed by an AWS Signer platform.
    */
  var target: js.UndefOr[String] = js.undefined
}

object SigningPlatform {
  @scala.inline
  def apply(
    category: Category = null,
    displayName: String = null,
    maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined,
    partner: String = null,
    platformId: String = null,
    signingConfiguration: SigningConfiguration = null,
    signingImageFormat: SigningImageFormat = null,
    target: String = null
  ): SigningPlatform = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(maxSizeInMB)) __obj.updateDynamic("maxSizeInMB")(maxSizeInMB)
    if (partner != null) __obj.updateDynamic("partner")(partner)
    if (platformId != null) __obj.updateDynamic("platformId")(platformId)
    if (signingConfiguration != null) __obj.updateDynamic("signingConfiguration")(signingConfiguration)
    if (signingImageFormat != null) __obj.updateDynamic("signingImageFormat")(signingImageFormat)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[SigningPlatform]
  }
}

