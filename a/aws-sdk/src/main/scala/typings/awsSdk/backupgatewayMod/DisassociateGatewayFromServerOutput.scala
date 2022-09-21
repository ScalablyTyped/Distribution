package typings.awsSdk.backupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateGatewayFromServerOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway you disassociated.
    */
  var GatewayArn: js.UndefOr[typings.awsSdk.backupgatewayMod.GatewayArn] = js.undefined
}
object DisassociateGatewayFromServerOutput {
  
  inline def apply(): DisassociateGatewayFromServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateGatewayFromServerOutput]
  }
  
  extension [Self <: DisassociateGatewayFromServerOutput](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
  }
}
