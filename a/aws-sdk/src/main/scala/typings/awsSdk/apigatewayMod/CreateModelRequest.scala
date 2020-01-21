package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelRequest extends js.Object {
  /**
    * [Required] The content-type for the model.
    */
  var contentType: String = js.native
  /**
    * The description of the model.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Required] The name of the model. Must be alphanumeric.
    */
  var name: String = js.native
  /**
    * [Required] The RestApi identifier under which the Model will be created.
    */
  var restApiId: String = js.native
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
    */
  var schema: js.UndefOr[String] = js.native
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
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelRequest]
  }
}

