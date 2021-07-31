package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectExtensionOrigin extends StObject
@JSGlobal("__esri.CIM.GeometricEffectExtensionOrigin")
@js.native
object GeometricEffectExtensionOrigin extends StObject {
  
  /**
    * BeginningOfLine - extension is added to the end of the line.
    */
  @js.native
  sealed trait BeginningOfLine
    extends StObject
       with GeometricEffectExtensionOrigin
  
  /**
    * EndOfLine - extension is added to the end of the line.
    */
  @js.native
  sealed trait EndOfLine
    extends StObject
       with GeometricEffectExtensionOrigin
}
