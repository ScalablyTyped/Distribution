package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SliceAnalysis
import typings.arcgisJsApi.esri.SliceAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisSliceAnalysisMod {
  
  @JSImport("esri/analysis/SliceAnalysis", JSImport.Namespace)
  @js.native
  /**
    * SliceAnalysis can be used to programmatically create a plane that slices through 3D features in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html)
    */
  open class ^ ()
    extends StObject
       with SliceAnalysis {
    def this(properties: SliceAnalysisProperties) = this()
  }
}
