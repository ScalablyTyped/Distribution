package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendingMode extends js.Object
@JSGlobal("__esri.CIM.BlendingMode")
@js.native
object BlendingMode extends js.Object {
  
  /**
    * Add.
    */
  @js.native
  sealed trait Add extends BlendingMode
  
  /**
    * Alpha blending.
    */
  @js.native
  sealed trait Alpha extends BlendingMode
  
  /**
    * Multiply.
    */
  @js.native
  sealed trait Multiply extends BlendingMode
  
  /**
    * No blending.
    */
  @js.native
  sealed trait None extends BlendingMode
  
  /**
    * Screen.
    */
  @js.native
  sealed trait Screen extends BlendingMode
}
