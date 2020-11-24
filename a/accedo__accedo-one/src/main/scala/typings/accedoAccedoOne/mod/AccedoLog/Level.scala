package typings.accedoAccedoOne.mod.AccedoLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Level extends js.Object
@JSImport("@accedo/accedo-one", "AccedoLog.Level")
@js.native
object Level extends js.Object {
  
  @js.native
  sealed trait DEBUG extends Level
  
  @js.native
  sealed trait ERROR extends Level
  
  @js.native
  sealed trait INFO extends Level
  
  @js.native
  sealed trait WARN extends Level
}
