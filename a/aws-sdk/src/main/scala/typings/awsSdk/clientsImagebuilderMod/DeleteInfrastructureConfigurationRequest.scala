package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInfrastructureConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration to delete.
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn
}
object DeleteInfrastructureConfigurationRequest {
  
  inline def apply(infrastructureConfigurationArn: InfrastructureConfigurationArn): DeleteInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInfrastructureConfigurationRequest]
  }
  
  extension [Self <: DeleteInfrastructureConfigurationRequest](x: Self) {
    
    inline def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
  }
}
