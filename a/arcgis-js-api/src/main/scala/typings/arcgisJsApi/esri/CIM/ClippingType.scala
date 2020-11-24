package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClippingType extends js.Object
@JSGlobal("__esri.CIM.ClippingType")
@js.native
object ClippingType extends js.Object {
  
  /**
    * Intersect.
    */
  @js.native
  sealed trait Intersect extends ClippingType
  
  /**
    * Subtract.
    */
  @js.native
  sealed trait Subtract extends ClippingType
}
