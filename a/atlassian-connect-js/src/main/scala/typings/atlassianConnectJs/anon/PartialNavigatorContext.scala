package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsStrings.`version-at-save`
import typings.atlassianConnectJs.atlassianConnectJsStrings.blogpost
import typings.atlassianConnectJs.atlassianConnectJsStrings.current
import typings.atlassianConnectJs.atlassianConnectJsStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<atlassian-connect-js.AP.navigator.NavigatorContext> */
trait PartialNavigatorContext extends js.Object {
  var absoluteUrl: js.UndefOr[String] = js.undefined
  var addonKey: js.UndefOr[String] = js.undefined
  var adminPageKey: js.UndefOr[String] = js.undefined
  var contentId: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[page | blogpost] = js.undefined
  var customData: js.UndefOr[String] = js.undefined
  var dashboardId: js.UndefOr[String] = js.undefined
  var embeddedContentRender: js.UndefOr[current | `version-at-save`] = js.undefined
  var issueKey: js.UndefOr[String] = js.undefined
  var moduleKey: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var projectKey: js.UndefOr[String] = js.undefined
  var relativeUrl: js.UndefOr[String] = js.undefined
  var spaceKey: js.UndefOr[String] = js.undefined
  var userAccountId: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var versionOverride: js.UndefOr[String] = js.undefined
}

object PartialNavigatorContext {
  @scala.inline
  def apply(
    absoluteUrl: String = null,
    addonKey: String = null,
    adminPageKey: String = null,
    contentId: String = null,
    contentType: page | blogpost = null,
    customData: String = null,
    dashboardId: String = null,
    embeddedContentRender: current | `version-at-save` = null,
    issueKey: String = null,
    moduleKey: String = null,
    projectId: String = null,
    projectKey: String = null,
    relativeUrl: String = null,
    spaceKey: String = null,
    userAccountId: String = null,
    username: String = null,
    versionOverride: String = null
  ): PartialNavigatorContext = {
    val __obj = js.Dynamic.literal()
    if (absoluteUrl != null) __obj.updateDynamic("absoluteUrl")(absoluteUrl.asInstanceOf[js.Any])
    if (addonKey != null) __obj.updateDynamic("addonKey")(addonKey.asInstanceOf[js.Any])
    if (adminPageKey != null) __obj.updateDynamic("adminPageKey")(adminPageKey.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (dashboardId != null) __obj.updateDynamic("dashboardId")(dashboardId.asInstanceOf[js.Any])
    if (embeddedContentRender != null) __obj.updateDynamic("embeddedContentRender")(embeddedContentRender.asInstanceOf[js.Any])
    if (issueKey != null) __obj.updateDynamic("issueKey")(issueKey.asInstanceOf[js.Any])
    if (moduleKey != null) __obj.updateDynamic("moduleKey")(moduleKey.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (projectKey != null) __obj.updateDynamic("projectKey")(projectKey.asInstanceOf[js.Any])
    if (relativeUrl != null) __obj.updateDynamic("relativeUrl")(relativeUrl.asInstanceOf[js.Any])
    if (spaceKey != null) __obj.updateDynamic("spaceKey")(spaceKey.asInstanceOf[js.Any])
    if (userAccountId != null) __obj.updateDynamic("userAccountId")(userAccountId.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (versionOverride != null) __obj.updateDynamic("versionOverride")(versionOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialNavigatorContext]
  }
}

