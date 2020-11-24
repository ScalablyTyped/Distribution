package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementStepPosition extends js.Object
@JSGlobal("__esri.CIM.PlacementStepPosition")
@js.native
object PlacementStepPosition extends js.Object {
  
  /**
    * The marker bounds.
    */
  @js.native
  sealed trait MarkerBounds extends PlacementStepPosition
  
  /**
    * The marker center.
    */
  @js.native
  sealed trait MarkerCenter extends PlacementStepPosition
}
