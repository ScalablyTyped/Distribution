package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelArchivalInput extends StObject {
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape you want to cancel archiving for.
    */
  var TapeARN: typings.awsSdk.clientsStoragegatewayMod.TapeARN
}
object CancelArchivalInput {
  
  inline def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): CancelArchivalInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelArchivalInput]
  }
  
  extension [Self <: CancelArchivalInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
  }
}
