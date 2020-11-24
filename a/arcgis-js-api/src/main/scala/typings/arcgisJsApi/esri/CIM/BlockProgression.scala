package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockProgression extends js.Object
@JSGlobal("__esri.CIM.BlockProgression")
@js.native
object BlockProgression extends js.Object {
  
  /**
    * Bottom To Top.
    */
  @js.native
  sealed trait BTT extends BlockProgression
  
  /**
    * Right To Left (vertical text).
    */
  @js.native
  sealed trait RTL extends BlockProgression
  
  /**
    * Top To Bottom.
    */
  @js.native
  sealed trait TTB extends BlockProgression
}
