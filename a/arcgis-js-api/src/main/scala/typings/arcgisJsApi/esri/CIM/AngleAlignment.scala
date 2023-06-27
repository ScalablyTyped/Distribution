package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AngleAlignment extends StObject
@JSGlobal("__esri.CIM.AngleAlignment")
@js.native
object AngleAlignment extends StObject {
  
  /**
  			 * Points remain aligned to the display when the map is rotated.
  			 */
  @js.native
  sealed trait Display
    extends StObject
       with AngleAlignment
  
  /**
  			 * Points are rotated with the map.
  			 */
  @js.native
  sealed trait Map
    extends StObject
       with AngleAlignment
}
