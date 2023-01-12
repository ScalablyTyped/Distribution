package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateGatewayToServerOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a gateway.
    */
  var GatewayArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.GatewayArn] = js.undefined
}
object AssociateGatewayToServerOutput {
  
  inline def apply(): AssociateGatewayToServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateGatewayToServerOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateGatewayToServerOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
  }
}
