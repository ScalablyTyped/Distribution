package typings.atlassianConnectJs.AP.navigator

import typings.atlassianConnectJs.atlassianConnectJsStrings.`version-at-save`
import typings.atlassianConnectJs.atlassianConnectJsStrings.blogpost
import typings.atlassianConnectJs.atlassianConnectJsStrings.current
import typings.atlassianConnectJs.atlassianConnectJsStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorContext extends js.Object {
  /**
    * Identifies a specific page within a site. Required for the `site` target and must be within the site's domain.
    */
  var absoluteUrl: String
  /**
    * Identifies a connect add-on. Required for the `addonModule` and `projectAdminTabPanel` targets.
    */
  var addonKey: String
  /**
    * Identifies a Jira Project Admin Tab Panels module key. Required for the `projectAdminTabPanel` target.
    */
  var adminPageKey: String
  /**
    * Identifies a piece of content. Required for the `contentView` target.
    */
  var contentId: String
  /**
    * Identifies the type of content. Can be either `page` or `blogpost`. Required for the `contentEdit` target.
    */
  var contentType: page | blogpost
  /**
    * Contains parameters that will be added as query parameters to the product url with "ac." prepended.
    * Used only in `addonModule` target. See Add-on specific context parameters for more info.
    */
  var customData: String
  /**
    * Identifies a Jira dashboard. Required for the `dashboard` target in Jira.
    */
  var dashboardId: String
  /**
    * Identifies the mode for rendering embedded content in Confluence, such as attachments embedded in a page. This only applies to the `contentView` target.
    * Valid values are:
    * - `current` (render the embedded content using the latest version)
    * - `version-at-save` (render the embedded content using the version at the time the content was saved)
    *
    * This parameter is optional and defaults to `current`.
    */
  var embeddedContentRender: js.UndefOr[current | `version-at-save`] = js.undefined
  /**
    * Identifies a Jira issue. Required for the `issue` target.
    */
  var issueKey: String
  /**
    * Identifies a connect add-on module. Required for the `addonModule` target.
    */
  var moduleKey: String
  /**
    * Identifies a Jira Project by its ID number. Required for the `projectAdminTabPanel` target.
    */
  var projectId: String
  /**
    * Identifies a Jira project. Required for the `projectSummary`, `projectAdminSummary` and `projectAdminTabPanel` targets.
    */
  var projectKey: String
  /**
    * Identifies a specific page within a site. Required for the `site` target and must begin with `/`.
    */
  var relativeUrl: String
  /**
    * Identifies a space. Required for the `spaceView` and `spaceTools` targets.
    */
  var spaceKey: String
  /**
    * Identifies a user. One of this or `username` required for the `userProfile` target.
    */
  var userAccountId: String
  /**
    * Identifies a user. One of this or `userAccountId` required for the `userProfile` target.
    */
  var username: String
  /**
    * Identifies a version of a piece of content in Confluence. This parameter is optional, and only applies to the `contentView` target, allowing navigation to a specific version.
    */
  var versionOverride: String
}

object NavigatorContext {
  @scala.inline
  def apply(
    absoluteUrl: String,
    addonKey: String,
    adminPageKey: String,
    contentId: String,
    contentType: page | blogpost,
    customData: String,
    dashboardId: String,
    issueKey: String,
    moduleKey: String,
    projectId: String,
    projectKey: String,
    relativeUrl: String,
    spaceKey: String,
    userAccountId: String,
    username: String,
    versionOverride: String,
    embeddedContentRender: current | `version-at-save` = null
  ): NavigatorContext = {
    val __obj = js.Dynamic.literal(absoluteUrl = absoluteUrl.asInstanceOf[js.Any], addonKey = addonKey.asInstanceOf[js.Any], adminPageKey = adminPageKey.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], issueKey = issueKey.asInstanceOf[js.Any], moduleKey = moduleKey.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], projectKey = projectKey.asInstanceOf[js.Any], relativeUrl = relativeUrl.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any], userAccountId = userAccountId.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], versionOverride = versionOverride.asInstanceOf[js.Any])
    if (embeddedContentRender != null) __obj.updateDynamic("embeddedContentRender")(embeddedContentRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorContext]
  }
}

