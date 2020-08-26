package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSourceFilter extends Object {
  /**
    * The filter geometry for suggests or search results. [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) is the only supported geometry when working with [locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html) sources. See [Find Address Candidates](https://developers.arcgis.com/rest/services-reference/find-address-candidates.htm) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var geometry: js.UndefOr[Geometry_] = js.native
  /**
    * The where clause specified for filtering suggests or search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var where: js.UndefOr[String] = js.native
}

object SearchSourceFilter {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SearchSourceFilter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SearchSourceFilter]
  }
  @scala.inline
  implicit class SearchSourceFilterOps[Self <: SearchSourceFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeometry(value: Geometry_): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

