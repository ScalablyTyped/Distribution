package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectOffsetTangentMethod extends js.Object
@JSGlobal("__esri.CIM.GeometricEffectOffsetTangentMethod")
@js.native
object GeometricEffectOffsetTangentMethod extends js.Object {
  
  /**
    * BeginningOfLine - the tangent offset is applied from the beginning of the line.
    */
  @js.native
  sealed trait BeginningOfLine extends GeometricEffectOffsetTangentMethod
  
  /**
    * EndOfLine - the tangent offset is applied from the end of the line.
    */
  @js.native
  sealed trait EndOfLine extends GeometricEffectOffsetTangentMethod
}
