package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributePayload extends js.Object {
  /**
    * A JSON string containing up to three key-value pair in JSON format. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * Specifies whether the list of attributes provided in the AttributePayload is merged with the attributes stored in the registry, instead of overwriting them. To remove an attribute, call UpdateThing with an empty attribute value.  The merge attribute is only valid when calling UpdateThing or UpdateThingGroup. 
    */
  var merge: js.UndefOr[Flag] = js.undefined
}

object AttributePayload {
  @scala.inline
  def apply(attributes: Attributes = null, merge: js.UndefOr[scala.Boolean] = js.undefined): AttributePayload = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    __obj.asInstanceOf[AttributePayload]
  }
}

