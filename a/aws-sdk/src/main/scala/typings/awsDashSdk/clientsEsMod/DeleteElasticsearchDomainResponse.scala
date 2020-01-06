package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteElasticsearchDomainResponse extends js.Object {
  /**
    * The status of the Elasticsearch domain being deleted.
    */
  var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.native
}

object DeleteElasticsearchDomainResponse {
  @scala.inline
  def apply(DomainStatus: ElasticsearchDomainStatus = null): DeleteElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteElasticsearchDomainResponse]
  }
}

