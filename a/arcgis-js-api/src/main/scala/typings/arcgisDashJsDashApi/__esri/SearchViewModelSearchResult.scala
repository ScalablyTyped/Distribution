package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSearchResult extends Object {
  /**
    * The extent, or bounding box, of the returned feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResult)
    */
  var extent: Extent
  /**
    * The resulting feature or location obtained from the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResult)
    */
  var feature: Graphic
  /**
    * The name of the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResult)
    */
  var name: String
}

object SearchViewModelSearchResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    extent: Extent,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SearchViewModelSearchResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, extent = extent, feature = feature, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SearchViewModelSearchResult]
  }
}

