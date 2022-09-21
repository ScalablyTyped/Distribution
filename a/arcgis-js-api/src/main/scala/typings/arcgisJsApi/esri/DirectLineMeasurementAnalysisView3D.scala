package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`direct-line-measurement-view-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectLineMeasurementAnalysisView3D extends StObject {
  
  /**
    * The direct line measurement analysis object associated with the analysis view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#analysis)
    */
  val analysis: DirectLineMeasurementAnalysis
  
  /**
    * Result of the direct line measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#result)
    */
  var result: DirectLineMeasurementAnalysisResult
  
  /**
    * The analysis view type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#type)
    */
  val `type`: `direct-line-measurement-view-3d`
  
  /**
    * When `true`, the analysis is visualized in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#visible)
    */
  var visible: Boolean
}
object DirectLineMeasurementAnalysisView3D {
  
  inline def apply(
    analysis: DirectLineMeasurementAnalysis,
    result: DirectLineMeasurementAnalysisResult,
    visible: Boolean
  ): DirectLineMeasurementAnalysisView3D = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("direct-line-measurement-view-3d")
    __obj.asInstanceOf[DirectLineMeasurementAnalysisView3D]
  }
  
  extension [Self <: DirectLineMeasurementAnalysisView3D](x: Self) {
    
    inline def setAnalysis(value: DirectLineMeasurementAnalysis): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setResult(value: DirectLineMeasurementAnalysisResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setType(value: `direct-line-measurement-view-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
