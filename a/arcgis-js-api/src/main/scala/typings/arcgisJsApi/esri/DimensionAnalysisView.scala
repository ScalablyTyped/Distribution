package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionAnalysisView
  extends StObject
     with Accessor {
  
  /**
    * The dimension analysis object associated with the analysis view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#analysis)
    */
  val analysis: DimensionAnalysis = js.native
  
  /**
    * Starts the interactive creation of new dimensions and adds them to the [analysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#analysis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#createLengthDimensions)
    */
  def createLengthDimensions(): js.Promise[Any] = js.native
  def createLengthDimensions(options: DimensionAnalysisViewCreateLengthDimensionsOptions): js.Promise[Any] = js.native
  
  /**
    * Set to `true` to enable interactivity for the [analysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#analysis).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#interactive)
    */
  var interactive: Boolean = js.native
  
  /**
    * Results for each dimension in the [analysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#analysis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#results)
    */
  val results: Collection[LengthDimensionResult] = js.native
  
  /**
    * The selected dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#selectedDimension)
    */
  var selectedDimension: LengthDimension = js.native
  
  /**
    * When `true`, the [analysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#analysis) is visualized in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#visible)
    */
  var visible: Boolean = js.native
}
