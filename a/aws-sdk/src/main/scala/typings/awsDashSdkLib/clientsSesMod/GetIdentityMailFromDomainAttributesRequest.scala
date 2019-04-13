package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityMailFromDomainAttributesRequest extends js.Object {
  /**
    * A list of one or more identities.
    */
  var Identities: IdentityList
}

object GetIdentityMailFromDomainAttributesRequest {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityMailFromDomainAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities)
  
    __obj.asInstanceOf[GetIdentityMailFromDomainAttributesRequest]
  }
}

