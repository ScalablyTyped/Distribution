package typings.angularHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserJsonpMod {
  
  @JSImport("@angular/http/src/backends/browser_jsonp", "BrowserJsonp")
  @js.native
  class BrowserJsonp () extends StObject {
    
    def build(url: String): js.Any = js.native
    
    def cleanup(node: js.Any): Unit = js.native
    
    def exposeConnection(id: String, connection: js.Any): Unit = js.native
    
    def nextRequestID(): String = js.native
    
    def removeConnection(id: String): Unit = js.native
    
    def requestCallback(id: String): String = js.native
    
    def send(node: js.Any): Unit = js.native
  }
  
  @JSImport("@angular/http/src/backends/browser_jsonp", "JSONP_HOME")
  @js.native
  val JSONP_HOME: /* "__ng_jsonp__" */ String = js.native
}
