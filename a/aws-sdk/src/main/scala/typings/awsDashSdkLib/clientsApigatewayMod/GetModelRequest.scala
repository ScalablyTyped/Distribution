package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetModelRequest extends js.Object {
  /**
    * A query parameter of a Boolean value to resolve (true) all external model references and returns a flattened model schema or not (false) The default is false.
    */
  var flatten: js.UndefOr[Boolean] = js.undefined
  /**
    * [Required] The name of the model as an identifier.
    */
  var modelName: String
  /**
    * [Required] The RestApi identifier under which the Model exists.
    */
  var restApiId: String
}

object GetModelRequest {
  @scala.inline
  def apply(modelName: String, restApiId: String, flatten: js.UndefOr[Boolean] = js.undefined): GetModelRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName, restApiId = restApiId)
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten)
    __obj.asInstanceOf[GetModelRequest]
  }
}

