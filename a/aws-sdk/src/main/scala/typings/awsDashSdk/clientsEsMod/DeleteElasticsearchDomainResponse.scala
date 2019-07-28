package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteElasticsearchDomainResponse extends js.Object {
  /**
    * The status of the Elasticsearch domain being deleted.
    */
  var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
}

object DeleteElasticsearchDomainResponse {
  @scala.inline
  def apply(DomainStatus: ElasticsearchDomainStatus = null): DeleteElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus)
    __obj.asInstanceOf[DeleteElasticsearchDomainResponse]
  }
}

