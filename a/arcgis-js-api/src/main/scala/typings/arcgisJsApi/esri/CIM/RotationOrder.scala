package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RotationOrder extends js.Object
@JSGlobal("__esri.CIM.RotationOrder")
@js.native
object RotationOrder extends js.Object {
  
  /**
    * Rotate in XYZ order.
    */
  @js.native
  sealed trait XYZ extends RotationOrder
  
  /**
    * Rotate in YXZ order.
    */
  @js.native
  sealed trait YXZ extends RotationOrder
  
  /**
    * Rotate in ZYX order.
    */
  @js.native
  sealed trait ZXY extends RotationOrder
}
