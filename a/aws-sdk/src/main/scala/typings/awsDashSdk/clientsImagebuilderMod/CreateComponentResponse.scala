package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComponentResponse extends js.Object {
  /**
    * CThe idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * CThe Amazon Resource Name (ARN) of the component that was created by this request.
    */
  var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.native
  /**
    * CThe request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object CreateComponentResponse {
  @scala.inline
  def apply(
    clientToken: ClientToken = null,
    componentBuildVersionArn: ComponentBuildVersionArn = null,
    requestId: NonEmptyString = null
  ): CreateComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (componentBuildVersionArn != null) __obj.updateDynamic("componentBuildVersionArn")(componentBuildVersionArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentResponse]
  }
}

