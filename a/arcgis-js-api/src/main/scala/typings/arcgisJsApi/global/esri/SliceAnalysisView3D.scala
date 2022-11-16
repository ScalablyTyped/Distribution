package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`slice-view-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SliceAnalysisView3D")
@js.native
open class SliceAnalysisView3D ()
  extends StObject
     with typings.arcgisJsApi.esri.SliceAnalysisView3D {
  def this(properties: Any) = this()
  
  /**
    * Only one [SliceAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html) at a time can be active in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html#active)
    */
  /* CompleteClass */
  var active: Boolean = js.native
  
  /**
    * The direct line measurement analysis object associated with the analysis view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html#analysis)
    */
  /* CompleteClass */
  override val analysis: typings.arcgisJsApi.esri.SliceAnalysis = js.native
  
  /**
    * Set to `true` to enable interactivity for the associated [SliceAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html#interactive)
    */
  /* CompleteClass */
  var interactive: Boolean = js.native
  
  /* CompleteClass */
  override val `type`: `slice-view-3d` = js.native
  
  /**
    * When `true`, the analysis is visualized in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html#visible)
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
