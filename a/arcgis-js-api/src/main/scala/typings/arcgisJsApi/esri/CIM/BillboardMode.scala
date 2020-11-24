package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BillboardMode extends js.Object
@JSGlobal("__esri.CIM.BillboardMode")
@js.native
object BillboardMode extends js.Object {
  
  /**
    * The symbol always faces the viewer directly, regardless of view angle.
    */
  @js.native
  sealed trait FaceNearPlane extends BillboardMode
  
  /**
    * Not billboarded.
    */
  @js.native
  sealed trait None extends BillboardMode
  
  /**
    * The symbol always faces toward the viewer as though spinning on a vertical signpost. Viewed from above, the symbol does not face you; you see the top of the symbol.
    */
  @js.native
  sealed trait SignPost extends BillboardMode
}
