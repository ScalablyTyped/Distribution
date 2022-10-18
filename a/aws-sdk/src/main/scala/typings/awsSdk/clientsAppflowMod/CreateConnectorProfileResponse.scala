package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectorProfileResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile. 
    */
  var connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.undefined
}
object CreateConnectorProfileResponse {
  
  inline def apply(): CreateConnectorProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectorProfileResponse]
  }
  
  extension [Self <: CreateConnectorProfileResponse](x: Self) {
    
    inline def setConnectorProfileArn(value: ConnectorProfileArn): Self = StObject.set(x, "connectorProfileArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileArnUndefined: Self = StObject.set(x, "connectorProfileArn", js.undefined)
  }
}
