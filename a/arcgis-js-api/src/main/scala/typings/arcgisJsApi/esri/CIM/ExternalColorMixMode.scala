package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExternalColorMixMode extends StObject
@JSGlobal("__esri.CIM.ExternalColorMixMode")
@js.native
object ExternalColorMixMode extends StObject {
  
  /**
  			 * Ignore external color.
  			 */
  @js.native
  sealed trait Ignore
    extends StObject
       with ExternalColorMixMode
  
  /**
  			 * Multiply components by components of external color.
  			 */
  @js.native
  sealed trait Multiply
    extends StObject
       with ExternalColorMixMode
  
  /**
  			 * Tint using external color.
  			 */
  @js.native
  sealed trait Tint
    extends StObject
       with ExternalColorMixMode
}
