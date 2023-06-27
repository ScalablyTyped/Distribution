package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Simple3DLineStyle extends StObject
@JSGlobal("__esri.CIM.Simple3DLineStyle")
@js.native
object Simple3DLineStyle extends StObject {
  
  /**
  			 * Stroke draws flat upon the surface.
  			 */
  @js.native
  sealed trait Strip
    extends StObject
       with Simple3DLineStyle
  
  /**
  			 * Stroke draws as a tube where the width determines the diameter of the tube.
  			 */
  @js.native
  sealed trait Tube
    extends StObject
       with Simple3DLineStyle
  
  /**
  			 * Stroke is vertically oriented where Width determines the height of the wall.
  			 */
  @js.native
  sealed trait Wall
    extends StObject
       with Simple3DLineStyle
}
