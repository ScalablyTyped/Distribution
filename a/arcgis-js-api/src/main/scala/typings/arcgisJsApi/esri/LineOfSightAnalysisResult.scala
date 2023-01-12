package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOfSightAnalysisResult extends StObject {
  
  /**
    * The first [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) intersected by the line of sight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedGraphic)
    */
  val intersectedGraphic: Graphic
  
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location where the line of sight first intersects the ground or 3D objects in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedLocation)
    */
  val intersectedLocation: Point
  
  /**
    * Represents a target in a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html) which is used to calculate the visibility from the [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#observer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#target)
    */
  var target: LineOfSightAnalysisTarget
  
  /**
    * Whether the target is visible from the observer or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#visible)
    */
  val visible: Boolean
}
object LineOfSightAnalysisResult {
  
  inline def apply(
    intersectedGraphic: Graphic,
    intersectedLocation: Point,
    target: LineOfSightAnalysisTarget,
    visible: Boolean
  ): LineOfSightAnalysisResult = {
    val __obj = js.Dynamic.literal(intersectedGraphic = intersectedGraphic.asInstanceOf[js.Any], intersectedLocation = intersectedLocation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOfSightAnalysisResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOfSightAnalysisResult] (val x: Self) extends AnyVal {
    
    inline def setIntersectedGraphic(value: Graphic): Self = StObject.set(x, "intersectedGraphic", value.asInstanceOf[js.Any])
    
    inline def setIntersectedLocation(value: Point): Self = StObject.set(x, "intersectedLocation", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: LineOfSightAnalysisTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
