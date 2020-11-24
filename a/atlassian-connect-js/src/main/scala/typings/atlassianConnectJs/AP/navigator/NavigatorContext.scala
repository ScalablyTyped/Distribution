package typings.atlassianConnectJs.AP.navigator

import typings.atlassianConnectJs.atlassianConnectJsStrings.`version-at-save`
import typings.atlassianConnectJs.atlassianConnectJsStrings.blogpost
import typings.atlassianConnectJs.atlassianConnectJsStrings.current
import typings.atlassianConnectJs.atlassianConnectJsStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorContext extends js.Object {
  
  /**
    * Identifies a specific page within a site. Required for the `site` target and must be within the site's domain.
    */
  var absoluteUrl: String = js.native
  
  /**
    * Identifies a connect add-on. Required for the `addonModule` and `projectAdminTabPanel` targets.
    */
  var addonKey: String = js.native
  
  /**
    * Identifies a Jira Project Admin Tab Panels module key. Required for the `projectAdminTabPanel` target.
    */
  var adminPageKey: String = js.native
  
  /**
    * Identifies a piece of content. Required for the `contentView` target.
    */
  var contentId: String = js.native
  
  /**
    * Identifies the type of content. Can be either `page` or `blogpost`. Required for the `contentEdit` target.
    */
  var contentType: page | blogpost = js.native
  
  /**
    * Contains parameters that will be added as query parameters to the product url with "ac." prepended.
    * Used only in `addonModule` target. See Add-on specific context parameters for more info.
    */
  var customData: String = js.native
  
  /**
    * Identifies a Jira dashboard. Required for the `dashboard` target in Jira.
    */
  var dashboardId: String = js.native
  
  /**
    * Identifies the mode for rendering embedded content in Confluence, such as attachments embedded in a page. This only applies to the `contentView` target.
    * Valid values are:
    * - `current` (render the embedded content using the latest version)
    * - `version-at-save` (render the embedded content using the version at the time the content was saved)
    *
    * This parameter is optional and defaults to `current`.
    */
  var embeddedContentRender: js.UndefOr[current | `version-at-save`] = js.native
  
  /**
    * Identifies a Jira issue. Required for the `issue` target.
    */
  var issueKey: String = js.native
  
  /**
    * Identifies a connect add-on module. Required for the `addonModule` target.
    */
  var moduleKey: String = js.native
  
  /**
    * Identifies a Jira Project by its ID number. Required for the `projectAdminTabPanel` target.
    */
  var projectId: String = js.native
  
  /**
    * Identifies a Jira project. Required for the `projectSummary`, `projectAdminSummary` and `projectAdminTabPanel` targets.
    */
  var projectKey: String = js.native
  
  /**
    * Identifies a specific page within a site. Required for the `site` target and must begin with `/`.
    */
  var relativeUrl: String = js.native
  
  /**
    * Identifies a space. Required for the `spaceView` and `spaceTools` targets.
    */
  var spaceKey: String = js.native
  
  /**
    * Identifies a user. One of this or `username` required for the `userProfile` target.
    */
  var userAccountId: String = js.native
  
  /**
    * Identifies a user. One of this or `userAccountId` required for the `userProfile` target.
    */
  var username: String = js.native
  
  /**
    * Identifies a version of a piece of content in Confluence. This parameter is optional, and only applies to the `contentView` target, allowing navigation to a specific version.
    */
  var versionOverride: String = js.native
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
    versionOverride: String
  ): NavigatorContext = {
    val __obj = js.Dynamic.literal(absoluteUrl = absoluteUrl.asInstanceOf[js.Any], addonKey = addonKey.asInstanceOf[js.Any], adminPageKey = adminPageKey.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], issueKey = issueKey.asInstanceOf[js.Any], moduleKey = moduleKey.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], projectKey = projectKey.asInstanceOf[js.Any], relativeUrl = relativeUrl.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any], userAccountId = userAccountId.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], versionOverride = versionOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorContext]
  }
  
  @scala.inline
  implicit class NavigatorContextOps[Self <: NavigatorContext] (val x: Self) extends AnyVal {
    
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
    def setAbsoluteUrl(value: String): Self = this.set("absoluteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonKey(value: String): Self = this.set("addonKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminPageKey(value: String): Self = this.set("adminPageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: page | blogpost): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: String): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardId(value: String): Self = this.set("dashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueKey(value: String): Self = this.set("issueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleKey(value: String): Self = this.set("moduleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectKey(value: String): Self = this.set("projectKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeUrl(value: String): Self = this.set("relativeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceKey(value: String): Self = this.set("spaceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAccountId(value: String): Self = this.set("userAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionOverride(value: String): Self = this.set("versionOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedContentRender(value: current | `version-at-save`): Self = this.set("embeddedContentRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedContentRender: Self = this.set("embeddedContentRender", js.undefined)
  }
}
