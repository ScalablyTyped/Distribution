package typings.awsSdk.backupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway you deleted.
    */
  var GatewayArn: js.UndefOr[typings.awsSdk.backupgatewayMod.GatewayArn] = js.undefined
}
object DeleteGatewayOutput {
  
  inline def apply(): DeleteGatewayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGatewayOutput]
  }
  
  extension [Self <: DeleteGatewayOutput](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
  }
}
