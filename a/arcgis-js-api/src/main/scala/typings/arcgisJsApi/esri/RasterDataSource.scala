package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.raster
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterDataSource extends Object {
  /**
    * The name of the raster in the registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var dataSourceName: String = js.native
  /**
    * This value is always `raster`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var `type`: raster = js.native
  /**
    * The workspace where the raster resides as defined in the ArcGIS Server Manager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var workspaceId: String = js.native
}

object RasterDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSourceName: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: raster,
    workspaceId: String
  ): RasterDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dataSourceName = dataSourceName.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterDataSource]
  }
  @scala.inline
  implicit class RasterDataSourceOps[Self <: RasterDataSource] (val x: Self) extends AnyVal {
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
    def setDataSourceName(value: String): Self = this.set("dataSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: raster): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
  }
  
}

