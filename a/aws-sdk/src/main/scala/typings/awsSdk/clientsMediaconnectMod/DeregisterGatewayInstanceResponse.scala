package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterGatewayInstanceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance.
    */
  var GatewayInstanceArn: js.UndefOr[string] = js.undefined
  
  /**
    * The status of the instance.
    */
  var InstanceState: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.InstanceState] = js.undefined
}
object DeregisterGatewayInstanceResponse {
  
  inline def apply(): DeregisterGatewayInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterGatewayInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterGatewayInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setGatewayInstanceArn(value: string): Self = StObject.set(x, "GatewayInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayInstanceArnUndefined: Self = StObject.set(x, "GatewayInstanceArn", js.undefined)
    
    inline def setInstanceState(value: InstanceState): Self = StObject.set(x, "InstanceState", value.asInstanceOf[js.Any])
    
    inline def setInstanceStateUndefined: Self = StObject.set(x, "InstanceState", js.undefined)
  }
}
