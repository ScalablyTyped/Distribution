package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityPoolInput extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.IdentityPoolId
}

object DescribeIdentityPoolInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): DescribeIdentityPoolInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[DescribeIdentityPoolInput]
  }
}

