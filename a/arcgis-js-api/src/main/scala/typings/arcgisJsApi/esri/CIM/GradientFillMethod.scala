package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GradientFillMethod extends js.Object
@JSGlobal("__esri.CIM.GradientFillMethod")
@js.native
object GradientFillMethod extends js.Object {
  
  /**
    * Buffered - Color changes based on an internal buffering of the geometry outline
    */
  @js.native
  sealed trait Buffered extends GradientFillMethod
  
  /**
    * Circular - Change from one color to the next is circular, from the extent of the geometry
    */
  @js.native
  sealed trait Circular extends GradientFillMethod
  
  /**
    * Linear - Change from one color to the next is linear across the geometry.
    */
  @js.native
  sealed trait Linear extends GradientFillMethod
  
  /**
    * Rectangular - Change from one color to the next is rectangular, from the extent of the geometry.
    */
  @js.native
  sealed trait Rectangular extends GradientFillMethod
}
