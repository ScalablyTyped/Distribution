package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.LineOfSightAnalysisResult")
@js.native
open class LineOfSightAnalysisResult ()
  extends StObject
     with typings.arcgisJsApi.esri.LineOfSightAnalysisResult {
  def this(properties: Any) = this()
  
  /**
    * The first [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) intersected by the line of sight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedGraphic)
    */
  /* CompleteClass */
  override val intersectedGraphic: typings.arcgisJsApi.esri.Graphic = js.native
  
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location where the line of sight first intersects the ground or 3D objects in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedLocation)
    */
  /* CompleteClass */
  override val intersectedLocation: typings.arcgisJsApi.esri.Point = js.native
  
  /**
    * Represents a target in a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html) which is used to calculate the visibility from the [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#observer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#target)
    */
  /* CompleteClass */
  var target: typings.arcgisJsApi.esri.LineOfSightAnalysisTarget = js.native
  
  /**
    * Whether the target is visible from the observer or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#visible)
    */
  /* CompleteClass */
  override val visible: Boolean = js.native
}
