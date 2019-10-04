package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableAddOnRequest extends js.Object {
  /**
    * An array of strings representing the add-on to enable or modify.
    */
  var addOnRequest: AddOnRequest
  /**
    * The name of the source resource for which to enable or modify the add-on.
    */
  var resourceName: ResourceName
}

object EnableAddOnRequest {
  @scala.inline
  def apply(addOnRequest: AddOnRequest, resourceName: ResourceName): EnableAddOnRequest = {
    val __obj = js.Dynamic.literal(addOnRequest = addOnRequest, resourceName = resourceName)
  
    __obj.asInstanceOf[EnableAddOnRequest]
  }
}

