package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeProperties extends js.Object {
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[SearchableAttributes] = js.undefined
  /**
    * The description of the thing type.
    */
  var thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.undefined
}

object ThingTypeProperties {
  @scala.inline
  def apply(
    searchableAttributes: SearchableAttributes = null,
    thingTypeDescription: ThingTypeDescription = null
  ): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes)
    if (thingTypeDescription != null) __obj.updateDynamic("thingTypeDescription")(thingTypeDescription)
    __obj.asInstanceOf[ThingTypeProperties]
  }
}

