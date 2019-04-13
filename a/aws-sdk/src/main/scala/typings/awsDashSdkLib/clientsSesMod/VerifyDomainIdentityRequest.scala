package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyDomainIdentityRequest extends js.Object {
  /**
    * The domain to be verified.
    */
  var Domain: awsDashSdkLib.clientsSesMod.Domain
}

object VerifyDomainIdentityRequest {
  @scala.inline
  def apply(Domain: Domain): VerifyDomainIdentityRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain)
  
    __obj.asInstanceOf[VerifyDomainIdentityRequest]
  }
}

