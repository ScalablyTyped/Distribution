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
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    distance: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null
  ): LocatorSearchSourceLocalSearchOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocatorSearchSourceLocalSearchOptions]
  }
}

