package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInfrastructureConfigurationResponse extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that was updated by this request. 
    */
  var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object UpdateInfrastructureConfigurationResponse {
  @scala.inline
  def apply(
    clientToken: ClientToken = null,
    infrastructureConfigurationArn: InfrastructureConfigurationArn = null,
    requestId: NonEmptyString = null
  ): UpdateInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (infrastructureConfigurationArn != null) __obj.updateDynamic("infrastructureConfigurationArn")(infrastructureConfigurationArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfrastructureConfigurationResponse]
  }
}

