package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainsRequest extends js.Object {
  /**
    * The Elasticsearch domains for which you want information.
    */
  var DomainNames: DomainNameList = js.native
}

object DescribeElasticsearchDomainsRequest {
  @scala.inline
  def apply(DomainNames: DomainNameList): DescribeElasticsearchDomainsRequest = {
    val __obj = js.Dynamic.literal(DomainNames = DomainNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeElasticsearchDomainsRequest]
  }
}

