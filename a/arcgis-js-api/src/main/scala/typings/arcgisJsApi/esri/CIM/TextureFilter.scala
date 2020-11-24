package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureFilter extends js.Object
@JSGlobal("__esri.CIM.TextureFilter")
@js.native
object TextureFilter extends js.Object {
  
  /**
    * Low draft quality.
    */
  @js.native
  sealed trait Draft extends TextureFilter
  
  /**
    * Higher quality, recommended for pictures.
    */
  @js.native
  sealed trait Picture extends TextureFilter
  
  /**
    * Higher quality, recommended when it is important to preserve edges for zoomed in images.
    */
  @js.native
  sealed trait Text extends TextureFilter
}
