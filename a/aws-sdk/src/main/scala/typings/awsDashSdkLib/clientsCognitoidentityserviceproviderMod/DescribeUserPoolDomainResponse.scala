package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserPoolDomainResponse extends js.Object {
  /**
    * A domain description object containing information about the domain.
    */
  var DomainDescription: js.UndefOr[DomainDescriptionType] = js.undefined
}

object DescribeUserPoolDomainResponse {
  @scala.inline
  def apply(DomainDescription: DomainDescriptionType = null): DescribeUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainDescription != null) __obj.updateDynamic("DomainDescription")(DomainDescription)
    __obj.asInstanceOf[DescribeUserPoolDomainResponse]
  }
}

