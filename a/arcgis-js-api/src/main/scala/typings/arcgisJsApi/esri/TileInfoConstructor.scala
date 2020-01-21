package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileInfoConstructor
  extends Instantiable0[TileInfo]
     with Instantiable1[/* properties */ TileInfoProperties, TileInfo] {
  /**
    * A convenience method used to create a new TileInfo instance with preset properties like [LODs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods). Optionally, properties such as `size`, `scales[]`, and a `[SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html)` can also be set to calculate [LODs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods) for each TileInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    *
    * @param options An object that contains the size, scales, and/or [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) used to compute the new TileInfo instance.
    * @param options.size The size of each tile in pixels.
    * @param options.spatialReference The spatial reference for the new TileInfo instance. If the spatial reference is not WGS84 nor WebMercator, the origin of the TileInfo is `0.0`.
    * @param options.scales An array of scale values to use for the TileInfo. If none are specified, the scales from the [ArcGIS Online basemaps](https://www.arcgis.com/home/group.html?id=702026e41f6641fb85da88efe79dc166#overview) are used from level 0 through 24.
    *
    */
  def create(): TileInfo = js.native
  def create(options: TileInfoCreateOptions): TileInfo = js.native
  def fromJSON(json: js.Any): TileInfo = js.native
}

