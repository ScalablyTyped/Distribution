package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.arcgisJsApiStrings.`slice-view-3d`
import typings.arcgisJsApi.esri.SliceAnalysis
import typings.arcgisJsApi.esri.SliceAnalysisView3D
import typings.arcgisJsApi.esri.SliceAnalysisView3DConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dAnalysisSliceAnalysisView3DMod extends Shortcut {
  
  @JSImport("esri/views/3d/analysis/SliceAnalysisView3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SliceAnalysisView3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/analysis/SliceAnalysisView3D", JSImport.Namespace)
  @js.native
  /**
    * Represents the analysis view of a [SliceAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html) after it has been added to [SceneView.analyses](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#analyses).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-SliceAnalysisView3D.html)
    */
  open class Class ()
    extends StObject
       with SliceAnalysisView3D {
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
    override val analysis: SliceAnalysis = js.native
    
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
  
  type _To = js.Object & SliceAnalysisView3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViews3dAnalysisSliceAnalysisView3DMod.foo` */
  override def _to: js.Object & SliceAnalysisView3DConstructor = ^
}
