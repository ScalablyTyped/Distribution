package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteThingTypeRequest extends js.Object {
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName
}

object DeleteThingTypeRequest {
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DeleteThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName)
  
    __obj.asInstanceOf[DeleteThingTypeRequest]
  }
}

