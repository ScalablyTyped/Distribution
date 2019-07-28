package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachThingPrincipalRequest extends js.Object {
  /**
    * The principal, such as a certificate or other credential.
    */
  var principal: Principal
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}

object AttachThingPrincipalRequest {
  @scala.inline
  def apply(principal: Principal, thingName: ThingName): AttachThingPrincipalRequest = {
    val __obj = js.Dynamic.literal(principal = principal, thingName = thingName)
  
    __obj.asInstanceOf[AttachThingPrincipalRequest]
  }
}

