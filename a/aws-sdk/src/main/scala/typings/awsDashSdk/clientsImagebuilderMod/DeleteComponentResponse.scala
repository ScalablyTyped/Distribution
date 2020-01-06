package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteComponentResponse extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the component build version that was deleted. 
    */
  var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteComponentResponse {
  @scala.inline
  def apply(componentBuildVersionArn: ComponentBuildVersionArn = null, requestId: NonEmptyString = null): DeleteComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (componentBuildVersionArn != null) __obj.updateDynamic("componentBuildVersionArn")(componentBuildVersionArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentResponse]
  }
}

