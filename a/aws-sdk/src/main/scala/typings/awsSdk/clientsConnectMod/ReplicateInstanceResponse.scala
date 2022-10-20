package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicateInstanceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replicated instance.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the replicated instance. You can find the instanceId in the ARN of the instance. The replicated instance has the same identifier as the instance it was replicated from.
    */
  var Id: js.UndefOr[InstanceId] = js.undefined
}
object ReplicateInstanceResponse {
  
  inline def apply(): ReplicateInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicateInstanceResponse]
  }
  
  extension [Self <: ReplicateInstanceResponse](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: InstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
