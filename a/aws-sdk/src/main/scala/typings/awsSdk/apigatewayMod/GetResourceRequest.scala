package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceRequest extends js.Object {
  /**
    * A query parameter to retrieve the specified resources embedded in the returned Resource representation in the response. This embed parameter value is a list of comma-separated strings. Currently, the request supports only retrieval of the embedded Method resources this way. The query parameter value must be a single-valued list and contain the "methods" string. For example, GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods.
    */
  var embed: js.UndefOr[ListOfString] = js.native
  /**
    * [Required] The identifier for the Resource resource.
    */
  var resourceId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object GetResourceRequest {
  @scala.inline
  def apply(resourceId: String, restApiId: String): GetResourceRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceRequest]
  }
  @scala.inline
  implicit class GetResourceRequestOps[Self <: GetResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbedVarargs(value: String*): Self = this.set("embed", js.Array(value :_*))
    @scala.inline
    def setEmbed(value: ListOfString): Self = this.set("embed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
  }
  
}

