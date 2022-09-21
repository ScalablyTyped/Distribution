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
}
object SliceAnalysisProperties {
  
  inline def apply(): SliceAnalysisProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceAnalysisProperties]
  }
  
  extension [Self <: SliceAnalysisProperties](x: Self) {
    
    inline def setShape(value: SlicePlaneProperties): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
