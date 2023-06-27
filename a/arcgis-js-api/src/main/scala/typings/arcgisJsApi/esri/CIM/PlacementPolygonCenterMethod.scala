package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementPolygonCenterMethod extends StObject
@JSGlobal("__esri.CIM.PlacementPolygonCenterMethod")
@js.native
object PlacementPolygonCenterMethod extends StObject {
  
  /**
  			 * The bounding box of the polygon is used.
  			 */
  @js.native
  sealed trait BoundingBoxCenter
    extends StObject
       with PlacementPolygonCenterMethod
  
  /**
  			 * The centroid of the polygon is used.
  			 */
  @js.native
  sealed trait CenterOfMass
    extends StObject
       with PlacementPolygonCenterMethod
  
  /**
  			 * Place on the polygon.
  			 */
  @js.native
  sealed trait OnPolygon
    extends StObject
       with PlacementPolygonCenterMethod
}
