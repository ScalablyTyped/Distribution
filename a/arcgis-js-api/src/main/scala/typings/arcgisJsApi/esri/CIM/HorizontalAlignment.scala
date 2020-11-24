package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalAlignment extends js.Object
@JSGlobal("__esri.CIM.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  
  /**
    * Centered.
    */
  @js.native
  sealed trait Center extends HorizontalAlignment
  
  /**
    * Justified alignment.
    */
  @js.native
  sealed trait Justify extends HorizontalAlignment
  
  /**
    * Left aligned.
    */
  @js.native
  sealed trait Left extends HorizontalAlignment
  
  /**
    * Right aligned.
    */
  @js.native
  sealed trait Right extends HorizontalAlignment
}
