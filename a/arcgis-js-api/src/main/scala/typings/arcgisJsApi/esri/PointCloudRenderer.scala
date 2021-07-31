package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud-class-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud-rgb`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud-stretch`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud-unique-value`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudRenderer
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Reduces the brightness of the point's color, based on the value of another field, usually `intensity`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    */
  var colorModulation: PointCloudRendererColorModulation = js.native
  
  /**
    * Specifies how the size of the points in the point cloud is computed for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = js.native
  
  /**
    * The number of points to draw per display inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointsPerInch)
    */
  var pointsPerInch: Double = js.native
  
  /**
    * The point cloud renderer type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#type)
    */
  val `type`: `point-cloud-class-breaks` | `point-cloud-rgb` | `point-cloud-stretch` | `point-cloud-unique-value` = js.native
}
