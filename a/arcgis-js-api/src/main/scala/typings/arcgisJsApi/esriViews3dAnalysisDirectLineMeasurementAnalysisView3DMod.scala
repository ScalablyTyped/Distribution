package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.arcgisJsApiStrings.`direct-line-measurement-view-3d`
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysis
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisResult
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisView3D
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisView3DConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dAnalysisDirectLineMeasurementAnalysisView3DMod extends Shortcut {
  
  @JSImport("esri/views/3d/analysis/DirectLineMeasurementAnalysisView3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectLineMeasurementAnalysisView3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/analysis/DirectLineMeasurementAnalysisView3D", JSImport.Namespace)
  @js.native
  /**
    * Represents the analysis view of a [DirectLineMeasurementAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html) after it has been added to [SceneView.analyses](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#analyses).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html)
    */
  open class Class ()
    extends StObject
       with DirectLineMeasurementAnalysisView3D {
    def this(properties: Any) = this()
    
    /**
      * The direct line measurement analysis object associated with the analysis view.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#analysis)
      */
    /* CompleteClass */
    override val analysis: DirectLineMeasurementAnalysis = js.native
    
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
  
  type _To = js.Object & DirectLineMeasurementAnalysisView3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViews3dAnalysisDirectLineMeasurementAnalysisView3DMod.foo` */
  override def _to: js.Object & DirectLineMeasurementAnalysisView3DConstructor = ^
}
