package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`line-of-sight-view-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.LineOfSightAnalysisView3D")
@js.native
open class LineOfSightAnalysisView3D ()
  extends StObject
     with typings.arcgisJsApi.esri.LineOfSightAnalysisView3D {
  def this(properties: Any) = this()
  
  /**
    * The line of sight analysis object associated with the analysis view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#analysis)
    */
  /* CompleteClass */
  override val analysis: typings.arcgisJsApi.esri.LineOfSightAnalysis = js.native
  
  /**
    * Set to `true` to enable interactivity for the associated [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#interactive)
    */
  /* CompleteClass */
  var interactive: Boolean = js.native
  
  /**
    * Analysis results for each target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#results)
    */
  /* CompleteClass */
  override val results: typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.LineOfSightAnalysisResult] = js.native
  
  /**
    * The analysis view type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#type)
    */
  /* CompleteClass */
  override val `type`: `line-of-sight-view-3d` = js.native
  
  /**
    * When `true`, the [analysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#analysis) is visualized in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#visible)
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
