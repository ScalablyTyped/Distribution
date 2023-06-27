package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementOnLineRelativeTo extends StObject
@JSGlobal("__esri.CIM.PlacementOnLineRelativeTo")
@js.native
object PlacementOnLineRelativeTo extends StObject {
  
  /**
  			 * Marker is placed at the beginning of the line.
  			 */
  @js.native
  sealed trait LineBeginning
    extends StObject
       with PlacementOnLineRelativeTo
  
  /**
  			 * Marker is placed at the end of the line.
  			 */
  @js.native
  sealed trait LineEnd
    extends StObject
       with PlacementOnLineRelativeTo
  
  /**
  			 * Marker is placed in the middle of the line.
  			 */
  @js.native
  sealed trait LineMiddle
    extends StObject
       with PlacementOnLineRelativeTo
  
  /**
  			 * Marker is at the midpoint of each segment in a line feature.
  			 */
  @js.native
  sealed trait SegmentMidpoint
    extends StObject
       with PlacementOnLineRelativeTo
}
