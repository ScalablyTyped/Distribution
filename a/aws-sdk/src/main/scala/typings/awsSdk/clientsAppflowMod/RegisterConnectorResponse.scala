package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterConnectorResponse extends StObject {
  
  /**
    * The ARN of the connector being registered.
    */
  var connectorArn: js.UndefOr[ARN] = js.undefined
}
object RegisterConnectorResponse {
  
  inline def apply(): RegisterConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectorArn(value: ARN): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorArnUndefined: Self = StObject.set(x, "connectorArn", js.undefined)
  }
}
