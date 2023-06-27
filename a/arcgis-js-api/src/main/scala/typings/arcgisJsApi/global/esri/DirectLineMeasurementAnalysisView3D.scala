package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`direct-line-measurement-view-3d`
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DirectLineMeasurementAnalysisView3D")
@js.native
open class DirectLineMeasurementAnalysisView3D ()
  extends StObject
     with typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisView3D {
  def this(properties: Any) = this()
  
  /**
  		 * The direct line measurement analysis object associated with the analysis view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#analysis)
  		 */
  /* CompleteClass */
  override val analysis: typings.arcgisJsApi.esri.DirectLineMeasurementAnalysis = js.native
  
  /**
  		 * Result of the direct line measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#result)
  		 */
  /* CompleteClass */
  var result: DirectLineMeasurementAnalysisResult = js.native
  
  /**
  		 * The analysis view type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#type)
  		 */
  /* CompleteClass */
  override val `type`: `direct-line-measurement-view-3d` = js.native
  
  /**
  		 * When `true`, the analysis is visualized in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#visible)
  		 */
  /* CompleteClass */
  var visible: Boolean = js.native
}
