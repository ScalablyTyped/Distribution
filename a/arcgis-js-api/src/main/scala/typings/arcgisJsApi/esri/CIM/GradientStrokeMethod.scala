package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GradientStrokeMethod extends StObject
@JSGlobal("__esri.CIM.GradientStrokeMethod")
@js.native
object GradientStrokeMethod extends StObject {
  
  /**
    * A gradient across the line.
    */
  @js.native
  sealed trait AcrossLine
    extends StObject
       with GradientStrokeMethod
  
  /**
    * A gradient along the line.
    */
  @js.native
  sealed trait AlongLine
    extends StObject
       with GradientStrokeMethod
}
