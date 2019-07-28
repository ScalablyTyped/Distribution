package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: __string
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: js.UndefOr[__string] = js.undefined
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
    * A text readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeBody: js.UndefOr[__string] = js.undefined
  /**
    * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeUrl: js.UndefOr[__string] = js.undefined
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(
    ApplicationId: __string,
    Author: __string = null,
    Description: __string = null,
    HomePageUrl: __string = null,
    Labels: __listOf__string = null,
    ReadmeBody: __string = null,
    ReadmeUrl: __string = null
  ): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
    if (Author != null) __obj.updateDynamic("Author")(Author)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HomePageUrl != null) __obj.updateDynamic("HomePageUrl")(HomePageUrl)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (ReadmeBody != null) __obj.updateDynamic("ReadmeBody")(ReadmeBody)
    if (ReadmeUrl != null) __obj.updateDynamic("ReadmeUrl")(ReadmeUrl)
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
}

