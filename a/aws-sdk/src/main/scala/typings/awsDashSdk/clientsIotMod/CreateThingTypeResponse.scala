package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingTypeResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the thing type.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.native
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object CreateThingTypeResponse {
  @scala.inline
  def apply(
    thingTypeArn: ThingTypeArn = null,
    thingTypeId: ThingTypeId = null,
    thingTypeName: ThingTypeName = null
  ): CreateThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (thingTypeArn != null) __obj.updateDynamic("thingTypeArn")(thingTypeArn.asInstanceOf[js.Any])
    if (thingTypeId != null) __obj.updateDynamic("thingTypeId")(thingTypeId.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingTypeResponse]
  }
}

