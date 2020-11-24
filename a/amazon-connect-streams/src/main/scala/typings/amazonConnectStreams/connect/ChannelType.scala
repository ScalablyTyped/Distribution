package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChannelType extends js.Object
/** This enumeration lists the different types of contact channels. */
@JSGlobal("connect.ChannelType")
@js.native
object ChannelType extends js.Object {
  
  /** A chat contact. */
  @js.native
  sealed trait CHAT extends ChannelType
  
  /** A voice contact. */
  @js.native
  sealed trait VOICE extends ChannelType
}
