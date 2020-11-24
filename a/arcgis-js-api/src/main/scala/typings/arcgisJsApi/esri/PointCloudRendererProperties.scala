package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudRendererProperties extends js.Object {
  
  /**
    * Reduces the brightness of the point's color, based on the value of another field, usually `intensity`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    */
  var colorModulation: js.UndefOr[PointCloudRendererColorModulation] = js.native
  
  /**
    * Specifies how the size of the points in the point cloud is computed for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var pointSizeAlgorithm: js.UndefOr[PointCloudRendererPointSizeAlgorithm] = js.native
  
  /**
    * The number of points to draw per display inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointsPerInch)
    */
  var pointsPerInch: js.UndefOr[Double] = js.native
}
object PointCloudRendererProperties {
  
  @scala.inline
  def apply(): PointCloudRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudRendererProperties]
  }
  
  @scala.inline
  implicit class PointCloudRendererPropertiesOps[Self <: PointCloudRendererProperties] (val x: Self) extends AnyVal {
    
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
    def setColorModulation(value: PointCloudRendererColorModulation): Self = this.set("colorModulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorModulation: Self = this.set("colorModulation", js.undefined)
    
    @scala.inline
    def setPointSizeAlgorithm(value: PointCloudRendererPointSizeAlgorithm): Self = this.set("pointSizeAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSizeAlgorithm: Self = this.set("pointSizeAlgorithm", js.undefined)
    
    @scala.inline
    def setPointsPerInch(value: Double): Self = this.set("pointsPerInch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsPerInch: Self = this.set("pointsPerInch", js.undefined)
  }
}
