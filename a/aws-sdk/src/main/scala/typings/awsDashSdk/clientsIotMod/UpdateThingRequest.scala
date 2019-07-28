package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateThingRequest extends js.Object {
  /**
    * A list of thing attributes, a JSON string containing name-value pairs. For example:  {\"attributes\":{\"name1\":\"value2\"}}  This data is used to add new attributes or update existing attributes.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.undefined
  /**
    * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the UpdateThing request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  /**
    * Remove a thing type association. If true, the association is removed.
    */
  var removeThingType: js.UndefOr[RemoveThingType] = js.undefined
  /**
    * The name of the thing to update.
    */
  var thingName: ThingName
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}

object UpdateThingRequest {
  @scala.inline
  def apply(
    thingName: ThingName,
    attributePayload: AttributePayload = null,
    expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
    removeThingType: js.UndefOr[RemoveThingType] = js.undefined,
    thingTypeName: ThingTypeName = null
  ): UpdateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
    if (attributePayload != null) __obj.updateDynamic("attributePayload")(attributePayload)
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion)
    if (!js.isUndefined(removeThingType)) __obj.updateDynamic("removeThingType")(removeThingType)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    __obj.asInstanceOf[UpdateThingRequest]
  }
}

