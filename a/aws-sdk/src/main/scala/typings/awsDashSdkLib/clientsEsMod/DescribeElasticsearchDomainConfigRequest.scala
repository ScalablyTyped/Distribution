package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticsearchDomainConfigRequest extends js.Object {
  /**
    * The Elasticsearch domain that you want to get information about.
    */
  var DomainName: awsDashSdkLib.clientsEsMod.DomainName
}

object DescribeElasticsearchDomainConfigRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigRequest]
  }
}

