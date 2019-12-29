package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.raster
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterDataSource extends Object {
  /**
    * The name of the raster in the registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var dataSourceName: String
  /**
    * This value is always `raster`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var `type`: raster
  /**
    * The workspace where the raster resides as defined in the ArcGIS Server Manager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var workspaceId: String
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
}

