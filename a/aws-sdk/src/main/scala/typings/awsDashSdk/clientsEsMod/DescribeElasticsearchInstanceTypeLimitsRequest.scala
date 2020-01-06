package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchInstanceTypeLimitsRequest extends js.Object {
  /**
    *  DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for Elasticsearch  Limits  for existing domain. 
    */
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsEsMod.DomainName] = js.native
  /**
    *  Version of Elasticsearch for which  Limits  are needed. 
    */
  var ElasticsearchVersion: ElasticsearchVersionString = js.native
  /**
    *  The instance type for an Elasticsearch cluster for which Elasticsearch  Limits  are needed. 
    */
  var InstanceType: ESPartitionInstanceType = js.native
}

object DescribeElasticsearchInstanceTypeLimitsRequest {
  @scala.inline
  def apply(
    ElasticsearchVersion: ElasticsearchVersionString,
    InstanceType: ESPartitionInstanceType,
    DomainName: DomainName = null
  ): DescribeElasticsearchInstanceTypeLimitsRequest = {
    val __obj = js.Dynamic.literal(ElasticsearchVersion = ElasticsearchVersion.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsRequest]
  }
}

