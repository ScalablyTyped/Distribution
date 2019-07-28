package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileMatrixSet
  extends Accessor
     with JSONSupport {
  /**
    * The full extent of the TileMatrixSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#fullExtent)
    */
  var fullExtent: Extent = js.native
  /**
    * The unique ID assigned to the TileMatrixSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#id)
    */
  var id: String = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
}

@JSGlobal("__esri.TileMatrixSet")
@js.native
class TileMatrixSetCls () extends TileMatrixSet {
  def this(properties: TileMatrixSetProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

