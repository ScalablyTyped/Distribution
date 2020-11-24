package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GradientStrokeType extends js.Object
@JSGlobal("__esri.CIM.GradientStrokeType")
@js.native
object GradientStrokeType extends js.Object {
  
  /**
    * Continuous gradients vary continuously along the color change with no distinct boundary between the colors.
    */
  @js.native
  sealed trait Continuous extends GradientStrokeType
  
  /**
    * Discrete gradient types have distinct lines of separation between each color.
    */
  @js.native
  sealed trait Discrete extends GradientStrokeType
}
