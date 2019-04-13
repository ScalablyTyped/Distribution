package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesResource extends js.Object {
  /**
    * The unique ID for the application.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The attribute type for the application.
    */
  var AttributeType: js.UndefOr[__string] = js.undefined
  /**
    * The attributes for the application.
    */
  var Attributes: js.UndefOr[ListOf__string] = js.undefined
}

object AttributesResource {
  @scala.inline
  def apply(ApplicationId: __string = null, AttributeType: __string = null, Attributes: ListOf__string = null): AttributesResource = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[AttributesResource]
  }
}

