package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
  /**
    *  A map of compatible Elasticsearch versions returned as part of the  GetCompatibleElasticsearchVersions  operation. 
    */
  var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.undefined
}

object GetCompatibleElasticsearchVersionsResponse {
  @scala.inline
  def apply(CompatibleElasticsearchVersions: CompatibleElasticsearchVersionsList = null): GetCompatibleElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (CompatibleElasticsearchVersions != null) __obj.updateDynamic("CompatibleElasticsearchVersions")(CompatibleElasticsearchVersions)
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
  }
}

