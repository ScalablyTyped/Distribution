package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInfrastructureConfigurationResponse extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that was deleted. 
    */
  var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteInfrastructureConfigurationResponse {
  @scala.inline
  def apply(
    infrastructureConfigurationArn: InfrastructureConfigurationArn = null,
    requestId: NonEmptyString = null
  ): DeleteInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (infrastructureConfigurationArn != null) __obj.updateDynamic("infrastructureConfigurationArn")(infrastructureConfigurationArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInfrastructureConfigurationResponse]
  }
}

