package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DimensionAnalysis
import typings.arcgisJsApi.esri.DimensionAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisDimensionAnalysisMod {
  
  @JSImport("esri/analysis/DimensionAnalysis", JSImport.Namespace)
  @js.native
  /**
    * DimensionAnalysis enables the creation and display of measurement annotations for lengths and distances in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionAnalysis.html)
    */
  open class ^ ()
    extends StObject
       with DimensionAnalysis {
    def this(properties: DimensionAnalysisProperties) = this()
  }
}
