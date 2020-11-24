package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AngleAlignment extends js.Object
@JSGlobal("__esri.CIM.AngleAlignment")
@js.native
object AngleAlignment extends js.Object {
  
  /**
    * Points remain aligned to the display when the map is rotated.
    */
  @js.native
  sealed trait Display extends AngleAlignment
  
  /**
    * Points are rotated with the map.
    */
  @js.native
  sealed trait Map extends AngleAlignment
}
