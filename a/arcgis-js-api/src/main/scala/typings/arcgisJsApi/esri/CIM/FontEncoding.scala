package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontEncoding extends js.Object
@JSGlobal("__esri.CIM.FontEncoding")
@js.native
object FontEncoding extends js.Object {
  
  /**
    * Symbol encoding.
    */
  @js.native
  sealed trait MSSymbol extends FontEncoding
  
  /**
    * Unicode.
    */
  @js.native
  sealed trait Unicode extends FontEncoding
}
