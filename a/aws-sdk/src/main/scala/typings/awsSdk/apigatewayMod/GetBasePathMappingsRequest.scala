package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBasePathMappingsRequest extends js.Object {
  /**
    * [Required] The domain name of a BasePathMapping resource.
    */
  var domainName: String = js.native
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
}

object GetBasePathMappingsRequest {
  @scala.inline
  def apply(domainName: String): GetBasePathMappingsRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBasePathMappingsRequest]
  }
  @scala.inline
  implicit class GetBasePathMappingsRequestOps[Self <: GetBasePathMappingsRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: NullableInteger): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

