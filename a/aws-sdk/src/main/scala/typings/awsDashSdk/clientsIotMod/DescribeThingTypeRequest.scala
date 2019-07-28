package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeThingTypeRequest extends js.Object {
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName
}

object DescribeThingTypeRequest {
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DescribeThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName)
  
    __obj.asInstanceOf[DescribeThingTypeRequest]
  }
}

