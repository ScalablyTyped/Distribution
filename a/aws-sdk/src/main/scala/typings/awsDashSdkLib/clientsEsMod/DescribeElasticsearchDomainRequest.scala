package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticsearchDomainRequest extends js.Object {
  /**
    * The name of the Elasticsearch domain for which you want information.
    */
  var DomainName: awsDashSdkLib.clientsEsMod.DomainName
}

object DescribeElasticsearchDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DescribeElasticsearchDomainRequest]
  }
}

