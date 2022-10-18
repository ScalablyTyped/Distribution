package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcConnectorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to delete. The ARN must be a full VPC connector ARN.
    */
  var VpcConnectorArn: AppRunnerResourceArn
}
object DeleteVpcConnectorRequest {
  
  inline def apply(VpcConnectorArn: AppRunnerResourceArn): DeleteVpcConnectorRequest = {
    val __obj = js.Dynamic.literal(VpcConnectorArn = VpcConnectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcConnectorRequest]
  }
  
  extension [Self <: DeleteVpcConnectorRequest](x: Self) {
    
    inline def setVpcConnectorArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcConnectorArn", value.asInstanceOf[js.Any])
  }
}
