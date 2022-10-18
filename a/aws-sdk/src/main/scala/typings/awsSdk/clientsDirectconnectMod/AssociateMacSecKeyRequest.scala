package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateMacSecKeyRequest extends StObject {
  
  /**
    * The MAC Security (MACsec) CAK to associate with the dedicated connection. You can create the CKN/CAK pair using an industry standard tool.  The valid values are 64 hexadecimal characters (0-9, A-E). If you use this request parameter, you must use the ckn request parameter and not use the secretARN request parameter.
    */
  var cak: js.UndefOr[Cak] = js.undefined
  
  /**
    * The MAC Security (MACsec) CKN to associate with the dedicated connection. You can create the CKN/CAK pair using an industry standard tool.  The valid values are 64 hexadecimal characters (0-9, A-E). If you use this request parameter, you must use the cak request parameter and not use the secretARN request parameter.
    */
  var ckn: js.UndefOr[Ckn] = js.undefined
  
  /**
    * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx). You can use DescribeConnections or DescribeLags to retrieve connection ID.
    */
  var connectionId: ConnectionId
  
  /**
    * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection. You can use DescribeConnections or DescribeLags to retrieve the MAC Security (MACsec) secret key. If you use this request parameter, you do not use the ckn and cak request parameters.
    */
  var secretARN: js.UndefOr[SecretARN] = js.undefined
}
object AssociateMacSecKeyRequest {
  
  inline def apply(connectionId: ConnectionId): AssociateMacSecKeyRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMacSecKeyRequest]
  }
  
  extension [Self <: AssociateMacSecKeyRequest](x: Self) {
    
    inline def setCak(value: Cak): Self = StObject.set(x, "cak", value.asInstanceOf[js.Any])
    
    inline def setCakUndefined: Self = StObject.set(x, "cak", js.undefined)
    
    inline def setCkn(value: Ckn): Self = StObject.set(x, "ckn", value.asInstanceOf[js.Any])
    
    inline def setCknUndefined: Self = StObject.set(x, "ckn", js.undefined)
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setSecretARN(value: SecretARN): Self = StObject.set(x, "secretARN", value.asInstanceOf[js.Any])
    
    inline def setSecretARNUndefined: Self = StObject.set(x, "secretARN", js.undefined)
  }
}
