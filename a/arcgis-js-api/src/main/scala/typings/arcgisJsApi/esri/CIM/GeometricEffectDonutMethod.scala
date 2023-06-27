package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectDonutMethod extends StObject
@JSGlobal("__esri.CIM.GeometricEffectDonutMethod")
@js.native
object GeometricEffectDonutMethod extends StObject {
  
  /**
  			 * Bevelled - follows the shortest straight path across a convex corner of the polygon.
  			 */
  @js.native
  sealed trait Bevelled
    extends StObject
       with GeometricEffectDonutMethod
  
  /**
  			 * Mitered - matches the exact shape around a convex corner of the polygon.
  			 */
  @js.native
  sealed trait Mitered
    extends StObject
       with GeometricEffectDonutMethod
  
  /**
  			 * Rounded - follows a path of equal distance around a convex corner of the polygon.
  			 */
  @js.native
  sealed trait Rounded
    extends StObject
       with GeometricEffectDonutMethod
  
  /**
  			 * Square - follows a straight path across the corner of a line or polygon.
  			 */
  @js.native
  sealed trait Square
    extends StObject
       with GeometricEffectDonutMethod
  
  /**
  			 * TrueBuffer - uses the buffer algorithm to follow a path around convex corners.
  			 */
  @js.native
  sealed trait TrueBuffer
    extends StObject
       with GeometricEffectDonutMethod
}
