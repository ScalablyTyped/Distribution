package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendingMode extends StObject
@JSGlobal("__esri.CIM.BlendingMode")
@js.native
object BlendingMode extends StObject {
  
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
