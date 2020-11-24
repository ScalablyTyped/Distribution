package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalGlyphOrientation extends js.Object
@JSGlobal("__esri.CIM.VerticalGlyphOrientation")
@js.native
object VerticalGlyphOrientation extends js.Object {
  
  /**
    * Align right.
    */
  @js.native
  sealed trait Right extends VerticalGlyphOrientation
  
  /**
    * Align upright.
    */
  @js.native
  sealed trait Upright extends VerticalGlyphOrientation
}
