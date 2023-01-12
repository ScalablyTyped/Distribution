package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateConnectPeerResponse extends StObject {
  
  /**
    * The response to the Connect peer request.
    */
  var ConnectPeerAssociation: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ConnectPeerAssociation] = js.undefined
}
object AssociateConnectPeerResponse {
  
  inline def apply(): AssociateConnectPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateConnectPeerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateConnectPeerResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectPeerAssociation(value: ConnectPeerAssociation): Self = StObject.set(x, "ConnectPeerAssociation", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerAssociationUndefined: Self = StObject.set(x, "ConnectPeerAssociation", js.undefined)
  }
}
