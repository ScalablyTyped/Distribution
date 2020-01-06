package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDistributionConfigurationRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration to delete. 
    */
  var distributionConfigurationArn: DistributionConfigurationArn = js.native
}

object DeleteDistributionConfigurationRequest {
  @scala.inline
  def apply(distributionConfigurationArn: DistributionConfigurationArn): DeleteDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDistributionConfigurationRequest]
  }
}

