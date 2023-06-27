package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysis
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisDirectLineMeasurementAnalysisMod {
  
  @JSImport("esri/analysis/DirectLineMeasurementAnalysis", JSImport.Namespace)
  @js.native
  /**
  		 * DirectLineMeasurementAnalysis computes the distance between two points and displays the measurement in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html)
  		 */
  open class ^ ()
    extends StObject
       with DirectLineMeasurementAnalysis {
    def this(properties: DirectLineMeasurementAnalysisProperties) = this()
  }
}
