package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterData
  extends Accessor
     with JSONSupport {
  /**
    * Specifies the format of the raster data, such as "jpg", "tif", etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#format)
    */
  var format: String = js.native
  /**
    * The ID of the uploaded file returned as a result of the upload operation. For ArcGIS Server 10.1 and greater, this class can be used to specify an uploaded item as input by specifying the ItemID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#itemId)
    */
  var itemId: String = js.native
  /**
    * URL to the location of the raster data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#url)
    */
  var url: String = js.native
}

@JSGlobal("__esri.RasterData")
@js.native
class RasterDataCls () extends RasterData {
  def this(properties: RasterDataProperties) = this()
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

