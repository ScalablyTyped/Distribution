package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextCase extends js.Object
@JSGlobal("__esri.CIM.TextCase")
@js.native
object TextCase extends js.Object {
  
  /**
    * Text is all upper case.
    */
  @js.native
  sealed trait Allcaps extends TextCase
  
  /**
    * Text is all lower case.
    */
  @js.native
  sealed trait LowerCase extends TextCase
  
  /**
    * Text is proper/mixed case.
    */
  @js.native
  sealed trait Normal extends TextCase
}
