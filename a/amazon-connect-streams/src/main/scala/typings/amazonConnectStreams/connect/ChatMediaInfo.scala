package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.anon.ChatAutoAccept
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMediaInfo extends StObject {
  
  val contactId: String
  
  def getConnectionToken(): js.Promise[ConnectionToken]
  @JSName("getConnectionToken")
  var getConnectionToken_Original: js.Function0[js.Promise[ConnectionToken]]
  
  val initialContactId: String
  
  val originalInfo: ChatAutoAccept
  
  val participantId: String
  
  val participantToken: String
}
object ChatMediaInfo {
  
  @scala.inline
  def apply(
    contactId: String,
    getConnectionToken: () => js.Promise[ConnectionToken],
    initialContactId: String,
    originalInfo: ChatAutoAccept,
    participantId: String,
    participantToken: String
  ): ChatMediaInfo = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any], getConnectionToken = js.Any.fromFunction0(getConnectionToken), initialContactId = initialContactId.asInstanceOf[js.Any], originalInfo = originalInfo.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], participantToken = participantToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMediaInfo]
  }
  
  @scala.inline
  implicit class ChatMediaInfoMutableBuilder[Self <: ChatMediaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConnectionToken(value: () => js.Promise[ConnectionToken]): Self = StObject.set(x, "getConnectionToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitialContactId(value: String): Self = StObject.set(x, "initialContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalInfo(value: ChatAutoAccept): Self = StObject.set(x, "originalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantToken(value: String): Self = StObject.set(x, "participantToken", value.asInstanceOf[js.Any])
  }
}
