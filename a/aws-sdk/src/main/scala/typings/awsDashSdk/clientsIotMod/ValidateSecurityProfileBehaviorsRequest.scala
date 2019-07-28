package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateSecurityProfileBehaviorsRequest extends js.Object {
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: Behaviors
}

object ValidateSecurityProfileBehaviorsRequest {
  @scala.inline
  def apply(behaviors: Behaviors): ValidateSecurityProfileBehaviorsRequest = {
    val __obj = js.Dynamic.literal(behaviors = behaviors)
  
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsRequest]
  }
}

