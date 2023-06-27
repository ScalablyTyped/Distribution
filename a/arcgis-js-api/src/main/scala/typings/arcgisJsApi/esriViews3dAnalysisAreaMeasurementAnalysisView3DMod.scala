package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.`area-measurement-view-3d`
import typings.arcgisJsApi.esri.AreaMeasurementAnalysis
import typings.arcgisJsApi.esri.AreaMeasurementAnalysisResult
import typings.arcgisJsApi.esri.AreaMeasurementAnalysisView3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dAnalysisAreaMeasurementAnalysisView3DMod {
  
  @JSImport("esri/views/3d/analysis/AreaMeasurementAnalysisView3D", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AreaMeasurementAnalysisView3D {
    def this(properties: Any) = this()
    
    /**
    		 * The area measurement analysis object associated with the analysis view.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#analysis)
    		 */
    /* CompleteClass */
    override val analysis: AreaMeasurementAnalysis = js.native
    
    /**
    		 * Result of the area measurement.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#result)
    		 */
    /* CompleteClass */
    var result: AreaMeasurementAnalysisResult = js.native
    
    /**
    		 * The analysis view type.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#type)
    		 */
    /* CompleteClass */
    override val `type`: `area-measurement-view-3d` = js.native
    
    /**
    		 * When `true`, the analysis is visualized in the view.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#visible)
    		 */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
}
