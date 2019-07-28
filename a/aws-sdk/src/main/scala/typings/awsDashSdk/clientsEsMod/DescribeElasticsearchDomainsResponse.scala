package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticsearchDomainsResponse extends js.Object {
  /**
    * The status of the domains requested in the DescribeElasticsearchDomains request.
    */
  var DomainStatusList: ElasticsearchDomainStatusList
}

object DescribeElasticsearchDomainsResponse {
  @scala.inline
  def apply(DomainStatusList: ElasticsearchDomainStatusList): DescribeElasticsearchDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList)
  
    __obj.asInstanceOf[DescribeElasticsearchDomainsResponse]
  }
}

