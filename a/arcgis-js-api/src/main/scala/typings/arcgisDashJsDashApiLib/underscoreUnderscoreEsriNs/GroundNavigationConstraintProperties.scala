package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundNavigationConstraintProperties
  extends stdLib.Object {
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object GroundNavigationConstraintProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String = null
  ): GroundNavigationConstraintProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GroundNavigationConstraintProperties]
  }
}

