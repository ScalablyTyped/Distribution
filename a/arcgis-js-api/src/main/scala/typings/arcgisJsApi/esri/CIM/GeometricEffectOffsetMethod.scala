package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectOffsetMethod extends js.Object
@JSGlobal("__esri.CIM.GeometricEffectOffsetMethod")
@js.native
object GeometricEffectOffsetMethod extends js.Object {
  
  /**
    * Bevelled - follows the shortest straight path across a corner of the line or polygon.
    */
  @js.native
  sealed trait Bevelled extends GeometricEffectOffsetMethod
  
  /**
    * Mitered - matches the exact shape around a corner of the line or polygon.
    */
  @js.native
  sealed trait Mitered extends GeometricEffectOffsetMethod
  
  /**
    * Rounded - follows a path of equal distance around a corner of the line or polygon.
    */
  @js.native
  sealed trait Rounded extends GeometricEffectOffsetMethod
  
  /**
    * Square - follows a straight path across the corner of a line or polygon.
    */
  @js.native
  sealed trait Square extends GeometricEffectOffsetMethod
}
