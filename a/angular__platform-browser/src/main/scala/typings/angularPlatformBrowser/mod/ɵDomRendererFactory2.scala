package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.RendererFactory2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275DomRendererFactory2")
@js.native
class ɵDomRendererFactory2 protected () extends RendererFactory2 {
  def this(eventManager: EventManager, sharedStylesHost: ɵDomSharedStylesHost, appId: String) = this()
  
  var appId: js.Any = js.native
  
  @JSName("begin")
  def begin_MɵDomRendererFactory2(): Unit = js.native
  
  var defaultRenderer: js.Any = js.native
  
  @JSName("end")
  def end_MɵDomRendererFactory2(): Unit = js.native
  
  var eventManager: js.Any = js.native
  
  var rendererByCompId: js.Any = js.native
  
  var sharedStylesHost: js.Any = js.native
}
