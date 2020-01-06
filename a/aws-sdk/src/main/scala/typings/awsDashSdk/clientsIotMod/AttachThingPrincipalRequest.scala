package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachThingPrincipalRequest extends js.Object {
  /**
    * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
    */
  var principal: Principal = js.native
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}

object AttachThingPrincipalRequest {
  @scala.inline
  def apply(principal: Principal, thingName: ThingName): AttachThingPrincipalRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachThingPrincipalRequest]
  }
}

