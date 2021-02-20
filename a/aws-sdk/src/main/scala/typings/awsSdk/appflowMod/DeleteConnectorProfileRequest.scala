package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConnectorProfileRequest extends StObject {
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in your account. 
    */
  var connectorProfileName: ConnectorProfileName = js.native
  
  /**
    *  Indicates whether Amazon AppFlow should delete the profile, even if it is currently in use in one or more flows. 
    */
  var forceDelete: js.UndefOr[Boolean] = js.native
}
object DeleteConnectorProfileRequest {
  
  @scala.inline
  def apply(connectorProfileName: ConnectorProfileName): DeleteConnectorProfileRequest = {
    val __obj = js.Dynamic.literal(connectorProfileName = connectorProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectorProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteConnectorProfileRequestMutableBuilder[Self <: DeleteConnectorProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDelete(value: Boolean): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
  }
}
