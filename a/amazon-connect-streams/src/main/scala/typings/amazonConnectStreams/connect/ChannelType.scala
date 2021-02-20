package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChannelType extends StObject
/** This enumeration lists the different types of contact channels. */
@JSGlobal("connect.ChannelType")
@js.native
object ChannelType extends StObject {
  
  /** A chat contact. */
  @js.native
  sealed trait CHAT extends ChannelType
  
  /** A voice contact. */
  @js.native
  sealed trait VOICE extends ChannelType
}
