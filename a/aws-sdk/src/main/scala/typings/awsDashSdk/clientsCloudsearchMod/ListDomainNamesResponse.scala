package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDomainNamesResponse extends js.Object {
  /**
    * The names of the search domains owned by an account.
    */
  var DomainNames: js.UndefOr[DomainNameMap] = js.undefined
}

object ListDomainNamesResponse {
  @scala.inline
  def apply(DomainNames: DomainNameMap = null): ListDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainNames != null) __obj.updateDynamic("DomainNames")(DomainNames)
    __obj.asInstanceOf[ListDomainNamesResponse]
  }
}

