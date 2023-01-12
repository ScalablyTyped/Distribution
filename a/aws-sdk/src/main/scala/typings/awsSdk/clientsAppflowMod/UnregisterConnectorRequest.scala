package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnregisterConnectorRequest extends StObject {
  
  /**
    * The label of the connector. The label is unique for each ConnectorRegistration in your Amazon Web Services account.
    */
  var connectorLabel: ConnectorLabel
  
  /**
    * Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one or more connector profiles. The default value is false.
    */
  var forceDelete: js.UndefOr[Boolean] = js.undefined
}
object UnregisterConnectorRequest {
  
  inline def apply(connectorLabel: ConnectorLabel): UnregisterConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorLabel = connectorLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregisterConnectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnregisterConnectorRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "connectorLabel", value.asInstanceOf[js.Any])
    
    inline def setForceDelete(value: Boolean): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
  }
}
