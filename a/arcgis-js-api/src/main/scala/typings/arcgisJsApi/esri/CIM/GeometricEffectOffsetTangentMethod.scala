package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectOffsetTangentMethod extends StObject
@JSGlobal("__esri.CIM.GeometricEffectOffsetTangentMethod")
@js.native
object GeometricEffectOffsetTangentMethod extends StObject {
  
  /**
  			 * BeginningOfLine - the tangent offset is applied from the beginning of the line.
  			 */
  @js.native
  sealed trait BeginningOfLine
    extends StObject
       with GeometricEffectOffsetTangentMethod
  
  /**
  			 * EndOfLine - the tangent offset is applied from the end of the line.
  			 */
  @js.native
  sealed trait EndOfLine
    extends StObject
       with GeometricEffectOffsetTangentMethod
}
