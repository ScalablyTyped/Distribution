package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperInfo extends js.Object {
  /**
    * The name of the developer.
    */
  var DeveloperName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.DeveloperName] = js.undefined
  /**
    * The email of the developer.
    */
  var Email: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Email] = js.undefined
  /**
    * The URL of the privacy policy.
    */
  var PrivacyPolicy: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.PrivacyPolicy] = js.undefined
  /**
    * The website of the developer.
    */
  var Url: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Url] = js.undefined
}

object DeveloperInfo {
  @scala.inline
  def apply(
    DeveloperName: DeveloperName = null,
    Email: Email = null,
    PrivacyPolicy: PrivacyPolicy = null,
    Url: Url = null
  ): DeveloperInfo = {
    val __obj = js.Dynamic.literal()
    if (DeveloperName != null) __obj.updateDynamic("DeveloperName")(DeveloperName)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (PrivacyPolicy != null) __obj.updateDynamic("PrivacyPolicy")(PrivacyPolicy)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[DeveloperInfo]
  }
}

