package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.`line-of-sight-view-3d`
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.LineOfSightAnalysis
import typings.arcgisJsApi.esri.LineOfSightAnalysisResult
import typings.arcgisJsApi.esri.LineOfSightAnalysisView3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dAnalysisLineOfSightAnalysisView3DMod {
  
  @JSImport("esri/views/3d/analysis/LineOfSightAnalysisView3D", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LineOfSightAnalysisView3D {
    def this(properties: Any) = this()
    
    /**
    		 * The line of sight analysis object associated with the analysis view.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#analysis)
    		 */
    /* CompleteClass */
    override val analysis: LineOfSightAnalysis = js.native
    
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
    override val results: Collection[LineOfSightAnalysisResult] = js.native
    
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
}
