package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayAccessLog extends StObject {
  
  /**
    * The file object to send virtual gateway access logs to.
    */
  var file: js.UndefOr[VirtualGatewayFileAccessLog] = js.undefined
}
object VirtualGatewayAccessLog {
  
  inline def apply(): VirtualGatewayAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayAccessLog]
  }
  
  extension [Self <: VirtualGatewayAccessLog](x: Self) {
    
    inline def setFile(value: VirtualGatewayFileAccessLog): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
