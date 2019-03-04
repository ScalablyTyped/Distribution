package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorSearchSourceLocalSearchOptions
  extends stdLib.Object {
  /**
    * The distance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#localSearchOptions)
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum scale used to search locally.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#localSearchOptions)
    */
  var minScale: js.UndefOr[scala.Double] = js.undefined
}

object LocatorSearchSourceLocalSearchOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    distance: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null
  ): LocatorSearchSourceLocalSearchOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocatorSearchSourceLocalSearchOptions]
  }
}

