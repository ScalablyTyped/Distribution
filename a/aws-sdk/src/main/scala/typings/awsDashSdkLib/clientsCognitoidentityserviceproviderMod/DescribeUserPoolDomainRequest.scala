package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserPoolDomainRequest extends js.Object {
  /**
    * The domain string.
    */
  var Domain: DomainType
}

object DescribeUserPoolDomainRequest {
  @scala.inline
  def apply(Domain: DomainType): DescribeUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain)
  
    __obj.asInstanceOf[DescribeUserPoolDomainRequest]
  }
}

