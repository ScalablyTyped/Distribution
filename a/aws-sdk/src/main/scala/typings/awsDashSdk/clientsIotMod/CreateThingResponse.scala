package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThingResponse extends js.Object {
  /**
    * The ARN of the new thing.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.undefined
  /**
    * The name of the new thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}

object CreateThingResponse {
  @scala.inline
  def apply(thingArn: ThingArn = null, thingId: ThingId = null, thingName: ThingName = null): CreateThingResponse = {
    val __obj = js.Dynamic.literal()
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    if (thingId != null) __obj.updateDynamic("thingId")(thingId)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    __obj.asInstanceOf[CreateThingResponse]
  }
}

