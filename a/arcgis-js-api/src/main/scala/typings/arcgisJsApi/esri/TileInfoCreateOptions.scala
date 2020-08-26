package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileInfoCreateOptions extends Object {
  /**
    * An array of scale values to use for the TileInfo. If none are specified, the scales from the [ArcGIS Online basemaps](https://www.arcgis.com/home/group.html?id=702026e41f6641fb85da88efe79dc166#overview) are used from level 0 through 24.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    *
    * @default The scales provided by ArcGIS Online basemaps
    */
  var scales: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The size of each tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    *
    * @default 256
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * The spatial reference for the new TileInfo instance. If the spatial reference is not WGS84 nor WebMercator, the origin of the TileInfo is `0.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    *
    * @default WebMercator
    */
  var spatialReference: js.UndefOr[SpatialReference] = js.native
}

object TileInfoCreateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): TileInfoCreateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[TileInfoCreateOptions]
  }
  @scala.inline
  implicit class TileInfoCreateOptionsOps[Self <: TileInfoCreateOptions] (val x: Self) extends AnyVal {
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
    def setScalesVarargs(value: Double*): Self = this.set("scales", js.Array(value :_*))
    @scala.inline
    def setScales(value: js.Array[Double]): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
  }
  
}

