package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupProperties extends js.Object {
  /**
    * The thing group attributes in JSON format.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.native
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.native
}

object ThingGroupProperties {
  @scala.inline
  def apply(attributePayload: AttributePayload = null, thingGroupDescription: ThingGroupDescription = null): ThingGroupProperties = {
    val __obj = js.Dynamic.literal()
    if (attributePayload != null) __obj.updateDynamic("attributePayload")(attributePayload.asInstanceOf[js.Any])
    if (thingGroupDescription != null) __obj.updateDynamic("thingGroupDescription")(thingGroupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingGroupProperties]
  }
}

