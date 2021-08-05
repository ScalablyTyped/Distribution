package typings.artyomJs

import typings.artyomJs.anon.FatalityPromiseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtyomProperties extends StObject {
  
  var continuous: js.UndefOr[Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var executionKeyword: js.UndefOr[String] = js.undefined
  
  var helpers: js.UndefOr[FatalityPromiseCallback] = js.undefined
  
  var lang: String
  
  var listen: Boolean
  
  var mode: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var obeyKeyword: js.UndefOr[String] = js.undefined
  
  var obeying: js.UndefOr[Boolean] = js.undefined
  
  var recognizing: js.UndefOr[Boolean] = js.undefined
  
  var soundex: js.UndefOr[Boolean] = js.undefined
  
  var speaking: js.UndefOr[Boolean] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var volume: js.UndefOr[Double] = js.undefined
}
object ArtyomProperties {
  
  inline def apply(lang: String, listen: Boolean): ArtyomProperties = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomProperties]
  }
  
  extension [Self <: ArtyomProperties](x: Self) {
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setExecutionKeyword(value: String): Self = StObject.set(x, "executionKeyword", value.asInstanceOf[js.Any])
    
    inline def setExecutionKeywordUndefined: Self = StObject.set(x, "executionKeyword", js.undefined)
    
    inline def setHelpers(value: FatalityPromiseCallback): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setListen(value: Boolean): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObeyKeyword(value: String): Self = StObject.set(x, "obeyKeyword", value.asInstanceOf[js.Any])
    
    inline def setObeyKeywordUndefined: Self = StObject.set(x, "obeyKeyword", js.undefined)
    
    inline def setObeying(value: Boolean): Self = StObject.set(x, "obeying", value.asInstanceOf[js.Any])
    
    inline def setObeyingUndefined: Self = StObject.set(x, "obeying", js.undefined)
    
    inline def setRecognizing(value: Boolean): Self = StObject.set(x, "recognizing", value.asInstanceOf[js.Any])
    
    inline def setRecognizingUndefined: Self = StObject.set(x, "recognizing", js.undefined)
    
    inline def setSoundex(value: Boolean): Self = StObject.set(x, "soundex", value.asInstanceOf[js.Any])
    
    inline def setSoundexUndefined: Self = StObject.set(x, "soundex", js.undefined)
    
    inline def setSpeaking(value: Boolean): Self = StObject.set(x, "speaking", value.asInstanceOf[js.Any])
    
    inline def setSpeakingUndefined: Self = StObject.set(x, "speaking", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
