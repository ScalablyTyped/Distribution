package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelRequest extends js.Object {
  /**
    * A query parameter of a Boolean value to resolve (true) all external model references and returns a flattened model schema or not (false) The default is false.
    */
  var flatten: js.UndefOr[Boolean] = js.native
  /**
    * [Required] The name of the model as an identifier.
    */
  var modelName: String = js.native
  /**
    * [Required] The RestApi identifier under which the Model exists.
    */
  var restApiId: String = js.native
}

object GetModelRequest {
  @scala.inline
  def apply(modelName: String, restApiId: String, flatten: js.UndefOr[Boolean] = js.undefined): GetModelRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelRequest]
  }
}

