package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`stay-above`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundNavigationConstraintProperties extends Object {
  /**
    * The type of the constraint. It can be one of the following:
    *
    * Value      | Description
    * -----------|--------------------
    * stay-above | User can only navigate above ground surface
    * none       | User can navigate above and below the ground surface
    *
    * Default value: stay-above
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var `type`: js.UndefOr[`stay-above` | none] = js.undefined
}

object GroundNavigationConstraintProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `stay-above` | none = null
  ): GroundNavigationConstraintProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundNavigationConstraintProperties]
  }
}

