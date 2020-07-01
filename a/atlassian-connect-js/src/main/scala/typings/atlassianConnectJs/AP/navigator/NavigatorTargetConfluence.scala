package typings.atlassianConnectJs.AP.navigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NavigatorTargetConfluence extends js.Object

@JSGlobal("AP.navigator.NavigatorTargetConfluence")
@js.native
object NavigatorTargetConfluence extends js.Object {
  /**
    * The module page within a specific add-on. Takes an `addonKey` and a `moduleKey` to identify the correct module.
    */
  @js.native
  sealed trait addonModule extends NavigatorTargetConfluence
  
  /**
    * The edit page for pages, blogs and custom content. Takes a `contentId` to identify the content.
    */
  @js.native
  sealed trait contentedit extends NavigatorTargetConfluence
  
  /**
    * The list/collector page for pages, blogs and custom content contained in a space. Takes a `spaceKey` and a `contentType` to identify the content type.
    */
  @js.native
  sealed trait contentlist extends NavigatorTargetConfluence
  
  /**
    * The view page for pages, blogs and custom content. Takes a `contentId` to identify the content.
    */
  @js.native
  sealed trait contentview extends NavigatorTargetConfluence
  
  /**
    * The dashboard of Confluence.
    */
  @js.native
  sealed trait dashboard extends NavigatorTargetConfluence
  
  /**
    * A specific location contained within a site. Takes a `relativeUrl` to identify the path.
    */
  @js.native
  sealed trait site extends NavigatorTargetConfluence
  
  /**
    * The space tools page. Takes a `spaceKey` to identify the space.
    */
  @js.native
  sealed trait spacetools extends NavigatorTargetConfluence
  
  /**
    * The space view page. Takes a `spaceKey` to identify the space.
    */
  @js.native
  sealed trait spaceview extends NavigatorTargetConfluence
  
  /**
    * The profile page for a specific user. Takes a `username` or `userAccountId` to identify the user.
    */
  @js.native
  sealed trait userProfile extends NavigatorTargetConfluence
  
}

