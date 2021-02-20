package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementClip extends StObject
@JSGlobal("__esri.CIM.PlacementClip")
@js.native
object PlacementClip extends StObject {
  
  /**
    * Markers are clipped at the boundary of the polygon.
    */
  @js.native
  sealed trait ClipAtBoundary extends PlacementClip
  
  /**
    * Markers are not clipped and may extend past the boundary of the polygon.
    */
  @js.native
  sealed trait DoNotClip extends PlacementClip
  
  /**
    * Markers are not drawn if they touch the boundary of the polygon.
    */
  @js.native
  sealed trait DoNotTouchBoundary extends PlacementClip
  
  /**
    * Markers are not drawn if their center falls outside of the polygon.
    */
  @js.native
  sealed trait RemoveIfCenterOutsideBoundary extends PlacementClip
}
