package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtyomVoice extends StObject {
  
  var default: Boolean = js.native
  
  var lang: String = js.native
  
  var localService: Boolean = js.native
  
  var name: String = js.native
  
  var voiceURI: String = js.native
}
object ArtyomVoice {
  
  @scala.inline
  def apply(default: Boolean, lang: String, localService: Boolean, name: String, voiceURI: String): ArtyomVoice = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], localService = localService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], voiceURI = voiceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomVoice]
  }
  
  @scala.inline
  implicit class ArtyomVoiceMutableBuilder[Self <: ArtyomVoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalService(value: Boolean): Self = StObject.set(x, "localService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceURI(value: String): Self = StObject.set(x, "voiceURI", value.asInstanceOf[js.Any])
  }
}
