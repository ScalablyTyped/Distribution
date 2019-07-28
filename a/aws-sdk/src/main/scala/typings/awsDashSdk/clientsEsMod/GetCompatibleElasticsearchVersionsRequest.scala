package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCompatibleElasticsearchVersionsRequest extends js.Object {
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsEsMod.DomainName] = js.undefined
}

object GetCompatibleElasticsearchVersionsRequest {
  @scala.inline
  def apply(DomainName: DomainName = null): GetCompatibleElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsRequest]
  }
}

