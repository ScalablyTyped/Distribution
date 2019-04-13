package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyDomainDkimRequest extends js.Object {
  /**
    * The name of the domain to be verified for Easy DKIM signing.
    */
  var Domain: awsDashSdkLib.clientsSesMod.Domain
}

object VerifyDomainDkimRequest {
  @scala.inline
  def apply(Domain: Domain): VerifyDomainDkimRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain)
  
    __obj.asInstanceOf[VerifyDomainDkimRequest]
  }
}

