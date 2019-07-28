package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityInput extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityId
}

object DescribeIdentityInput {
  @scala.inline
  def apply(IdentityId: IdentityId): DescribeIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId)
  
    __obj.asInstanceOf[DescribeIdentityInput]
  }
}

