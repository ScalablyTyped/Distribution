package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectorProfileRequest extends StObject {
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in your account. 
    */
  var connectorProfileName: ConnectorProfileName
  
  /**
    *  Indicates whether Amazon AppFlow should delete the profile, even if it is currently in use in one or more flows. 
    */
  var forceDelete: js.UndefOr[Boolean] = js.undefined
}
object DeleteConnectorProfileRequest {
  
  inline def apply(connectorProfileName: ConnectorProfileName): DeleteConnectorProfileRequest = {
    val __obj = js.Dynamic.literal(connectorProfileName = connectorProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectorProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConnectorProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setForceDelete(value: Boolean): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
  }
}
