package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudRendererProperties extends StObject {
  
  /**
    * Reduces the brightness of the point's color, based on the value of another field, usually `intensity`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    */
  var colorModulation: js.UndefOr[PointCloudRendererColorModulation] = js.undefined
  
  /**
    * Specifies how the size of the points in the point cloud is computed for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var pointSizeAlgorithm: js.UndefOr[PointCloudRendererPointSizeAlgorithm] = js.undefined
  
  /**
    * The number of points to draw per display inch.
    *
    * @default 10
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointsPerInch)
    */
  var pointsPerInch: js.UndefOr[Double] = js.undefined
}
object PointCloudRendererProperties {
  
  inline def apply(): PointCloudRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudRendererProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCloudRendererProperties] (val x: Self) extends AnyVal {
    
    inline def setColorModulation(value: PointCloudRendererColorModulation): Self = StObject.set(x, "colorModulation", value.asInstanceOf[js.Any])
    
    inline def setColorModulationUndefined: Self = StObject.set(x, "colorModulation", js.undefined)
    
    inline def setPointSizeAlgorithm(value: PointCloudRendererPointSizeAlgorithm): Self = StObject.set(x, "pointSizeAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPointSizeAlgorithmUndefined: Self = StObject.set(x, "pointSizeAlgorithm", js.undefined)
    
    inline def setPointsPerInch(value: Double): Self = StObject.set(x, "pointsPerInch", value.asInstanceOf[js.Any])
    
    inline def setPointsPerInchUndefined: Self = StObject.set(x, "pointsPerInch", js.undefined)
  }
}
