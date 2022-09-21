package typings.amazonConnectStreams.connect

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentApp extends StObject {
  
  /** Memoizes app data along with start and stop functions. */
  var AppRegistry: typings.amazonConnectStreams.connect.AppRegistry = js.native
  
  /** Registers the app to the registry and initializes it. */
  def initApp(appName: String, containerId: String, appUrl: String): Unit = js.native
  def initApp(appName: String, containerId: String, appUrl: String, config: AppOptions): Unit = js.native
  
  /** Waits for CCP to load to begin iframe communication. */
  def initAppCommunication(iframeId: String, endpoint: String): Unit = js.native
  
  /** Alias for connect.core.initCCP */
  def initCCP(container: HTMLElement, options: InitCCPOptions): Unit = js.native
  
  /** Destoys the app by calling the destroy method defined in the app registry. */
  def stopApp(): Unit = js.native
}
