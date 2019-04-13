package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThingRequest extends js.Object {
  /**
    * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.undefined
  /**
    * The name of the billing group the thing will be added to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  /**
    * The name of the thing to create.
    */
  var thingName: ThingName
  /**
    * The name of the thing type associated with the new thing.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}

object CreateThingRequest {
  @scala.inline
  def apply(
    thingName: ThingName,
    attributePayload: AttributePayload = null,
    billingGroupName: BillingGroupName = null,
    thingTypeName: ThingTypeName = null
  ): CreateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
    if (attributePayload != null) __obj.updateDynamic("attributePayload")(attributePayload)
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    __obj.asInstanceOf[CreateThingRequest]
  }
}

