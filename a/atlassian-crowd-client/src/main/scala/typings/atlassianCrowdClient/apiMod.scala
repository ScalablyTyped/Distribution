package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.settingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("atlassian-crowd-client/api", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CrowdApi {
    def this(settings: Settings) = this()
  }
  
  @js.native
  trait CrowdApi extends StObject {
    
    def log(args: Any*): Unit = js.native
    
    def request(method: String, path: String): js.Promise[Any] = js.native
    def request(method: String, path: String, data: Any): js.Promise[Any] = js.native
    
    var settings: Settings = js.native
  }
}
