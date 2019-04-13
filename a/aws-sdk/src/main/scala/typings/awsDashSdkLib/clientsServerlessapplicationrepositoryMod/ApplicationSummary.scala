package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSummary extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: __string
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: __string
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[__string] = js.undefined
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: __string
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[__string] = js.undefined
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: __string
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[__string] = js.undefined
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
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, Author = Author, Description = Description, Name = Name)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (HomePageUrl != null) __obj.updateDynamic("HomePageUrl")(HomePageUrl)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (SpdxLicenseId != null) __obj.updateDynamic("SpdxLicenseId")(SpdxLicenseId)
    __obj.asInstanceOf[ApplicationSummary]
  }
}

