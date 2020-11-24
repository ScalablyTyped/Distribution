package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsStrings.`version-at-save`
import typings.atlassianConnectJs.atlassianConnectJsStrings.blogpost
import typings.atlassianConnectJs.atlassianConnectJsStrings.current
import typings.atlassianConnectJs.atlassianConnectJsStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<atlassian-connect-js.AP.navigator.NavigatorContext> */
@js.native
trait PartialNavigatorContext extends js.Object {
  
  var absoluteUrl: js.UndefOr[String] = js.native
  
  var addonKey: js.UndefOr[String] = js.native
  
  var adminPageKey: js.UndefOr[String] = js.native
  
  var contentId: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[page | blogpost] = js.native
  
  var customData: js.UndefOr[String] = js.native
  
  var dashboardId: js.UndefOr[String] = js.native
  
  var embeddedContentRender: js.UndefOr[current | `version-at-save`] = js.native
  
  var issueKey: js.UndefOr[String] = js.native
  
  var moduleKey: js.UndefOr[String] = js.native
  
  var projectId: js.UndefOr[String] = js.native
  
  var projectKey: js.UndefOr[String] = js.native
  
  var relativeUrl: js.UndefOr[String] = js.native
  
  var spaceKey: js.UndefOr[String] = js.native
  
  var userAccountId: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var versionOverride: js.UndefOr[String] = js.native
}
object PartialNavigatorContext {
  
  @scala.inline
  def apply(): PartialNavigatorContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNavigatorContext]
  }
  
  @scala.inline
  implicit class PartialNavigatorContextOps[Self <: PartialNavigatorContext] (val x: Self) extends AnyVal {
    
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
    def deleteAbsoluteUrl: Self = this.set("absoluteUrl", js.undefined)
    
    @scala.inline
    def setAddonKey(value: String): Self = this.set("addonKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddonKey: Self = this.set("addonKey", js.undefined)
    
    @scala.inline
    def setAdminPageKey(value: String): Self = this.set("adminPageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminPageKey: Self = this.set("adminPageKey", js.undefined)
    
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    
    @scala.inline
    def setContentType(value: page | blogpost): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCustomData(value: String): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    
    @scala.inline
    def setDashboardId(value: String): Self = this.set("dashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardId: Self = this.set("dashboardId", js.undefined)
    
    @scala.inline
    def setEmbeddedContentRender(value: current | `version-at-save`): Self = this.set("embeddedContentRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedContentRender: Self = this.set("embeddedContentRender", js.undefined)
    
    @scala.inline
    def setIssueKey(value: String): Self = this.set("issueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueKey: Self = this.set("issueKey", js.undefined)
    
    @scala.inline
    def setModuleKey(value: String): Self = this.set("moduleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleKey: Self = this.set("moduleKey", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setProjectKey(value: String): Self = this.set("projectKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectKey: Self = this.set("projectKey", js.undefined)
    
    @scala.inline
    def setRelativeUrl(value: String): Self = this.set("relativeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeUrl: Self = this.set("relativeUrl", js.undefined)
    
    @scala.inline
    def setSpaceKey(value: String): Self = this.set("spaceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceKey: Self = this.set("spaceKey", js.undefined)
    
    @scala.inline
    def setUserAccountId(value: String): Self = this.set("userAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAccountId: Self = this.set("userAccountId", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setVersionOverride(value: String): Self = this.set("versionOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionOverride: Self = this.set("versionOverride", js.undefined)
  }
}
