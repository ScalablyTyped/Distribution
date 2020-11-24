package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FillMode extends js.Object
@JSGlobal("__esri.CIM.FillMode")
@js.native
object FillMode extends js.Object {
  
  /**
    * Centered fill.
    */
  @js.native
  sealed trait Centered extends FillMode
  
  /**
    * Mosaic fill.
    */
  @js.native
  sealed trait Mosaic extends FillMode
}
