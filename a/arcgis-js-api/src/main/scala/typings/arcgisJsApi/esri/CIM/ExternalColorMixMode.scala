package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExternalColorMixMode extends js.Object
@JSGlobal("__esri.CIM.ExternalColorMixMode")
@js.native
object ExternalColorMixMode extends js.Object {
  
  /**
    * Ignore external color.
    */
  @js.native
  sealed trait Ignore extends ExternalColorMixMode
  
  /**
    * Multiply components by components of external color.
    */
  @js.native
  sealed trait Multiply extends ExternalColorMixMode
  
  /**
    * Tint using external color.
    */
  @js.native
  sealed trait Tint extends ExternalColorMixMode
}
