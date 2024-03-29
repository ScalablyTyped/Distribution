package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway to delete.
    */
  var GatewayArn: typings.awsSdk.clientsBackupgatewayMod.GatewayArn
}
object DeleteGatewayInput {
  
  inline def apply(GatewayArn: GatewayArn): DeleteGatewayInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGatewayInput] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
