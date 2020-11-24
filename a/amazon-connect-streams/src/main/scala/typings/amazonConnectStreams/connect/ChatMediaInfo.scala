package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.anon.ChatAutoAccept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMediaInfo extends js.Object {
  
  val contactId: String = js.native
  
  def getConnectionToken(): js.Promise[ConnectionToken] = js.native
  @JSName("getConnectionToken")
  var getConnectionToken_Original: js.Function0[js.Promise[ConnectionToken]] = js.native
  
  val initialContactId: String = js.native
  
  val originalInfo: ChatAutoAccept = js.native
  
  val participantId: String = js.native
  
  val participantToken: String = js.native
}
