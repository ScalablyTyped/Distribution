package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerPlacementType extends js.Object
@JSGlobal("__esri.CIM.MarkerPlacementType")
@js.native
object MarkerPlacementType extends js.Object {
  
  /**
    * Place inside the polygon.
    */
  @js.native
  sealed trait InsidePolygon extends MarkerPlacementType
  
  /**
    * Place inside the polygon at the center.
    */
  @js.native
  sealed trait PolygonCenter extends MarkerPlacementType
  
  /**
    * Place randomly inside the polygon.
    */
  @js.native
  sealed trait RandomlyInsidePolygon extends MarkerPlacementType
}
