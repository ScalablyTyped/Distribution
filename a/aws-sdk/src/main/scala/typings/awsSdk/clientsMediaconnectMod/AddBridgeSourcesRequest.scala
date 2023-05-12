package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBridgeSourcesRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to update.
    */
  var BridgeArn: string
  
  /**
    * The sources that you want to add to this bridge.
    */
  var Sources: listOfAddBridgeSourceRequest
}
object AddBridgeSourcesRequest {
  
  inline def apply(BridgeArn: string, Sources: listOfAddBridgeSourceRequest): AddBridgeSourcesRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddBridgeSourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBridgeSourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setSources(value: listOfAddBridgeSourceRequest): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: AddBridgeSourceRequest*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
