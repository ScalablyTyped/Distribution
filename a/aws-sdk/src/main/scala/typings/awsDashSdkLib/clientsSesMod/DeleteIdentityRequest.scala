package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIdentityRequest extends js.Object {
  /**
    * The identity to be removed from the list of identities for the AWS Account.
    */
  var Identity: awsDashSdkLib.clientsSesMod.Identity
}

object DeleteIdentityRequest {
  @scala.inline
  def apply(Identity: Identity): DeleteIdentityRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity)
  
    __obj.asInstanceOf[DeleteIdentityRequest]
  }
}

