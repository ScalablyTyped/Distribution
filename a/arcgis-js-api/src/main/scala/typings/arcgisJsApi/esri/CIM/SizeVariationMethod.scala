package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SizeVariationMethod extends StObject
@JSGlobal("__esri.CIM.SizeVariationMethod")
@js.native
object SizeVariationMethod extends StObject {
  
  /**
    * Markers are drawn in a pattern where the markers decrease in size.
    */
  @js.native
  sealed trait Decreasing
    extends StObject
       with SizeVariationMethod
  
  /**
    * Markers are drawn with a pattern where the markers increase in size.
    */
  @js.native
  sealed trait Increasing
    extends StObject
       with SizeVariationMethod
  
  /**
    * Markers are drawn in a pattern where the size increase and then decrease.
    */
  @js.native
  sealed trait IncreasingThenDecreasing
    extends StObject
       with SizeVariationMethod
  
  /**
    * Change in size is applied randomly.
    */
  @js.native
  sealed trait Random
    extends StObject
       with SizeVariationMethod
}
