package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineJoinStyle extends js.Object
@JSGlobal("__esri.CIM.LineJoinStyle")
@js.native
object LineJoinStyle extends js.Object {
  
  /**
    * The stroke join is beveled.
    */
  @js.native
  sealed trait Bevel extends LineJoinStyle
  
  /**
    * The line join is mitered.
    */
  @js.native
  sealed trait Miter extends LineJoinStyle
  
  /**
    * The line join is round.
    */
  @js.native
  sealed trait Round extends LineJoinStyle
}
