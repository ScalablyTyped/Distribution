package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AreaMeasurementAnalysis
import typings.arcgisJsApi.esri.AreaMeasurementAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisAreaMeasurementAnalysisMod {
  
  @JSImport("esri/analysis/AreaMeasurementAnalysis", JSImport.Namespace)
  @js.native
  /**
    * AreaMeasurementAnalysis computes the area of a polygonal region and displays the measurement in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-AreaMeasurementAnalysis.html)
    */
  open class ^ ()
    extends StObject
       with AreaMeasurementAnalysis {
    def this(properties: AreaMeasurementAnalysisProperties) = this()
  }
}
