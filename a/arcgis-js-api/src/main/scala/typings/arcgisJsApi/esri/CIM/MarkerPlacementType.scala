package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerPlacementType extends StObject
@JSGlobal("__esri.CIM.MarkerPlacementType")
@js.native
object MarkerPlacementType extends StObject {
  
  /**
  			 * Place inside the polygon.
  			 */
  @js.native
  sealed trait InsidePolygon
    extends StObject
       with MarkerPlacementType
  
  /**
  			 * Place inside the polygon at the center.
  			 */
  @js.native
  sealed trait PolygonCenter
    extends StObject
       with MarkerPlacementType
  
  /**
  			 * Place randomly inside the polygon.
  			 */
  @js.native
  sealed trait RandomlyInsidePolygon
    extends StObject
       with MarkerPlacementType
}
