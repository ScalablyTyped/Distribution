package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliceAnalysisProperties extends StObject {
  
  /**
  		 * The shape used to slice elements in a 3D scene.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html#shape)
  		 */
  var shape: js.UndefOr[SlicePlaneProperties] = js.undefined
  
  /**
  		 * Whether the [shape](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html#shape) supports a tilt angle or not.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html#tiltEnabled)
  		 */
  var tiltEnabled: js.UndefOr[Boolean] = js.undefined
}
object SliceAnalysisProperties {
  
  inline def apply(): SliceAnalysisProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceAnalysisProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliceAnalysisProperties] (val x: Self) extends AnyVal {
    
    inline def setShape(value: SlicePlaneProperties): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTiltEnabled(value: Boolean): Self = StObject.set(x, "tiltEnabled", value.asInstanceOf[js.Any])
    
    inline def setTiltEnabledUndefined: Self = StObject.set(x, "tiltEnabled", js.undefined)
  }
}
