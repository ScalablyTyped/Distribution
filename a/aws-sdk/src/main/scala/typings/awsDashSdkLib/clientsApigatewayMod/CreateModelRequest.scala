package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModelRequest extends js.Object {
  /**
    * [Required] The content-type for the model.
    */
  var contentType: String
  /**
    * The description of the model.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * [Required] The name of the model. Must be alphanumeric.
    */
  var name: String
  /**
    * [Required] The RestApi identifier under which the Model will be created.
    */
  var restApiId: String
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
    */
  var schema: js.UndefOr[String] = js.undefined
}

object CreateModelRequest {
  @scala.inline
  def apply(
    contentType: String,
    name: String,
    restApiId: String,
    description: String = null,
    schema: String = null
  ): CreateModelRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType, name = name, restApiId = restApiId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[CreateModelRequest]
  }
}

