package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIdentityPoolInput extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.IdentityPoolId
}

object DeleteIdentityPoolInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): DeleteIdentityPoolInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[DeleteIdentityPoolInput]
  }
}

