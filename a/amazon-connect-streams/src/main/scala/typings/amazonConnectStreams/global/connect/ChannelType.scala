package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration lists the different types of contact channels. */
@JSGlobal("connect.ChannelType")
@js.native
object ChannelType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ChannelType with String] = js.native
  
  /* "CHAT" */ val CHAT: typings.amazonConnectStreams.connect.ChannelType.CHAT with String = js.native
  
  /* "VOICE" */ val VOICE: typings.amazonConnectStreams.connect.ChannelType.VOICE with String = js.native
}
