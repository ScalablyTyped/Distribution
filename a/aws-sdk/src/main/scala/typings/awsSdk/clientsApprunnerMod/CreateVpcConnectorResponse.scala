package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcConnectorResponse extends StObject {
  
  /**
    * A description of the App Runner VPC connector that's created by this request.
    */
  var VpcConnector: typings.awsSdk.clientsApprunnerMod.VpcConnector
}
object CreateVpcConnectorResponse {
  
  inline def apply(VpcConnector: VpcConnector): CreateVpcConnectorResponse = {
    val __obj = js.Dynamic.literal(VpcConnector = VpcConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcConnectorResponse]
  }
  
  extension [Self <: CreateVpcConnectorResponse](x: Self) {
    
    inline def setVpcConnector(value: VpcConnector): Self = StObject.set(x, "VpcConnector", value.asInstanceOf[js.Any])
  }
}
