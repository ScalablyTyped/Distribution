package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcConnectorResponse extends StObject {
  
  /**
    * A description of the App Runner VPC connector that this request just deleted.
    */
  var VpcConnector: typings.awsSdk.clientsApprunnerMod.VpcConnector
}
object DeleteVpcConnectorResponse {
  
  inline def apply(VpcConnector: VpcConnector): DeleteVpcConnectorResponse = {
    val __obj = js.Dynamic.literal(VpcConnector = VpcConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcConnectorResponse]
  }
  
  extension [Self <: DeleteVpcConnectorResponse](x: Self) {
    
    inline def setVpcConnector(value: VpcConnector): Self = StObject.set(x, "VpcConnector", value.asInstanceOf[js.Any])
  }
}
