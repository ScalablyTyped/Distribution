package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaterialMode extends js.Object
@JSGlobal("__esri.CIM.MaterialMode")
@js.native
object MaterialMode extends js.Object {
  
  /**
    * Multiply materials and textures with color property.
    */
  @js.native
  sealed trait Multiply extends MaterialMode
  
  /**
    * Replace materials and textures with color property.
    */
  @js.native
  sealed trait Replace extends MaterialMode
  
  /**
    * Tint materials and textures with color property.
    */
  @js.native
  sealed trait Tint extends MaterialMode
}
