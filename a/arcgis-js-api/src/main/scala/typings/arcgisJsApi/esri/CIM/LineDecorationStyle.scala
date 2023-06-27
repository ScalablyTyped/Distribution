package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineDecorationStyle extends StObject
@JSGlobal("__esri.CIM.LineDecorationStyle")
@js.native
object LineDecorationStyle extends StObject {
  
  /**
  			 * A circle is added at the end of the line.
  			 */
  @js.native
  sealed trait Circle
    extends StObject
       with LineDecorationStyle
  
  /**
  			 * A closed arrow is added to the end of the line.
  			 */
  @js.native
  sealed trait ClosedArrow
    extends StObject
       with LineDecorationStyle
  
  /**
  			 * The decoration is defined in the Layers property as a set of SymbolReferences.
  			 */
  @js.native
  sealed trait Custom
    extends StObject
       with LineDecorationStyle
  
  /**
  			 * A diamond is added at the end of the line.
  			 */
  @js.native
  sealed trait Diamond
    extends StObject
       with LineDecorationStyle
  
  /**
  			 * No decoration.
  			 */
  @js.native
  sealed trait None
    extends StObject
       with LineDecorationStyle
  
  /**
  			 * An open arrow is added to the end of the line.
  			 */
  @js.native
  sealed trait OpenArrow
    extends StObject
       with LineDecorationStyle
}
