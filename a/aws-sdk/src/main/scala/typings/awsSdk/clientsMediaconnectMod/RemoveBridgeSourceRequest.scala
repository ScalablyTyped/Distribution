package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBridgeSourceRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to update.
    */
  var BridgeArn: string
  
  /**
    * The name of the bridge source that you want to remove.
    */
  var SourceName: string
}
object RemoveBridgeSourceRequest {
  
  inline def apply(BridgeArn: string, SourceName: string): RemoveBridgeSourceRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveBridgeSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveBridgeSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: string): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
  }
}
