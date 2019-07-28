package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingGroupProperties extends js.Object {
  /**
    * The thing group attributes in JSON format.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.undefined
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined
}

object ThingGroupProperties {
  @scala.inline
  def apply(attributePayload: AttributePayload = null, thingGroupDescription: ThingGroupDescription = null): ThingGroupProperties = {
    val __obj = js.Dynamic.literal()
    if (attributePayload != null) __obj.updateDynamic("attributePayload")(attributePayload)
    if (thingGroupDescription != null) __obj.updateDynamic("thingGroupDescription")(thingGroupDescription)
    __obj.asInstanceOf[ThingGroupProperties]
  }
}

