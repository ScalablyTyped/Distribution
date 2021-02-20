package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectEnclosingPolygonMethod extends StObject
@JSGlobal("__esri.CIM.GeometricEffectEnclosingPolygonMethod")
@js.native
object GeometricEffectEnclosingPolygonMethod extends StObject {
  
  /**
    * ClosePath - for polygon input, it generates a polygon that matches the geometry of a polygon feature. For line input, it generates a polygon that connects both ends of the line to each other.
    */
  @js.native
  sealed trait ClosePath extends GeometricEffectEnclosingPolygonMethod
  
  /**
    * ConvexHull - for polygon input, it generates a polygon with a minimum number of sides to surround the feature. For line input, it generates a polygon that approximates the shape of the line.
    */
  @js.native
  sealed trait ConvexHull extends GeometricEffectEnclosingPolygonMethod
  
  /**
    * RectangularBox - generates a polygon equal to the spatial envelope of the feature.
    */
  @js.native
  sealed trait RectangularBox extends GeometricEffectEnclosingPolygonMethod
}
