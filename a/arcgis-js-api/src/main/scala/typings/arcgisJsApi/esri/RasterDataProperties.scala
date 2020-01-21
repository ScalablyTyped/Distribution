package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterDataProperties extends js.Object {
  /**
    * Specifies the format of the raster data, such as "jpg", "tif", etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#format)
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The ID of the uploaded file returned as a result of the upload operation. For ArcGIS Server 10.1 and greater, this class can be used to specify an uploaded item as input by specifying the ItemID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#itemId)
    */
  var itemId: js.UndefOr[String] = js.undefined
  /**
    * URL to the location of the raster data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}

object RasterDataProperties {
  @scala.inline
  def apply(format: String = null, itemId: String = null, url: String = null): RasterDataProperties = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterDataProperties]
  }
}

