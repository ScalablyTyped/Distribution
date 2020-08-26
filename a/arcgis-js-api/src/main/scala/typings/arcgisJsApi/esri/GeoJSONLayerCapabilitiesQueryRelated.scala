package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONLayerCapabilitiesQueryRelated extends Object {
  /**
    * Indicates if the layer's query response includes the number of features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsCount: Boolean = js.native
  /**
    * Indicates if the related features or records returned in the query response can be ordered by one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsOrderBy: Boolean = js.native
  /**
    * Indicates if the query response supports pagination for related features or records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsPagination: Boolean = js.native
}

object GeoJSONLayerCapabilitiesQueryRelated {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsCount: Boolean,
    supportsOrderBy: Boolean,
    supportsPagination: Boolean
  ): GeoJSONLayerCapabilitiesQueryRelated = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCount = supportsCount.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesQueryRelated]
  }
  @scala.inline
  implicit class GeoJSONLayerCapabilitiesQueryRelatedOps[Self <: GeoJSONLayerCapabilitiesQueryRelated] (val x: Self) extends AnyVal {
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
    def setSupportsCount(value: Boolean): Self = this.set("supportsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsOrderBy(value: Boolean): Self = this.set("supportsOrderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsPagination(value: Boolean): Self = this.set("supportsPagination", value.asInstanceOf[js.Any])
  }
  
}

