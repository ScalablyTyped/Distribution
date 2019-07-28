package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticsearchDomainResponse extends js.Object {
  /**
    * The current status of the Elasticsearch domain.
    */
  var DomainStatus: ElasticsearchDomainStatus
}

object DescribeElasticsearchDomainResponse {
  @scala.inline
  def apply(DomainStatus: ElasticsearchDomainStatus): DescribeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal(DomainStatus = DomainStatus)
  
    __obj.asInstanceOf[DescribeElasticsearchDomainResponse]
  }
}

