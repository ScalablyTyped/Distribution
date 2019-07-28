package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainResult extends js.Object {
  /**
    * An array of key-value pairs containing information about your get domain request.
    */
  var domain: js.UndefOr[Domain] = js.undefined
}

object GetDomainResult {
  @scala.inline
  def apply(domain: Domain = null): GetDomainResult = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    __obj.asInstanceOf[GetDomainResult]
  }
}

