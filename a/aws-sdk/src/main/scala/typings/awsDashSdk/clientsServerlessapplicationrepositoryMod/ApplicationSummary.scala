package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSummary extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: __string = js.native
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: __string = js.native
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[__string] = js.native
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: __string = js.native
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[__string] = js.native
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[__listOf__string] = js.native
  /**
    * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: __string = js.native
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[__string] = js.native
}

object ApplicationSummary {
  @scala.inline
  def apply(
    ApplicationId: __string,
    Author: __string,
    Description: __string,
    Name: __string,
    CreationTime: __string = null,
    HomePageUrl: __string = null,
    Labels: __listOf__string = null,
    SpdxLicenseId: __string = null
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (HomePageUrl != null) __obj.updateDynamic("HomePageUrl")(HomePageUrl.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (SpdxLicenseId != null) __obj.updateDynamic("SpdxLicenseId")(SpdxLicenseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
}

