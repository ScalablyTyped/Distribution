package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDomainResponse extends js.Object {
  var DomainStatus: js.UndefOr[DomainStatus] = js.undefined
}

object DeleteDomainResponse {
  @scala.inline
  def apply(DomainStatus: DomainStatus = null): DeleteDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus)
    __obj.asInstanceOf[DeleteDomainResponse]
  }
}

