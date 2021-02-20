package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementGridType extends StObject
@JSGlobal("__esri.CIM.PlacementGridType")
@js.native
object PlacementGridType extends StObject {
  
  /**
    * Markers are placed on a uniform grid.
    */
  @js.native
  sealed trait Fixed extends PlacementGridType
  
  /**
    * Markers are placed randomly in the polygon.
    */
  @js.native
  sealed trait Random extends PlacementGridType
  
  /**
    * Markers are placed randomly with a fixed quantity (dot density).
    */
  @js.native
  sealed trait RandomFixedQuantity extends PlacementGridType
}
