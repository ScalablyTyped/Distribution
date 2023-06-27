package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextReadingDirection extends StObject
@JSGlobal("__esri.CIM.TextReadingDirection")
@js.native
object TextReadingDirection extends StObject {
  
  /**
  			 * Text is drawn from left-to-right.
  			 */
  @js.native
  sealed trait LTR
    extends StObject
       with TextReadingDirection
  
  /**
  			 * Text is drawn from right-to-left.
  			 */
  @js.native
  sealed trait RTL
    extends StObject
       with TextReadingDirection
}
