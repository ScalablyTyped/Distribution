package typings.atlassianConnectJs.AP.navigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigatorTargetJira extends js.Object
@JSGlobal("AP.navigator.NavigatorTargetJira")
@js.native
object NavigatorTargetJira extends js.Object {
  
  /**
    * The module page within a specific add-on. Takes an `addonKey` and a `moduleKey` to identify the correct module.
    */
  @js.native
  sealed trait addonModule extends NavigatorTargetJira
  
  /**
    * A specific dashboard in Jira. Takes a `dashboardId` to identify the dashboard.
    */
  @js.native
  sealed trait dashboard extends NavigatorTargetJira
  
  /**
    * A specific Issue in Jira. Takes an `issueKey` to identify the issue.
    */
  @js.native
  sealed trait issue extends NavigatorTargetJira
  
  /**
    * The admin details of a specific Jira Project. Takes a `projectKey` to identify the project. Only accessible to administrators.
    */
  @js.native
  sealed trait projectAdminSummary extends NavigatorTargetJira
  
  /**
    * The admin panel definted by a connect addon. Takes an `addonKey`, `adminPageKey`, `projectKey` and `projectId`. Only accessible to administrators.
    */
  @js.native
  sealed trait projectAdminTabPanel extends NavigatorTargetJira
  
  /**
    * A specific location contained within the site. Takes either a `relativeUrl` or `absoluteUrl` to identify the path.
    */
  @js.native
  sealed trait site extends NavigatorTargetJira
  
  /**
    * The profile page for a Jira User. Takes a `username` or `userAccountId` to identify the user.
    */
  @js.native
  sealed trait userProfile extends NavigatorTargetJira
}
