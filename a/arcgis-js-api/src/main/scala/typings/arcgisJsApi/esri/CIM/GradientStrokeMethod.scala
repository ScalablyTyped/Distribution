package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GradientStrokeMethod extends js.Object
@JSGlobal("__esri.CIM.GradientStrokeMethod")
@js.native
object GradientStrokeMethod extends js.Object {
  
  /**
    * A gradient across the line.
    */
  @js.native
  sealed trait AcrossLine extends GradientStrokeMethod
  
  /**
    * A gradient along the line.
    */
  @js.native
  sealed trait AlongLine extends GradientStrokeMethod
}
