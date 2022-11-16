package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.LineOfSightAnalysisResult
import typings.arcgisJsApi.esri.LineOfSightAnalysisTarget
import typings.arcgisJsApi.esri.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dAnalysisLineOfSightAnalysisResultMod {
  
  @JSImport("esri/views/3d/analysis/LineOfSightAnalysisResult", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LineOfSightAnalysisResult {
    def this(properties: Any) = this()
    
    /**
      * The first [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) intersected by the line of sight.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedGraphic)
      */
    /* CompleteClass */
    override val intersectedGraphic: Graphic = js.native
    
    /**
      * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location where the line of sight first intersects the ground or 3D objects in the scene.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedLocation)
      */
    /* CompleteClass */
    override val intersectedLocation: Point = js.native
    
    /**
      * Represents a target in a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html) which is used to calculate the visibility from the [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#observer).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#target)
      */
    /* CompleteClass */
    var target: LineOfSightAnalysisTarget = js.native
    
    /**
      * Whether the target is visible from the observer or not.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#visible)
      */
    /* CompleteClass */
    override val visible: Boolean = js.native
  }
}
