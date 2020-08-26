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
  def apply(): DeveloperInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperInfo]
  }
  @scala.inline
  implicit class DeveloperInfoOps[Self <: DeveloperInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeveloperName(value: DeveloperName): Self = this.set("DeveloperName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperName: Self = this.set("DeveloperName", js.undefined)
    @scala.inline
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    @scala.inline
    def setPrivacyPolicy(value: PrivacyPolicy): Self = this.set("PrivacyPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivacyPolicy: Self = this.set("PrivacyPolicy", js.undefined)
    @scala.inline
    def setUrl(value: Url): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

