package typings.awsSdk.appmeshMod

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
  
  @scala.inline
  def apply(): VirtualGatewayAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayAccessLog]
  }
  
  @scala.inline
  implicit class VirtualGatewayAccessLogMutableBuilder[Self <: VirtualGatewayAccessLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: VirtualGatewayFileAccessLog): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
