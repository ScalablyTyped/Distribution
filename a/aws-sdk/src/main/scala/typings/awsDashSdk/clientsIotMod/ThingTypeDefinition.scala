package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeDefinition extends js.Object {
  /**
    * The thing type ARN.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
    */
  var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  /**
    * The ThingTypeProperties for the thing type.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
}

object ThingTypeDefinition {
  @scala.inline
  def apply(
    thingTypeArn: ThingTypeArn = null,
    thingTypeMetadata: ThingTypeMetadata = null,
    thingTypeName: ThingTypeName = null,
    thingTypeProperties: ThingTypeProperties = null
  ): ThingTypeDefinition = {
    val __obj = js.Dynamic.literal()
    if (thingTypeArn != null) __obj.updateDynamic("thingTypeArn")(thingTypeArn)
    if (thingTypeMetadata != null) __obj.updateDynamic("thingTypeMetadata")(thingTypeMetadata)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    if (thingTypeProperties != null) __obj.updateDynamic("thingTypeProperties")(thingTypeProperties)
    __obj.asInstanceOf[ThingTypeDefinition]
  }
}

