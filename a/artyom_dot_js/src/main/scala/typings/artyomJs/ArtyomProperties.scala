package typings.artyomJs

import typings.artyomJs.anon.FatalityPromiseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtyomProperties extends js.Object {
  
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
  implicit class ArtyomPropertiesOps[Self <: ArtyomProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListen(value: Boolean): Self = this.set("listen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setExecutionKeyword(value: String): Self = this.set("executionKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionKeyword: Self = this.set("executionKeyword", js.undefined)
    
    @scala.inline
    def setHelpers(value: FatalityPromiseCallback): Self = this.set("helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setObeyKeyword(value: String): Self = this.set("obeyKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObeyKeyword: Self = this.set("obeyKeyword", js.undefined)
    
    @scala.inline
    def setObeying(value: Boolean): Self = this.set("obeying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObeying: Self = this.set("obeying", js.undefined)
    
    @scala.inline
    def setRecognizing(value: Boolean): Self = this.set("recognizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecognizing: Self = this.set("recognizing", js.undefined)
    
    @scala.inline
    def setSoundex(value: Boolean): Self = this.set("soundex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoundex: Self = this.set("soundex", js.undefined)
    
    @scala.inline
    def setSpeaking(value: Boolean): Self = this.set("speaking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeaking: Self = this.set("speaking", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
