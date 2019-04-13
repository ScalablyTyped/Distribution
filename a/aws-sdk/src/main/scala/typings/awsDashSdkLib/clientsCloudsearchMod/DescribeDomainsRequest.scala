package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDomainsRequest extends js.Object {
  /**
    * The names of the domains you want to include in the response.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.undefined
}

object DescribeDomainsRequest {
  @scala.inline
  def apply(DomainNames: DomainNameList = null): DescribeDomainsRequest = {
    val __obj = js.Dynamic.literal()
    if (DomainNames != null) __obj.updateDynamic("DomainNames")(DomainNames)
    __obj.asInstanceOf[DescribeDomainsRequest]
  }
}

