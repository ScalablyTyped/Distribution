package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcGISMapServiceCapabilitiesOperations extends Object {
  /**
    * Indicates if the service can generate images.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsExportMap: Boolean = js.native
  /**
    * Indicates if the tiles from the service can be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsExportTiles: Boolean = js.native
  /**
    * Indicates if features in the sublayers can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsQuery: Boolean = js.native
  /**
    * Indicates if the service exposes a tile map that describes the presence of tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsTileMap: Boolean = js.native
}

object ArcGISMapServiceCapabilitiesOperations {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsExportMap: Boolean,
    supportsExportTiles: Boolean,
    supportsQuery: Boolean,
    supportsTileMap: Boolean
  ): ArcGISMapServiceCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsExportMap = supportsExportMap.asInstanceOf[js.Any], supportsExportTiles = supportsExportTiles.asInstanceOf[js.Any], supportsQuery = supportsQuery.asInstanceOf[js.Any], supportsTileMap = supportsTileMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesOperations]
  }
  @scala.inline
  implicit class ArcGISMapServiceCapabilitiesOperationsOps[Self <: ArcGISMapServiceCapabilitiesOperations] (val x: Self) extends AnyVal {
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
    def setSupportsExportMap(value: Boolean): Self = this.set("supportsExportMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsExportTiles(value: Boolean): Self = this.set("supportsExportTiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsQuery(value: Boolean): Self = this.set("supportsQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsTileMap(value: Boolean): Self = this.set("supportsTileMap", value.asInstanceOf[js.Any])
  }
  
}

