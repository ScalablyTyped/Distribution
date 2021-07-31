package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GradientFillMethod extends StObject
@JSGlobal("__esri.CIM.GradientFillMethod")
@js.native
object GradientFillMethod extends StObject {
  
  /**
    * Buffered - Color changes based on an internal buffering of the geometry outline
    */
  @js.native
  sealed trait Buffered
    extends StObject
       with GradientFillMethod
  
  /**
    * Circular - Change from one color to the next is circular, from the extent of the geometry
    */
  @js.native
  sealed trait Circular
    extends StObject
       with GradientFillMethod
  
  /**
    * Linear - Change from one color to the next is linear across the geometry.
    */
  @js.native
  sealed trait Linear
    extends StObject
       with GradientFillMethod
  
  /**
    * Rectangular - Change from one color to the next is rectangular, from the extent of the geometry.
    */
  @js.native
  sealed trait Rectangular
    extends StObject
       with GradientFillMethod
}
