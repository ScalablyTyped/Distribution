package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTapeInput extends StObject {
  
  /**
    * Set to TRUE to delete an archived tape that belongs to a custom pool with tape retention lock. Only archived tapes with tape retention lock set to governance can be deleted. Archived tapes with tape retention lock set to compliance can't be deleted.
    */
  var BypassGovernanceRetention: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with. Use the ListGateways operation to return a list of gateways for your account and Amazon Web Services Region.
    */
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape to delete.
    */
  var TapeARN: typings.awsSdk.clientsStoragegatewayMod.TapeARN
}
object DeleteTapeInput {
  
  inline def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): DeleteTapeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapeInput]
  }
  
  extension [Self <: DeleteTapeInput](x: Self) {
    
    inline def setBypassGovernanceRetention(value: scala.Boolean): Self = StObject.set(x, "BypassGovernanceRetention", value.asInstanceOf[js.Any])
    
    inline def setBypassGovernanceRetentionUndefined: Self = StObject.set(x, "BypassGovernanceRetention", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
  }
}
