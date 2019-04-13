package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityProviderResponse extends js.Object {
  /**
    * The identity provider that was deleted.
    */
  var IdentityProvider: IdentityProviderType
}

object DescribeIdentityProviderResponse {
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): DescribeIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider)
  
    __obj.asInstanceOf[DescribeIdentityProviderResponse]
  }
}

