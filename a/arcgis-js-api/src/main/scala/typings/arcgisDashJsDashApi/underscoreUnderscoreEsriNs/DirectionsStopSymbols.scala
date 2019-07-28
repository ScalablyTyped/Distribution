package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsStopSymbols extends Object {
  /**
    * The first stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var first: js.UndefOr[Symbol] = js.undefined
  /**
    * The last stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var last: js.UndefOr[Symbol] = js.undefined
  /**
    * The middle stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var middle: js.UndefOr[Symbol] = js.undefined
  /**
    * An unlocated stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var unlocated: js.UndefOr[Symbol] = js.undefined
  /**
    * A waypoint stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var waypoint: js.UndefOr[Symbol] = js.undefined
}

object DirectionsStopSymbols {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    first: Symbol = null,
    last: Symbol = null,
    middle: Symbol = null,
    unlocated: Symbol = null,
    waypoint: Symbol = null
  ): DirectionsStopSymbols = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (first != null) __obj.updateDynamic("first")(first)
    if (last != null) __obj.updateDynamic("last")(last)
    if (middle != null) __obj.updateDynamic("middle")(middle)
    if (unlocated != null) __obj.updateDynamic("unlocated")(unlocated)
    if (waypoint != null) __obj.updateDynamic("waypoint")(waypoint)
    __obj.asInstanceOf[DirectionsStopSymbols]
  }
}

