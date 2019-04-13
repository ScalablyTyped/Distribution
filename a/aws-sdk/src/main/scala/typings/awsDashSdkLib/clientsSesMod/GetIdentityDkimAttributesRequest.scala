package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityDkimAttributesRequest extends js.Object {
  /**
    * A list of one or more verified identities - email addresses, domains, or both.
    */
  var Identities: IdentityList
}

object GetIdentityDkimAttributesRequest {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities)
  
    __obj.asInstanceOf[GetIdentityDkimAttributesRequest]
  }
}

