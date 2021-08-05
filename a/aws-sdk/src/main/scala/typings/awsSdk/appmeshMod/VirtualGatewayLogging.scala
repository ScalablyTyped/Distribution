package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayLogging extends StObject {
  
  /**
    * The access log configuration.
    */
  var accessLog: js.UndefOr[VirtualGatewayAccessLog] = js.undefined
}
object VirtualGatewayLogging {
  
  inline def apply(): VirtualGatewayLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayLogging]
  }
  
  extension [Self <: VirtualGatewayLogging](x: Self) {
    
    inline def setAccessLog(value: VirtualGatewayAccessLog): Self = StObject.set(x, "accessLog", value.asInstanceOf[js.Any])
    
    inline def setAccessLogUndefined: Self = StObject.set(x, "accessLog", js.undefined)
  }
}
