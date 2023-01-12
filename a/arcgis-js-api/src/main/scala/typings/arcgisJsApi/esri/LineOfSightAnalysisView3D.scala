package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`line-of-sight-view-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOfSightAnalysisView3D extends StObject {
  
  /**
    * The line of sight analysis object associated with the analysis view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#analysis)
    */
  val analysis: LineOfSightAnalysis
  
  /**
    * Set to `true` to enable interactivity for the associated [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#interactive)
    */
  var interactive: Boolean
  
  /**
    * Analysis results for each target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#results)
    */
  val results: Collection[LineOfSightAnalysisResult]
  
  /**
    * The analysis view type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#type)
    */
  val `type`: `line-of-sight-view-3d`
  
  /**
    * When `true`, the [analysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#analysis) is visualized in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#visible)
    */
  var visible: Boolean
}
object LineOfSightAnalysisView3D {
  
  inline def apply(
    analysis: LineOfSightAnalysis,
    interactive: Boolean,
    results: Collection[LineOfSightAnalysisResult],
    visible: Boolean
  ): LineOfSightAnalysisView3D = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line-of-sight-view-3d")
    __obj.asInstanceOf[LineOfSightAnalysisView3D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOfSightAnalysisView3D] (val x: Self) extends AnyVal {
    
    inline def setAnalysis(value: LineOfSightAnalysis): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setResults(value: Collection[LineOfSightAnalysisResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setType(value: `line-of-sight-view-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
