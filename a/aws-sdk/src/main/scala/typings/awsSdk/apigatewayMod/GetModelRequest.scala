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
  def apply(modelName: String, restApiId: String): GetModelRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelRequest]
  }
  @scala.inline
  implicit class GetModelRequestOps[Self <: GetModelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
  }
  
}

