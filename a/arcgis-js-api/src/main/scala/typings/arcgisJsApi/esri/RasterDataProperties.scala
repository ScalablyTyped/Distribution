package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterDataProperties extends js.Object {
  /**
    * Specifies the format of the raster data, such as "jpg", "tif", etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#format)
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The ID of the uploaded file returned as a result of the upload operation. For ArcGIS Server 10.1 and greater, this class can be used to specify an uploaded item as input by specifying the ItemID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#itemId)
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * URL to the location of the raster data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object RasterDataProperties {
  @scala.inline
  def apply(): RasterDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterDataProperties]
  }
  @scala.inline
  implicit class RasterDataPropertiesOps[Self <: RasterDataProperties] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

