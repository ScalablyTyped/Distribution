package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInfrastructureConfigurationRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration to delete. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
}

object DeleteInfrastructureConfigurationRequest {
  @scala.inline
  def apply(infrastructureConfigurationArn: InfrastructureConfigurationArn): DeleteInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteInfrastructureConfigurationRequest]
  }
}

