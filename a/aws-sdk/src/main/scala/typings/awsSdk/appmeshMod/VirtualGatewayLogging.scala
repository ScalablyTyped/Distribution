package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayLogging extends StObject {
  
  /**
    * The access log configuration.
    */
  var accessLog: js.UndefOr[VirtualGatewayAccessLog] = js.native
}
object VirtualGatewayLogging {
  
  @scala.inline
  def apply(): VirtualGatewayLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayLogging]
  }
  
  @scala.inline
  implicit class VirtualGatewayLoggingMutableBuilder[Self <: VirtualGatewayLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLog(value: VirtualGatewayAccessLog): Self = StObject.set(x, "accessLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogUndefined: Self = StObject.set(x, "accessLog", js.undefined)
  }
}
