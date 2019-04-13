package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationRequest extends js.Object {
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: __string
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
    * A local text file that contains the license of the app that matches the spdxLicenseID value of your application.
    The file has the format file://&lt;path>/&lt;filename>.Maximum size 5 MBYou can specify only one of licenseBody and licenseUrl; otherwise, an error results.
    */
  var LicenseBody: js.UndefOr[__string] = js.undefined
  /**
    * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your application.Maximum size 5 MBYou can specify only one of licenseBody and licenseUrl; otherwise, an error results.
    */
  var LicenseUrl: js.UndefOr[__string] = js.undefined
  /**
    * The name of the application that you want to publish.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: __string
  /**
    * A local text readme file in Markdown language that contains a more detailed description of the application and how it works.
    The file has the format file://&lt;path>/&lt;filename>.Maximum size 5 MBYou can specify only one of readmeBody and readmeUrl; otherwise, an error results.
    */
  var ReadmeBody: js.UndefOr[__string] = js.undefined
  /**
    * A link to the S3 object in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MBYou can specify only one of readmeBody and readmeUrl; otherwise, an error results.
    */
  var ReadmeUrl: js.UndefOr[__string] = js.undefined
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[__string] = js.undefined
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[__string] = js.undefined
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[__string] = js.undefined
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[__string] = js.undefined
  /**
    * The local raw packaged AWS SAM template file of your application.
    The file has the format file://&lt;path>/&lt;filename>.You can specify only one of templateBody and templateUrl; otherwise an error results.
    */
  var TemplateBody: js.UndefOr[__string] = js.undefined
  /**
    * A link to the S3 object containing the packaged AWS SAM template of your application.You can specify only one of templateBody and templateUrl; otherwise an error results.
    */
  var TemplateUrl: js.UndefOr[__string] = js.undefined
}

object CreateApplicationRequest {
  @scala.inline
  def apply(
    Author: __string,
    Description: __string,
    Name: __string,
    HomePageUrl: __string = null,
    Labels: __listOf__string = null,
    LicenseBody: __string = null,
    LicenseUrl: __string = null,
    ReadmeBody: __string = null,
    ReadmeUrl: __string = null,
    SemanticVersion: __string = null,
    SourceCodeArchiveUrl: __string = null,
    SourceCodeUrl: __string = null,
    SpdxLicenseId: __string = null,
    TemplateBody: __string = null,
    TemplateUrl: __string = null
  ): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(Author = Author, Description = Description, Name = Name)
    if (HomePageUrl != null) __obj.updateDynamic("HomePageUrl")(HomePageUrl)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (LicenseBody != null) __obj.updateDynamic("LicenseBody")(LicenseBody)
    if (LicenseUrl != null) __obj.updateDynamic("LicenseUrl")(LicenseUrl)
    if (ReadmeBody != null) __obj.updateDynamic("ReadmeBody")(ReadmeBody)
    if (ReadmeUrl != null) __obj.updateDynamic("ReadmeUrl")(ReadmeUrl)
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion)
    if (SourceCodeArchiveUrl != null) __obj.updateDynamic("SourceCodeArchiveUrl")(SourceCodeArchiveUrl)
    if (SourceCodeUrl != null) __obj.updateDynamic("SourceCodeUrl")(SourceCodeUrl)
    if (SpdxLicenseId != null) __obj.updateDynamic("SpdxLicenseId")(SpdxLicenseId)
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody)
    if (TemplateUrl != null) __obj.updateDynamic("TemplateUrl")(TemplateUrl)
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

