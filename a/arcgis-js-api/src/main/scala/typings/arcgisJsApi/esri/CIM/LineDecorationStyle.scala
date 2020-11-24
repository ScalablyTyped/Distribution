package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineDecorationStyle extends js.Object
@JSGlobal("__esri.CIM.LineDecorationStyle")
@js.native
object LineDecorationStyle extends js.Object {
  
  /**
    * A circle is added at the end of the line.
    */
  @js.native
  sealed trait Circle extends LineDecorationStyle
  
  /**
    * A closed arrow is added to the end of the line.
    */
  @js.native
  sealed trait ClosedArrow extends LineDecorationStyle
  
  /**
    * The decoration is defined in the Layers property as a set of SymbolReferences.
    */
  @js.native
  sealed trait Custom extends LineDecorationStyle
  
  /**
    * A diamond is added at the end of the line.
    */
  @js.native
  sealed trait Diamond extends LineDecorationStyle
  
  /**
    * No decoration.
    */
  @js.native
  sealed trait None extends LineDecorationStyle
  
  /**
    * An open arrow is added to the end of the line.
    */
  @js.native
  sealed trait OpenArrow extends LineDecorationStyle
}
