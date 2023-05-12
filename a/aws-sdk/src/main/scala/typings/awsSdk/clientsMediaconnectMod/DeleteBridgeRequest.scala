package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBridgeRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to delete.
    */
  var BridgeArn: string
}
object DeleteBridgeRequest {
  
  inline def apply(BridgeArn: string): DeleteBridgeRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBridgeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBridgeRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
  }
}
