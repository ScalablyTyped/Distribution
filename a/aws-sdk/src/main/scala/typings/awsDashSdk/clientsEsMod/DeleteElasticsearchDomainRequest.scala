package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteElasticsearchDomainRequest extends js.Object {
  /**
    * The name of the Elasticsearch domain that you want to permanently delete.
    */
  var DomainName: typings.awsDashSdk.clientsEsMod.DomainName = js.native
}

object DeleteElasticsearchDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): DeleteElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteElasticsearchDomainRequest]
  }
}

