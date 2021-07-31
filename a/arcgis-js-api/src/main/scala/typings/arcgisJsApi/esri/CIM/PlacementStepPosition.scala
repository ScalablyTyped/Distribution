package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementStepPosition extends StObject
@JSGlobal("__esri.CIM.PlacementStepPosition")
@js.native
object PlacementStepPosition extends StObject {
  
  /**
    * The marker bounds.
    */
  @js.native
  sealed trait MarkerBounds
    extends StObject
       with PlacementStepPosition
  
  /**
    * The marker center.
    */
  @js.native
  sealed trait MarkerCenter
    extends StObject
       with PlacementStepPosition
}
