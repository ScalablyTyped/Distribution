package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingFilterBlockFilterMode extends Object {
  /**
    * Defines how features are drawn while the filter is active. The same filter mode type can only be used once in a filter. To filter multiple elements as solid, add them to a single filter block instead of creating several filter blocks that use the `solid` filter mode.  **Possible Values:** solid | wire-frame
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    *
    * @default solid
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BuildingFilterBlockFilterMode {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String = null
  ): BuildingFilterBlockFilterMode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingFilterBlockFilterMode]
  }
}

