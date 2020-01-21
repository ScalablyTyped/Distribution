package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperInfo extends js.Object {
  /**
    * The name of the developer.
    */
  var DeveloperName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeveloperName] = js.native
  /**
    * The email of the developer.
    */
  var Email: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Email] = js.native
  /**
    * The URL of the privacy policy.
    */
  var PrivacyPolicy: js.UndefOr[typings.awsSdk.alexaforbusinessMod.PrivacyPolicy] = js.native
  /**
    * The website of the developer.
    */
  var Url: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Url] = js.native
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
    if (DeveloperName != null) __obj.updateDynamic("DeveloperName")(DeveloperName.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (PrivacyPolicy != null) __obj.updateDynamic("PrivacyPolicy")(PrivacyPolicy.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperInfo]
  }
}

