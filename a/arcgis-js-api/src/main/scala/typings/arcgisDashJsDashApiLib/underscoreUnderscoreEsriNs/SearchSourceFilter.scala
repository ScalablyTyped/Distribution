package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSourceFilter
  extends stdLib.Object {
  /**
    * The filter geometry for suggests or search results. [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) is the only supported geometry when working with [locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html) sources. See [Find Address Candidates](https://developers.arcgis.com/rest/services-reference/find-address-candidates.htm) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var geometry: js.UndefOr[Geometry] = js.undefined
  /**
    * The where clause specified for filtering suggests or search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var where: js.UndefOr[java.lang.String] = js.undefined
}

object SearchSourceFilter {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    geometry: Geometry = null,
    where: java.lang.String = null
  ): SearchSourceFilter = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[SearchSourceFilter]
  }
}

