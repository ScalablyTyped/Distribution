package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DimensionAnalysisView
import typings.arcgisJsApi.esri.DimensionAnalysisViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsAnalysisDimensionAnalysisViewMod {
  
  @JSImport("esri/views/analysis/DimensionAnalysisView", JSImport.Namespace)
  @js.native
  /**
  		 * Represents the analysis view of a [DimensionAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionAnalysis.html) after it has been added to [SceneView.analyses](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#analyses).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html)
  		 */
  open class ^ ()
    extends StObject
       with DimensionAnalysisView {
    def this(properties: DimensionAnalysisViewProperties) = this()
  }
}
