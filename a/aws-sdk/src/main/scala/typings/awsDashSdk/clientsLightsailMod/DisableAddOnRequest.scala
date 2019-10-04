package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableAddOnRequest extends js.Object {
  /**
    * The add-on type to disable.
    */
  var addOnType: AddOnType
  /**
    * The name of the source resource from which to disable the add-on.
    */
  var resourceName: ResourceName
}

object DisableAddOnRequest {
  @scala.inline
  def apply(addOnType: AddOnType, resourceName: ResourceName): DisableAddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any], resourceName = resourceName)
  
    __obj.asInstanceOf[DisableAddOnRequest]
  }
}

