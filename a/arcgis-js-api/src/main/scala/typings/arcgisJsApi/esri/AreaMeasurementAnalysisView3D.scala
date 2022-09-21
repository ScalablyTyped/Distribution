package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`area-measurement-view-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurementAnalysisView3D extends StObject {
  
  /**
    * The area measurement analysis object associated with the analysis view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#analysis)
    */
  val analysis: AreaMeasurementAnalysis
  
  /**
    * Result of the area measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#result)
    */
  var result: AreaMeasurementAnalysisResult
  
  /**
    * The analysis view type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#type)
    */
  val `type`: `area-measurement-view-3d`
  
  /**
    * When `true`, the analysis is visualized in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#visible)
    */
  var visible: Boolean
}
object AreaMeasurementAnalysisView3D {
  
  inline def apply(analysis: AreaMeasurementAnalysis, result: AreaMeasurementAnalysisResult, visible: Boolean): AreaMeasurementAnalysisView3D = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("area-measurement-view-3d")
    __obj.asInstanceOf[AreaMeasurementAnalysisView3D]
  }
  
  extension [Self <: AreaMeasurementAnalysisView3D](x: Self) {
    
    inline def setAnalysis(value: AreaMeasurementAnalysis): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setResult(value: AreaMeasurementAnalysisResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setType(value: `area-measurement-view-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
