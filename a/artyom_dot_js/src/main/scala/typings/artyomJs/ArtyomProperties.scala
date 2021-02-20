package typings.artyomJs

import typings.artyomJs.anon.FatalityPromiseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtyomProperties extends StObject {
  
  var continuous: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var executionKeyword: js.UndefOr[String] = js.native
  
  var helpers: js.UndefOr[FatalityPromiseCallback] = js.native
  
  var lang: String = js.native
  
  var listen: Boolean = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var obeyKeyword: js.UndefOr[String] = js.native
  
  var obeying: js.UndefOr[Boolean] = js.native
  
  var recognizing: js.UndefOr[Boolean] = js.native
  
  var soundex: js.UndefOr[Boolean] = js.native
  
  var speaking: js.UndefOr[Boolean] = js.native
  
  var speed: js.UndefOr[Double] = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object ArtyomProperties {
  
  @scala.inline
  def apply(lang: String, listen: Boolean): ArtyomProperties = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomProperties]
  }
  
  @scala.inline
  implicit class ArtyomPropertiesMutableBuilder[Self <: ArtyomProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setExecutionKeyword(value: String): Self = StObject.set(x, "executionKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionKeywordUndefined: Self = StObject.set(x, "executionKeyword", js.undefined)
    
    @scala.inline
    def setHelpers(value: FatalityPromiseCallback): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListen(value: Boolean): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObeyKeyword(value: String): Self = StObject.set(x, "obeyKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObeyKeywordUndefined: Self = StObject.set(x, "obeyKeyword", js.undefined)
    
    @scala.inline
    def setObeying(value: Boolean): Self = StObject.set(x, "obeying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObeyingUndefined: Self = StObject.set(x, "obeying", js.undefined)
    
    @scala.inline
    def setRecognizing(value: Boolean): Self = StObject.set(x, "recognizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognizingUndefined: Self = StObject.set(x, "recognizing", js.undefined)
    
    @scala.inline
    def setSoundex(value: Boolean): Self = StObject.set(x, "soundex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundexUndefined: Self = StObject.set(x, "soundex", js.undefined)
    
    @scala.inline
    def setSpeaking(value: Boolean): Self = StObject.set(x, "speaking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakingUndefined: Self = StObject.set(x, "speaking", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
