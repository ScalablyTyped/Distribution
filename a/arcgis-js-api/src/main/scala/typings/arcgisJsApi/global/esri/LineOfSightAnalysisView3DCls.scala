package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`line-of-sight-view-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.LineOfSightAnalysisView3D")
@js.native
/**
  * Represents the analysis view of a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html) after it has been added to [SceneView.analyses](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#analyses).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html)
  */
open class LineOfSightAnalysisView3DCls ()
  extends StObject
     with typings.arcgisJsApi.esri.LineOfSightAnalysisView3D {
  def this(properties: Any) = this()
  
  /**
    * The line of sight analysis object associated with the analysis view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#analysis)
    */
  /* CompleteClass */
  override val analysis: typings.arcgisJsApi.esri.LineOfSightAnalysis = js.native
  
  /**
    * Set to `true` to enable interactivity for the associated [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#interactive)
    */
  /* CompleteClass */
  var interactive: Boolean = js.native
  
  /**
    * Analysis results for each target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#results)
    */
  /* CompleteClass */
  override val results: typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.LineOfSightAnalysisResult] = js.native
  
  /**
    * The analysis view type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#type)
    */
  /* CompleteClass */
  override val `type`: `line-of-sight-view-3d` = js.native
  
  /**
    * When `true`, the analysis is visualized in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisView3D.html#visible)
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
