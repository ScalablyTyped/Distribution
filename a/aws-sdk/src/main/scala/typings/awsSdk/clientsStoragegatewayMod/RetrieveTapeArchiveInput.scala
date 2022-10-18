package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveTapeArchiveInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the ListGateways operation to return a list of gateways for your account and Amazon Web Services Region. You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
    */
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
    */
  var TapeARN: typings.awsSdk.clientsStoragegatewayMod.TapeARN
}
object RetrieveTapeArchiveInput {
  
  inline def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): RetrieveTapeArchiveInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveTapeArchiveInput]
  }
  
  extension [Self <: RetrieveTapeArchiveInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
  }
}
