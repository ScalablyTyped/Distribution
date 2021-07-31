package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceMediaInfo extends StObject {
  
  val autoAccept: Boolean
  
  val callConfigJson: String
  
  val callContextToken: String
  
  val callType: SoftphoneCallType
  
  val mediaLegContextToken: String
}
object VoiceMediaInfo {
  
  @scala.inline
  def apply(
    autoAccept: Boolean,
    callConfigJson: String,
    callContextToken: String,
    callType: SoftphoneCallType,
    mediaLegContextToken: String
  ): VoiceMediaInfo = {
    val __obj = js.Dynamic.literal(autoAccept = autoAccept.asInstanceOf[js.Any], callConfigJson = callConfigJson.asInstanceOf[js.Any], callContextToken = callContextToken.asInstanceOf[js.Any], callType = callType.asInstanceOf[js.Any], mediaLegContextToken = mediaLegContextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceMediaInfo]
  }
  
  @scala.inline
  implicit class VoiceMediaInfoMutableBuilder[Self <: VoiceMediaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAccept(value: Boolean): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallConfigJson(value: String): Self = StObject.set(x, "callConfigJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallContextToken(value: String): Self = StObject.set(x, "callContextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallType(value: SoftphoneCallType): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaLegContextToken(value: String): Self = StObject.set(x, "mediaLegContextToken", value.asInstanceOf[js.Any])
  }
}
