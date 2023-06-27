package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementEndings extends StObject
@JSGlobal("__esri.CIM.PlacementEndings")
@js.native
object PlacementEndings extends StObject {
  
  /**
  			 * Will fit the pattern to the length of the features by adjusting the gaps slightly.
  			 */
  @js.native
  sealed trait Custom
    extends StObject
       with PlacementEndings
  
  /**
  			 * No constraint on how the markers are placed.
  			 */
  @js.native
  sealed trait NoConstraint
    extends StObject
       with PlacementEndings
  
  /**
  			 * A space equal to the placement template will be placed at the control point.
  			 */
  @js.native
  sealed trait WithFullGap
    extends StObject
       with PlacementEndings
  
  /**
  			 * A space equal to half the placement template will be placed at the control point.
  			 */
  @js.native
  sealed trait WithHalfGap
    extends StObject
       with PlacementEndings
  
  /**
  			 * A marker is placed at the control point.
  			 */
  @js.native
  sealed trait WithMarkers
    extends StObject
       with PlacementEndings
}
