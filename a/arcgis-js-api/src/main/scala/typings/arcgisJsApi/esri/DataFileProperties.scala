package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFileProperties extends js.Object {
  /**
    * The ID of the uploaded file returned as a result of the upload operation. For ArcGIS Server 10.1 and greater services that support uploads, this class can be used to specify an uploaded item as input by specifying the itemID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html#itemId)
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * URL to the location of the data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object DataFileProperties {
  @scala.inline
  def apply(): DataFileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFileProperties]
  }
  @scala.inline
  implicit class DataFilePropertiesOps[Self <: DataFileProperties] (val x: Self) extends AnyVal {
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
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

