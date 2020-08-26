package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseElevationLayerProperties extends LayerProperties {
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#spatialReference)
    *
    * @default {@link module:esri/geometry/SpatialReference#WebMercator SpatialReference.WebMercator}
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.native
}

object BaseElevationLayerProperties {
  @scala.inline
  def apply(): BaseElevationLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseElevationLayerProperties]
  }
  @scala.inline
  implicit class BaseElevationLayerPropertiesOps[Self <: BaseElevationLayerProperties] (val x: Self) extends AnyVal {
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
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    @scala.inline
    def setTileInfo(value: TileInfoProperties): Self = this.set("tileInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileInfo: Self = this.set("tileInfo", js.undefined)
  }
  
}

