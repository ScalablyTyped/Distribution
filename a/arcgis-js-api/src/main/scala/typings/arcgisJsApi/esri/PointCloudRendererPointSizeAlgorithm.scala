package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`fixed-size`
import typings.arcgisJsApi.arcgisJsApiStrings.splat
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudRendererPointSizeAlgorithm
  extends StObject
     with Object {
  
  /**
    * Specifies the scale factor that is applied to the size estimated by the density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Point size in meters (`useRealWorldSymbolSizes = true`) or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * `fixed-size` or `splat`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var `type`: `fixed-size` | splat
  
  /**
    * Specifies whether `size` is in real world units or screen-space units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.undefined
}
object PointCloudRendererPointSizeAlgorithm {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `fixed-size` | splat
  ): PointCloudRendererPointSizeAlgorithm = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudRendererPointSizeAlgorithm]
  }
  
  @scala.inline
  implicit class PointCloudRendererPointSizeAlgorithmMutableBuilder[Self <: PointCloudRendererPointSizeAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: `fixed-size` | splat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRealWorldSymbolSizes(value: Boolean): Self = StObject.set(x, "useRealWorldSymbolSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRealWorldSymbolSizesUndefined: Self = StObject.set(x, "useRealWorldSymbolSizes", js.undefined)
  }
}
