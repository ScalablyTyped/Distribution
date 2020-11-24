package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementEndings extends js.Object
@JSGlobal("__esri.CIM.PlacementEndings")
@js.native
object PlacementEndings extends js.Object {
  
  /**
    * Will fit the pattern to the length of the features by adjusting the gaps slightly.
    */
  @js.native
  sealed trait Custom extends PlacementEndings
  
  /**
    * No constraint on how the markers are placed.
    */
  @js.native
  sealed trait NoConstraint extends PlacementEndings
  
  /**
    * A space equal to the placement template will be placed at the control point.
    */
  @js.native
  sealed trait WithFullGap extends PlacementEndings
  
  /**
    * A space equal to half the placement template will be placed at the control point.
    */
  @js.native
  sealed trait WithHalfGap extends PlacementEndings
  
  /**
    * A marker is placed at the control point.
    */
  @js.native
  sealed trait WithMarkers extends PlacementEndings
}
