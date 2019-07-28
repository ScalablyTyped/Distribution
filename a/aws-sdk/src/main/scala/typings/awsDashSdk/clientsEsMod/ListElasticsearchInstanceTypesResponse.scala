package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListElasticsearchInstanceTypesResponse extends js.Object {
  /**
    *  List of instance types supported by Amazon Elasticsearch service for given  ElasticsearchVersion  
    */
  var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.undefined
  /**
    * In case if there are more results available NextToken would be present, make further request to the same API with received NextToken to paginate remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEsMod.NextToken] = js.undefined
}

object ListElasticsearchInstanceTypesResponse {
  @scala.inline
  def apply(ElasticsearchInstanceTypes: ElasticsearchInstanceTypeList = null, NextToken: NextToken = null): ListElasticsearchInstanceTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (ElasticsearchInstanceTypes != null) __obj.updateDynamic("ElasticsearchInstanceTypes")(ElasticsearchInstanceTypes)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListElasticsearchInstanceTypesResponse]
  }
}

