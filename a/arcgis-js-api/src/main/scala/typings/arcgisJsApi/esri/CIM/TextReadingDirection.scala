package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextReadingDirection extends js.Object
@JSGlobal("__esri.CIM.TextReadingDirection")
@js.native
object TextReadingDirection extends js.Object {
  
  /**
    * Text is drawn from left-to-right.
    */
  @js.native
  sealed trait LTR extends TextReadingDirection
  
  /**
    * Text is drawn from right-to-left.
    */
  @js.native
  sealed trait RTL extends TextReadingDirection
}
