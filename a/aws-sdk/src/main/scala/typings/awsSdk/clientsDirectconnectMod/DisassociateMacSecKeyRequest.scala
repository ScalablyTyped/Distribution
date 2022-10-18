package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMacSecKeyRequest extends StObject {
  
  /**
    * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx). You can use DescribeConnections or DescribeLags to retrieve connection ID.
    */
  var connectionId: ConnectionId
  
  /**
    * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key. You can use DescribeConnections to retrieve the ARN of the MAC Security (MACsec) secret key.
    */
  var secretARN: SecretARN
}
object DisassociateMacSecKeyRequest {
  
  inline def apply(connectionId: ConnectionId, secretARN: SecretARN): DisassociateMacSecKeyRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], secretARN = secretARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMacSecKeyRequest]
  }
  
  extension [Self <: DisassociateMacSecKeyRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setSecretARN(value: SecretARN): Self = StObject.set(x, "secretARN", value.asInstanceOf[js.Any])
  }
}
