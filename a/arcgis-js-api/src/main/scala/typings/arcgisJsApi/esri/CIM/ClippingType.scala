package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClippingType extends StObject
@JSGlobal("__esri.CIM.ClippingType")
@js.native
object ClippingType extends StObject {
  
  /**
    * Intersect.
    */
  @js.native
  sealed trait Intersect
    extends StObject
       with ClippingType
  
  /**
    * Subtract.
    */
  @js.native
  sealed trait Subtract
    extends StObject
       with ClippingType
}
