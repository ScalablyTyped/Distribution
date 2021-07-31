package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BalloonCalloutStyle extends StObject
@JSGlobal("__esri.CIM.BalloonCalloutStyle")
@js.native
object BalloonCalloutStyle extends StObject {
  
  /**
    * Oval style.
    */
  @js.native
  sealed trait Oval
    extends StObject
       with BalloonCalloutStyle
  
  /**
    * Rectangle style.
    */
  @js.native
  sealed trait Rectangle
    extends StObject
       with BalloonCalloutStyle
  
  /**
    * Rounded rectangle style.
    */
  @js.native
  sealed trait RoundedRectangle
    extends StObject
       with BalloonCalloutStyle
}
