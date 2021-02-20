package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaterialMode extends StObject
@JSGlobal("__esri.CIM.MaterialMode")
@js.native
object MaterialMode extends StObject {
  
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
