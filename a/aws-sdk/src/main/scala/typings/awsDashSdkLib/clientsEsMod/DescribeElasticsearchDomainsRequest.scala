package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticsearchDomainsRequest extends js.Object {
  /**
    * The Elasticsearch domains for which you want information.
    */
  var DomainNames: DomainNameList
}

object DescribeElasticsearchDomainsRequest {
  @scala.inline
  def apply(DomainNames: DomainNameList): DescribeElasticsearchDomainsRequest = {
    val __obj = js.Dynamic.literal(DomainNames = DomainNames)
  
    __obj.asInstanceOf[DescribeElasticsearchDomainsRequest]
  }
}

