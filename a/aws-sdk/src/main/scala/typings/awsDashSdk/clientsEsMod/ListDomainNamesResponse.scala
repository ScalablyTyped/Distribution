package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainNamesResponse extends js.Object {
  /**
    * List of Elasticsearch domain names.
    */
  var DomainNames: js.UndefOr[DomainInfoList] = js.native
}

object ListDomainNamesResponse {
  @scala.inline
  def apply(DomainNames: DomainInfoList = null): ListDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainNames != null) __obj.updateDynamic("DomainNames")(DomainNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainNamesResponse]
  }
}

