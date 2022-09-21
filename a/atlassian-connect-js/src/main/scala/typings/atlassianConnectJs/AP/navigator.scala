package typings.atlassianConnectJs.AP

import typings.atlassianConnectJs.atlassianConnectJsStrings.`version-at-save`
import typings.atlassianConnectJs.atlassianConnectJsStrings.blogpost
import typings.atlassianConnectJs.atlassianConnectJsStrings.current
import typings.atlassianConnectJs.atlassianConnectJsStrings.page
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Navigator API allows your add-on to change the current page using JavaScript.
  */
object navigator {
  
  type CustomDataBasicValue = js.UndefOr[String | Double | Boolean | Null]
  
  type CustomDataValue = CustomDataBasicValue | js.Array[CustomDataBasicValue]
  
  trait NavigatorContext extends StObject {
    
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
      * @example Passing { foo: 'bar' } here causes your iframe to be called with "...?ac.foo=bar"
      * @see {@link https://developer.atlassian.com/cloud/confluence/context-parameters#apps}
      */
    var customData: Record[String, CustomDataValue]
    
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
    
    inline def apply(
      absoluteUrl: String,
      addonKey: String,
      adminPageKey: String,
      contentId: String,
      contentType: page | blogpost,
      customData: Record[String, CustomDataValue],
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
    
    extension [Self <: NavigatorContext](x: Self) {
      
      inline def setAbsoluteUrl(value: String): Self = StObject.set(x, "absoluteUrl", value.asInstanceOf[js.Any])
      
      inline def setAddonKey(value: String): Self = StObject.set(x, "addonKey", value.asInstanceOf[js.Any])
      
      inline def setAdminPageKey(value: String): Self = StObject.set(x, "adminPageKey", value.asInstanceOf[js.Any])
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: page | blogpost): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: Record[String, CustomDataValue]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setDashboardId(value: String): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedContentRender(value: current | `version-at-save`): Self = StObject.set(x, "embeddedContentRender", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedContentRenderUndefined: Self = StObject.set(x, "embeddedContentRender", js.undefined)
      
      inline def setIssueKey(value: String): Self = StObject.set(x, "issueKey", value.asInstanceOf[js.Any])
      
      inline def setModuleKey(value: String): Self = StObject.set(x, "moduleKey", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectKey(value: String): Self = StObject.set(x, "projectKey", value.asInstanceOf[js.Any])
      
      inline def setRelativeUrl(value: String): Self = StObject.set(x, "relativeUrl", value.asInstanceOf[js.Any])
      
      inline def setSpaceKey(value: String): Self = StObject.set(x, "spaceKey", value.asInstanceOf[js.Any])
      
      inline def setUserAccountId(value: String): Self = StObject.set(x, "userAccountId", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setVersionOverride(value: String): Self = StObject.set(x, "versionOverride", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlassianConnectJs.atlassianConnectJsStrings.contentview
    - typings.atlassianConnectJs.atlassianConnectJsStrings.contentedit
    - typings.atlassianConnectJs.atlassianConnectJsStrings.spaceview
    - typings.atlassianConnectJs.atlassianConnectJsStrings.spacetools
    - typings.atlassianConnectJs.atlassianConnectJsStrings.dashboard
    - typings.atlassianConnectJs.atlassianConnectJsStrings.userProfile
    - typings.atlassianConnectJs.atlassianConnectJsStrings.addonModule
    - typings.atlassianConnectJs.atlassianConnectJsStrings.contentlist
    - typings.atlassianConnectJs.atlassianConnectJsStrings.site
  */
  trait NavigatorTargetConfluence extends StObject
  object NavigatorTargetConfluence {
    
    inline def addonModule: typings.atlassianConnectJs.atlassianConnectJsStrings.addonModule = "addonModule".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.addonModule]
    
    inline def contentedit: typings.atlassianConnectJs.atlassianConnectJsStrings.contentedit = "contentedit".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.contentedit]
    
    inline def contentlist: typings.atlassianConnectJs.atlassianConnectJsStrings.contentlist = "contentlist".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.contentlist]
    
    inline def contentview: typings.atlassianConnectJs.atlassianConnectJsStrings.contentview = "contentview".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.contentview]
    
    inline def dashboard: typings.atlassianConnectJs.atlassianConnectJsStrings.dashboard = "dashboard".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.dashboard]
    
    inline def site: typings.atlassianConnectJs.atlassianConnectJsStrings.site = "site".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.site]
    
    inline def spacetools: typings.atlassianConnectJs.atlassianConnectJsStrings.spacetools = "spacetools".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.spacetools]
    
    inline def spaceview: typings.atlassianConnectJs.atlassianConnectJsStrings.spaceview = "spaceview".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.spaceview]
    
    inline def userProfile: typings.atlassianConnectJs.atlassianConnectJsStrings.userProfile = "userProfile".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.userProfile]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlassianConnectJs.atlassianConnectJsStrings.dashboard
    - typings.atlassianConnectJs.atlassianConnectJsStrings.issue
    - typings.atlassianConnectJs.atlassianConnectJsStrings.addonModule
    - typings.atlassianConnectJs.atlassianConnectJsStrings.userProfile
    - typings.atlassianConnectJs.atlassianConnectJsStrings.projectAdminSummary
    - typings.atlassianConnectJs.atlassianConnectJsStrings.projectAdminTabPanel
    - typings.atlassianConnectJs.atlassianConnectJsStrings.site
  */
  trait NavigatorTargetJira extends StObject
  object NavigatorTargetJira {
    
    inline def addonModule: typings.atlassianConnectJs.atlassianConnectJsStrings.addonModule = "addonModule".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.addonModule]
    
    inline def dashboard: typings.atlassianConnectJs.atlassianConnectJsStrings.dashboard = "dashboard".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.dashboard]
    
    inline def issue: typings.atlassianConnectJs.atlassianConnectJsStrings.issue = "issue".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.issue]
    
    inline def projectAdminSummary: typings.atlassianConnectJs.atlassianConnectJsStrings.projectAdminSummary = "projectAdminSummary".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.projectAdminSummary]
    
    inline def projectAdminTabPanel: typings.atlassianConnectJs.atlassianConnectJsStrings.projectAdminTabPanel = "projectAdminTabPanel".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.projectAdminTabPanel]
    
    inline def site: typings.atlassianConnectJs.atlassianConnectJsStrings.site = "site".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.site]
    
    inline def userProfile: typings.atlassianConnectJs.atlassianConnectJsStrings.userProfile = "userProfile".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.userProfile]
  }
}
