package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingTypeResponse extends js.Object {
  /**
    * The thing type ARN.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.native
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.native
  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
    */
  var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
  /**
    * The ThingTypeProperties contains information about the thing type including description, and a list of searchable thing attribute names.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.native
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
    if (thingTypeArn != null) __obj.updateDynamic("thingTypeArn")(thingTypeArn.asInstanceOf[js.Any])
    if (thingTypeId != null) __obj.updateDynamic("thingTypeId")(thingTypeId.asInstanceOf[js.Any])
    if (thingTypeMetadata != null) __obj.updateDynamic("thingTypeMetadata")(thingTypeMetadata.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    if (thingTypeProperties != null) __obj.updateDynamic("thingTypeProperties")(thingTypeProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingTypeResponse]
  }
}

