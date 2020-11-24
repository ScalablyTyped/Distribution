package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BalloonCalloutStyle extends js.Object
@JSGlobal("__esri.CIM.BalloonCalloutStyle")
@js.native
object BalloonCalloutStyle extends js.Object {
  
  /**
    * Oval style.
    */
  @js.native
  sealed trait Oval extends BalloonCalloutStyle
  
  /**
    * Rectangle style.
    */
  @js.native
  sealed trait Rectangle extends BalloonCalloutStyle
  
  /**
    * Rounded rectangle style.
    */
  @js.native
  sealed trait RoundedRectangle extends BalloonCalloutStyle
}
