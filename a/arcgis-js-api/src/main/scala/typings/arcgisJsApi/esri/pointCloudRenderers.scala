package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A convenience module for importing [PointCloudRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html). For example, rather than importing renderers one at a time like this:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-pointCloudRenderers.html)
  */
@JSGlobal("__esri.pointCloudRenderers")
@js.native
object pointCloudRenderers extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer
    - typings.arcgisJsApi.esri.PointCloudRGBRenderer
    - typings.arcgisJsApi.esri.PointCloudStretchRenderer
    - typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer
  */
  trait PointCloudRenderer extends js.Object
  
  type PointCloudClassBreaksRenderer = typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer
  type PointCloudRGBRenderer = typings.arcgisJsApi.esri.PointCloudRGBRenderer
  type PointCloudStretchRenderer = typings.arcgisJsApi.esri.PointCloudStretchRenderer
  type PointCloudUniqueValueRenderer = typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer
}

