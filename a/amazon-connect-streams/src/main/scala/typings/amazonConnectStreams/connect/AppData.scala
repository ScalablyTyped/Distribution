package typings.amazonConnectStreams.connect

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppData extends StObject {
  
  var containerDOM: HTMLElement
  
  var endpoint: String
  
  var instance: js.UndefOr[AppMethods] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object AppData {
  
  inline def apply(containerDOM: HTMLElement, endpoint: String): AppData = {
    val __obj = js.Dynamic.literal(containerDOM = containerDOM.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppData]
  }
  
  extension [Self <: AppData](x: Self) {
    
    inline def setContainerDOM(value: HTMLElement): Self = StObject.set(x, "containerDOM", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: AppMethods): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
