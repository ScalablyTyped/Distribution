package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: js.UndefOr[__string] = js.undefined
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[__string] = js.undefined
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[__string] = js.undefined
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[__listOf__string] = js.undefined
  /**
    * A link to a license file of the app that matches the spdxLicenseID value of your application.Maximum size 5 MB
    */
  var LicenseUrl: js.UndefOr[__string] = js.undefined
  /**
    * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeUrl: js.UndefOr[__string] = js.undefined
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[__string] = js.undefined
  /**
    * Version information about the application.
    */
  var Version: js.UndefOr[typings.awsDashSdk.clientsServerlessapplicationrepositoryMod.Version] = js.undefined
}

object CreateApplicationResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    Author: __string = null,
    CreationTime: __string = null,
    Description: __string = null,
    HomePageUrl: __string = null,
    Labels: __listOf__string = null,
    LicenseUrl: __string = null,
    Name: __string = null,
    ReadmeUrl: __string = null,
    SpdxLicenseId: __string = null,
    Version: Version = null
  ): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (Author != null) __obj.updateDynamic("Author")(Author)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HomePageUrl != null) __obj.updateDynamic("HomePageUrl")(HomePageUrl)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (LicenseUrl != null) __obj.updateDynamic("LicenseUrl")(LicenseUrl)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ReadmeUrl != null) __obj.updateDynamic("ReadmeUrl")(ReadmeUrl)
    if (SpdxLicenseId != null) __obj.updateDynamic("SpdxLicenseId")(SpdxLicenseId)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

