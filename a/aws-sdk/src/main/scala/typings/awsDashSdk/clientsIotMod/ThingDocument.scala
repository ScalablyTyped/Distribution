package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingDocument extends js.Object {
  /**
    * The attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * Indicates whether the thing is connected to the AWS IoT service.
    */
  var connectivity: js.UndefOr[ThingConnectivity] = js.undefined
  /**
    * The shadow.
    */
  var shadow: js.UndefOr[JsonDocument] = js.undefined
  /**
    * Thing group names.
    */
  var thingGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.undefined
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}

object ThingDocument {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    connectivity: ThingConnectivity = null,
    shadow: JsonDocument = null,
    thingGroupNames: ThingGroupNameList = null,
    thingId: ThingId = null,
    thingName: ThingName = null,
    thingTypeName: ThingTypeName = null
  ): ThingDocument = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (connectivity != null) __obj.updateDynamic("connectivity")(connectivity)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (thingGroupNames != null) __obj.updateDynamic("thingGroupNames")(thingGroupNames)
    if (thingId != null) __obj.updateDynamic("thingId")(thingId)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    __obj.asInstanceOf[ThingDocument]
  }
}

