package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOfSightAnalysisTarget
  extends StObject
     with Accessor {
  
  /**
    * Specifies how the target is placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html#elevationInfo)
    */
  var elevationInfo: LineOfSightAnalysisTargetElevationInfo = js.native
  
  /**
    * Specifies a feature which shall be excluded from intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html#feature)
    */
  var feature: Graphic = js.native
  
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the position of the target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html#position)
    */
  var position: Point = js.native
}
