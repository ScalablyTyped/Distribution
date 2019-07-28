package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeThingTypeResponse extends js.Object {
  /**
    * The thing type ARN.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.undefined
  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
    */
  var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  /**
    * The ThingTypeProperties contains information about the thing type including description, and a list of searchable thing attribute names.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
}

object DescribeThingTypeResponse {
  @scala.inline
  def apply(
    thingTypeArn: ThingTypeArn = null,
    thingTypeId: ThingTypeId = null,
    thingTypeMetadata: ThingTypeMetadata = null,
    thingTypeName: ThingTypeName = null,
    thingTypeProperties: ThingTypeProperties = null
  ): DescribeThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (thingTypeArn != null) __obj.updateDynamic("thingTypeArn")(thingTypeArn)
    if (thingTypeId != null) __obj.updateDynamic("thingTypeId")(thingTypeId)
    if (thingTypeMetadata != null) __obj.updateDynamic("thingTypeMetadata")(thingTypeMetadata)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    if (thingTypeProperties != null) __obj.updateDynamic("thingTypeProperties")(thingTypeProperties)
    __obj.asInstanceOf[DescribeThingTypeResponse]
  }
}

