package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontEffects extends StObject
@JSGlobal("__esri.CIM.FontEffects")
@js.native
object FontEffects extends StObject {
  
  /**
  			 * Normal text.
  			 */
  @js.native
  sealed trait Normal
    extends StObject
       with FontEffects
  
  /**
  			 * Subscript text
  			 */
  @js.native
  sealed trait Subscript
    extends StObject
       with FontEffects
  
  /**
  			 * Superscript text.
  			 */
  @js.native
  sealed trait Superscript
    extends StObject
       with FontEffects
}
