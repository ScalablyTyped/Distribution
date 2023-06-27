package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`slice-view-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliceAnalysisView3D extends StObject {
  
  /**
  		 * Only one [SliceAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html) at a time can be active in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html#active)
  		 */
  var active: Boolean
  
  /**
  		 * The direct line measurement analysis object associated with the analysis view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html#analysis)
  		 */
  val analysis: SliceAnalysis
  
  /**
  		 * Set to `true` to enable interactivity for the associated [SliceAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html).
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html#interactive)
  		 */
  var interactive: Boolean
  
  val `type`: `slice-view-3d`
  
  /**
  		 * When `true`, the analysis is visualized in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html#visible)
  		 */
  var visible: Boolean
}
object SliceAnalysisView3D {
  
  inline def apply(active: Boolean, analysis: SliceAnalysis, interactive: Boolean, visible: Boolean): SliceAnalysisView3D = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], analysis = analysis.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("slice-view-3d")
    __obj.asInstanceOf[SliceAnalysisView3D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliceAnalysisView3D] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAnalysis(value: SliceAnalysis): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setType(value: `slice-view-3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
