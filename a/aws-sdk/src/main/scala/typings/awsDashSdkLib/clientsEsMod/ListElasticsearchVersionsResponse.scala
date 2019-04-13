package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListElasticsearchVersionsResponse extends js.Object {
  var ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListElasticsearchVersionsResponse {
  @scala.inline
  def apply(ElasticsearchVersions: ElasticsearchVersionList = null, NextToken: NextToken = null): ListElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (ElasticsearchVersions != null) __obj.updateDynamic("ElasticsearchVersions")(ElasticsearchVersions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListElasticsearchVersionsResponse]
  }
}

