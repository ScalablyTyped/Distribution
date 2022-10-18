package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SliceAnalysis
import typings.arcgisJsApi.esri.SliceAnalysisConstructor
import typings.arcgisJsApi.esri.SliceAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisSliceAnalysisMod extends Shortcut {
  
  @JSImport("esri/analysis/SliceAnalysis", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SliceAnalysisConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/analysis/SliceAnalysis", JSImport.Namespace)
  @js.native
  /**
    * SliceAnalysis can be used to programmatically create a plane that slices through 3D features in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html)
    */
  open class Class ()
    extends StObject
       with SliceAnalysis {
    def this(properties: SliceAnalysisProperties) = this()
  }
  
  type _To = js.Object & SliceAnalysisConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriAnalysisSliceAnalysisMod.foo` */
  override def _to: js.Object & SliceAnalysisConstructor = ^
}
