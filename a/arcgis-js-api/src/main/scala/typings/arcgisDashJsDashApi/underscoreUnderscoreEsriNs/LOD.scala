package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LOD
  extends Accessor
     with JSONSupport {
  /**
    * ID for each level. The top most level is `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#level)
    */
  var level: Double = js.native
  /**
    * String to be used when constructing a URL to access a tile from this LOD. If `levelValue` is not defined, level will be used for the tile access URL. This property is useful when an LOD object represents a WMTS TileMatrix with non-numeric matrix identifiers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#levelValue)
    */
  var levelValue: String = js.native
  /**
    * Resolution in map units of each pixel in a tile for each level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#resolution)
    */
  var resolution: Double = js.native
  /**
    * Scale for each level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#scale)
    */
  var scale: Double = js.native
}

@JSGlobal("__esri.LOD")
@js.native
class LODCls () extends LOD {
  def this(properties: LODProperties) = this()
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

