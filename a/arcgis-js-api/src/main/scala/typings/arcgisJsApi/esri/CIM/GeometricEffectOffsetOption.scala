package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectOffsetOption extends StObject
@JSGlobal("__esri.CIM.GeometricEffectOffsetOption")
@js.native
object GeometricEffectOffsetOption extends StObject {
  
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
