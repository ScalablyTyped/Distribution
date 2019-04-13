package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThingTypeResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the thing type.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.undefined
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}

object CreateThingTypeResponse {
  @scala.inline
  def apply(
    thingTypeArn: ThingTypeArn = null,
    thingTypeId: ThingTypeId = null,
    thingTypeName: ThingTypeName = null
  ): CreateThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (thingTypeArn != null) __obj.updateDynamic("thingTypeArn")(thingTypeArn)
    if (thingTypeId != null) __obj.updateDynamic("thingTypeId")(thingTypeId)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    __obj.asInstanceOf[CreateThingTypeResponse]
  }
}

