package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.anon.Attributes
import typings.atlassianCrowdClient.anon.Authenticate
import typings.atlassianCrowdClient.anon.Children
import typings.atlassianCrowdClient.anon.Cookie
import typings.atlassianCrowdClient.anon.Create
import typings.atlassianCrowdClient.anon.Group
import typings.atlassianCrowdClient.settingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atlassian-crowd-client", JSImport.Namespace)
  @js.native
  class ^ protected () extends CrowdClient {
    def this(settings: Settings) = this()
  }
  
  @js.native
  trait CrowdClient
    extends typings.atlassianCrowdClient.apiMod.^ {
    
    var authentication: Authenticate = js.native
    
    var config: Cookie = js.native
    
    var group: Children = js.native
    
    var search: Group = js.native
    
    var session: Create = js.native
    
    var user: Attributes = js.native
  }
}
