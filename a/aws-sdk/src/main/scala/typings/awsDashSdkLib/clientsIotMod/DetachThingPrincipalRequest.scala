package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachThingPrincipalRequest extends js.Object {
  /**
    * If the principal is a certificate, this value must be ARN of the certificate. If the principal is an Amazon Cognito identity, this value must be the ID of the Amazon Cognito identity.
    */
  var principal: Principal
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}

object DetachThingPrincipalRequest {
  @scala.inline
  def apply(principal: Principal, thingName: ThingName): DetachThingPrincipalRequest = {
    val __obj = js.Dynamic.literal(principal = principal, thingName = thingName)
  
    __obj.asInstanceOf[DetachThingPrincipalRequest]
  }
}

