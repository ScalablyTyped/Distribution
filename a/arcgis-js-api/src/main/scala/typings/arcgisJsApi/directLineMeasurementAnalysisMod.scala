package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysis
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisConstructor
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directLineMeasurementAnalysisMod extends Shortcut {
  
  @JSImport("esri/analysis/DirectLineMeasurementAnalysis", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectLineMeasurementAnalysisConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/analysis/DirectLineMeasurementAnalysis", JSImport.Namespace)
  @js.native
  /**
    * DirectLineMeasurementAnalysis computes the distance between two points and displays the measurement in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html)
    */
  open class Class ()
    extends StObject
       with DirectLineMeasurementAnalysis {
    def this(properties: DirectLineMeasurementAnalysisProperties) = this()
  }
  
  type _To = js.Object & DirectLineMeasurementAnalysisConstructor
  
  /* This means you don't have to write `^`, but can instead just say `directLineMeasurementAnalysisMod.foo` */
  override def _to: js.Object & DirectLineMeasurementAnalysisConstructor = ^
}
