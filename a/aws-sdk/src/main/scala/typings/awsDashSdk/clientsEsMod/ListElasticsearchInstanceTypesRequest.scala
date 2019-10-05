package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListElasticsearchInstanceTypesRequest extends js.Object {
  /**
    * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for list of available Elasticsearch instance types when modifying existing domain. 
    */
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsEsMod.DomainName] = js.undefined
  /**
    * Version of Elasticsearch for which list of supported elasticsearch instance types are needed. 
    */
  var ElasticsearchVersion: ElasticsearchVersionString
  /**
    *  Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be honored. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsEsMod.MaxResults] = js.undefined
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEsMod.NextToken] = js.undefined
}

object ListElasticsearchInstanceTypesRequest {
  @scala.inline
  def apply(
    ElasticsearchVersion: ElasticsearchVersionString,
    DomainName: DomainName = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null
  ): ListElasticsearchInstanceTypesRequest = {
    val __obj = js.Dynamic.literal(ElasticsearchVersion = ElasticsearchVersion)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListElasticsearchInstanceTypesRequest]
  }
}

