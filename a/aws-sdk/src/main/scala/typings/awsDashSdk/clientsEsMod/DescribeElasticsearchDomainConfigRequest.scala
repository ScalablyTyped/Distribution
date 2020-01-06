package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainConfigRequest extends js.Object {
  /**
    * The Elasticsearch domain that you want to get information about.
    */
  var DomainName: typings.awsDashSdk.clientsEsMod.DomainName = js.native
}

object DescribeElasticsearchDomainConfigRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigRequest]
  }
}

