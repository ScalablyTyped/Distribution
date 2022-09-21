package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.AP.navigator.CustomDataValue
import typings.atlassianConnectJs.atlassianConnectJsStrings.`version-at-save`
import typings.atlassianConnectJs.atlassianConnectJsStrings.blogpost
import typings.atlassianConnectJs.atlassianConnectJsStrings.current
import typings.atlassianConnectJs.atlassianConnectJsStrings.page
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<atlassian-connect-js.AP.navigator.NavigatorContext> */
trait PartialNavigatorContext extends StObject {
  
  var absoluteUrl: js.UndefOr[String] = js.undefined
  
  var addonKey: js.UndefOr[String] = js.undefined
  
  var adminPageKey: js.UndefOr[String] = js.undefined
  
  var contentId: js.UndefOr[String] = js.undefined
  
  var contentType: js.UndefOr[page | blogpost] = js.undefined
  
  var customData: js.UndefOr[Record[String, CustomDataValue]] = js.undefined
  
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
  
  inline def apply(): PartialNavigatorContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNavigatorContext]
  }
  
  extension [Self <: PartialNavigatorContext](x: Self) {
    
    inline def setAbsoluteUrl(value: String): Self = StObject.set(x, "absoluteUrl", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteUrlUndefined: Self = StObject.set(x, "absoluteUrl", js.undefined)
    
    inline def setAddonKey(value: String): Self = StObject.set(x, "addonKey", value.asInstanceOf[js.Any])
    
    inline def setAddonKeyUndefined: Self = StObject.set(x, "addonKey", js.undefined)
    
    inline def setAdminPageKey(value: String): Self = StObject.set(x, "adminPageKey", value.asInstanceOf[js.Any])
    
    inline def setAdminPageKeyUndefined: Self = StObject.set(x, "adminPageKey", js.undefined)
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    inline def setContentType(value: page | blogpost): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCustomData(value: Record[String, CustomDataValue]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setDashboardId(value: String): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
    
    inline def setDashboardIdUndefined: Self = StObject.set(x, "dashboardId", js.undefined)
    
    inline def setEmbeddedContentRender(value: current | `version-at-save`): Self = StObject.set(x, "embeddedContentRender", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedContentRenderUndefined: Self = StObject.set(x, "embeddedContentRender", js.undefined)
    
    inline def setIssueKey(value: String): Self = StObject.set(x, "issueKey", value.asInstanceOf[js.Any])
    
    inline def setIssueKeyUndefined: Self = StObject.set(x, "issueKey", js.undefined)
    
    inline def setModuleKey(value: String): Self = StObject.set(x, "moduleKey", value.asInstanceOf[js.Any])
    
    inline def setModuleKeyUndefined: Self = StObject.set(x, "moduleKey", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setProjectKey(value: String): Self = StObject.set(x, "projectKey", value.asInstanceOf[js.Any])
    
    inline def setProjectKeyUndefined: Self = StObject.set(x, "projectKey", js.undefined)
    
    inline def setRelativeUrl(value: String): Self = StObject.set(x, "relativeUrl", value.asInstanceOf[js.Any])
    
    inline def setRelativeUrlUndefined: Self = StObject.set(x, "relativeUrl", js.undefined)
    
    inline def setSpaceKey(value: String): Self = StObject.set(x, "spaceKey", value.asInstanceOf[js.Any])
    
    inline def setSpaceKeyUndefined: Self = StObject.set(x, "spaceKey", js.undefined)
    
    inline def setUserAccountId(value: String): Self = StObject.set(x, "userAccountId", value.asInstanceOf[js.Any])
    
    inline def setUserAccountIdUndefined: Self = StObject.set(x, "userAccountId", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVersionOverride(value: String): Self = StObject.set(x, "versionOverride", value.asInstanceOf[js.Any])
    
    inline def setVersionOverrideUndefined: Self = StObject.set(x, "versionOverride", js.undefined)
  }
}
