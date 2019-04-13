package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityInput extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: awsDashSdkLib.clientsCognitoidentityMod.IdentityId
}

object DescribeIdentityInput {
  @scala.inline
  def apply(IdentityId: IdentityId): DescribeIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId)
  
    __obj.asInstanceOf[DescribeIdentityInput]
  }
}

