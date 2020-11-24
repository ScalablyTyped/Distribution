package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectOffsetOption extends js.Object
@JSGlobal("__esri.CIM.GeometricEffectOffsetOption")
@js.native
object GeometricEffectOffsetOption extends js.Object {
  
  /**
    * Accurate - accommodates complex geometries and applied a true fit to the symbol.
    */
  @js.native
  sealed trait Accurate extends GeometricEffectOffsetOption
  
  /**
    * Fast - ignores complex geometries and applies a best fit to the symbol.
    */
  @js.native
  sealed trait Fast extends GeometricEffectOffsetOption
}
