package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DominantSizeAxis extends StObject
@JSGlobal("__esri.CIM.DominantSizeAxis")
@js.native
object DominantSizeAxis extends StObject {
  
  /**
  			 * Dominant on the X axis.
  			 */
  @js.native
  sealed trait X
    extends StObject
       with DominantSizeAxis
  
  /**
  			 * Dominant on the Y axis.
  			 */
  @js.native
  sealed trait Y
    extends StObject
       with DominantSizeAxis
  
  /**
  			 * Dominant on the Z axis.
  			 */
  @js.native
  sealed trait Z
    extends StObject
       with DominantSizeAxis
}
