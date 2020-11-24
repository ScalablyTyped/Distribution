package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaType extends js.Object
@JSGlobal("connect.MediaType")
@js.native
object MediaType extends js.Object {
  
  @js.native
  sealed trait CHAT extends MediaType
  
  @js.native
  sealed trait SOFTPHONE extends MediaType
}
