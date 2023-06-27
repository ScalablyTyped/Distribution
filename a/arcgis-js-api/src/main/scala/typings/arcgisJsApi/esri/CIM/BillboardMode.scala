package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BillboardMode extends StObject
@JSGlobal("__esri.CIM.BillboardMode")
@js.native
object BillboardMode extends StObject {
  
  /**
  			 * The symbol always faces the viewer directly, regardless of view angle.
  			 */
  @js.native
  sealed trait FaceNearPlane
    extends StObject
       with BillboardMode
  
  /**
  			 * Not billboarded.
  			 */
  @js.native
  sealed trait None
    extends StObject
       with BillboardMode
  
  /**
  			 * The symbol always faces toward the viewer as though spinning on a vertical signpost. Viewed from above, the symbol does not face you; you see the top of the symbol.
  			 */
  @js.native
  sealed trait SignPost
    extends StObject
       with BillboardMode
}
