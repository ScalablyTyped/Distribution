package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDomainsResult extends js.Object {
  /**
    * A list of domain names that match the expression.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.undefined
  /**
    * An opaque token indicating that there are more domains than the specified MaxNumberOfDomains still available.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListDomainsResult {
  @scala.inline
  def apply(DomainNames: DomainNameList = null, NextToken: String = null): ListDomainsResult = {
    val __obj = js.Dynamic.literal()
    if (DomainNames != null) __obj.updateDynamic("DomainNames")(DomainNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDomainsResult]
  }
}

