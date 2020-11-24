package typings.accessibility.mod

import typings.accessibility.anon.Buttons
import typings.accessibility.anon.CBackground
import typings.accessibility.anon.Font
import typings.accessibility.anon.Persistent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var animations: js.UndefOr[Buttons] = js.native
  
  var buttons: js.UndefOr[Font] = js.native
  
  var guide: js.UndefOr[CBackground] = js.native
  
  var hotkeys: js.UndefOr[HotKeys] = js.native
  
  var icon: js.UndefOr[Icon] = js.native
  
  var labels: js.UndefOr[Labels] = js.native
  
  var menu: js.UndefOr[typings.accessibility.anon.Dimensions] = js.native
  
  var modules: js.UndefOr[Modules] = js.native
  
  var session: js.UndefOr[Persistent] = js.native
  
  /** @default 'en-US' */
  var speechToTextLang: js.UndefOr[String] = js.native
  
  /** @default true */
  var textEmlMode: js.UndefOr[Boolean] = js.native
  
  /** @default false */
  var textPixelMode: js.UndefOr[Boolean] = js.native
  
  /** @default 'en-US' */
  var textToSpeechLang: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnimations(value: Buttons): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimations: Self = this.set("animations", js.undefined)
    
    @scala.inline
    def setButtons(value: Font): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setGuide(value: CBackground): Self = this.set("guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    
    @scala.inline
    def setHotkeys(value: HotKeys): Self = this.set("hotkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotkeys: Self = this.set("hotkeys", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabels(value: Labels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMenu(value: typings.accessibility.anon.Dimensions): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setModules(value: Modules): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setSession(value: Persistent): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSpeechToTextLang(value: String): Self = this.set("speechToTextLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechToTextLang: Self = this.set("speechToTextLang", js.undefined)
    
    @scala.inline
    def setTextEmlMode(value: Boolean): Self = this.set("textEmlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEmlMode: Self = this.set("textEmlMode", js.undefined)
    
    @scala.inline
    def setTextPixelMode(value: Boolean): Self = this.set("textPixelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextPixelMode: Self = this.set("textPixelMode", js.undefined)
    
    @scala.inline
    def setTextToSpeechLang(value: String): Self = this.set("textToSpeechLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextToSpeechLang: Self = this.set("textToSpeechLang", js.undefined)
  }
}
