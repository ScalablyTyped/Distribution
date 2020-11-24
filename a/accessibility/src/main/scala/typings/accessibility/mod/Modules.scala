package typings.accessibility.mod

import typings.accessibility.accessibilityBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modules extends js.Object {
  
  /** @default true */
  var bigCursor: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var decreaseText: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var decreaseTextSpacing: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var grayHues: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var increaseText: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var increaseTextSpacing: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var invertColors: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var readingGuide: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var speechToText: js.UndefOr[`true`] = js.native
  
  /** @default true */
  var textToSpeech: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var underlineLinks: js.UndefOr[Boolean] = js.native
}
object Modules {
  
  @scala.inline
  def apply(): Modules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modules]
  }
  
  @scala.inline
  implicit class ModulesOps[Self <: Modules] (val x: Self) extends AnyVal {
    
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
    def setBigCursor(value: Boolean): Self = this.set("bigCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigCursor: Self = this.set("bigCursor", js.undefined)
    
    @scala.inline
    def setDecreaseText(value: Boolean): Self = this.set("decreaseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecreaseText: Self = this.set("decreaseText", js.undefined)
    
    @scala.inline
    def setDecreaseTextSpacing(value: Boolean): Self = this.set("decreaseTextSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecreaseTextSpacing: Self = this.set("decreaseTextSpacing", js.undefined)
    
    @scala.inline
    def setGrayHues(value: Boolean): Self = this.set("grayHues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrayHues: Self = this.set("grayHues", js.undefined)
    
    @scala.inline
    def setIncreaseText(value: Boolean): Self = this.set("increaseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreaseText: Self = this.set("increaseText", js.undefined)
    
    @scala.inline
    def setIncreaseTextSpacing(value: Boolean): Self = this.set("increaseTextSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreaseTextSpacing: Self = this.set("increaseTextSpacing", js.undefined)
    
    @scala.inline
    def setInvertColors(value: Boolean): Self = this.set("invertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertColors: Self = this.set("invertColors", js.undefined)
    
    @scala.inline
    def setReadingGuide(value: Boolean): Self = this.set("readingGuide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadingGuide: Self = this.set("readingGuide", js.undefined)
    
    @scala.inline
    def setSpeechToText(value: `true`): Self = this.set("speechToText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechToText: Self = this.set("speechToText", js.undefined)
    
    @scala.inline
    def setTextToSpeech(value: Boolean): Self = this.set("textToSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextToSpeech: Self = this.set("textToSpeech", js.undefined)
    
    @scala.inline
    def setUnderlineLinks(value: Boolean): Self = this.set("underlineLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineLinks: Self = this.set("underlineLinks", js.undefined)
  }
}
