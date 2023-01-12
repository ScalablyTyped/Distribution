package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateConnectPeerResponse extends StObject {
  
  /**
    * Describes the Connect peer association.
    */
  var ConnectPeerAssociation: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ConnectPeerAssociation] = js.undefined
}
object DisassociateConnectPeerResponse {
  
  inline def apply(): DisassociateConnectPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateConnectPeerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateConnectPeerResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectPeerAssociation(value: ConnectPeerAssociation): Self = StObject.set(x, "ConnectPeerAssociation", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerAssociationUndefined: Self = StObject.set(x, "ConnectPeerAssociation", js.undefined)
  }
}
