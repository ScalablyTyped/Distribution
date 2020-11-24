package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The VoiceConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular voice connection within a contact.
  * Like contacts, connections come and go.
  * It is good practice not to persist these object or keep them as internal state.
  * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
  */
@JSGlobal("connect.VoiceConnection")
@js.native
class VoiceConnection ()
  extends typings.amazonConnectStreams.connect.VoiceConnection
