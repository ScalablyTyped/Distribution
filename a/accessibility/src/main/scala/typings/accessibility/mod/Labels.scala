package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Labels extends js.Object {
  
  /** @default 'gray hues' */
  var bigCursor: js.UndefOr[String] = js.native
  
  /** @default 'Close' */
  var closeTitle: js.UndefOr[String] = js.native
  
  /** @default 'decrease text size' */
  var decreaseText: js.UndefOr[String] = js.native
  
  /** @default 'decrease text spacing' */
  var decreaseTextSpacing: js.UndefOr[String] = js.native
  
  /** @default 'gray hues' */
  var grayHues: js.UndefOr[String] = js.native
  
  /** @default 'increase text size' */
  var increaseText: js.UndefOr[String] = js.native
  
  /** @default 'increase text spacing' */
  var increaseTextSpacing: js.UndefOr[String] = js.native
  
  /** @default 'invert colors' */
  var invertColors: js.UndefOr[String] = js.native
  
  /** @default 'Accessibility Options' */
  var menuTitle: js.UndefOr[String] = js.native
  
  /** @default 'reading guide' */
  var readingGuide: js.UndefOr[String] = js.native
  
  /** @default 'Reset' */
  var resetTitle: js.UndefOr[String] = js.native
  
  /** @default 'speech to text' */
  var speechToText: js.UndefOr[String] = js.native
  
  /** @default 'underline links' */
  var textToSpeech: js.UndefOr[String] = js.native
  
  /** @default 'underline links' */
  var underlineLinks: js.UndefOr[String] = js.native
}
object Labels {
  
  @scala.inline
  def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit class LabelsOps[Self <: Labels] (val x: Self) extends AnyVal {
    
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
    def setBigCursor(value: String): Self = this.set("bigCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigCursor: Self = this.set("bigCursor", js.undefined)
    
    @scala.inline
    def setCloseTitle(value: String): Self = this.set("closeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTitle: Self = this.set("closeTitle", js.undefined)
    
    @scala.inline
    def setDecreaseText(value: String): Self = this.set("decreaseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecreaseText: Self = this.set("decreaseText", js.undefined)
    
    @scala.inline
    def setDecreaseTextSpacing(value: String): Self = this.set("decreaseTextSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecreaseTextSpacing: Self = this.set("decreaseTextSpacing", js.undefined)
    
    @scala.inline
    def setGrayHues(value: String): Self = this.set("grayHues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrayHues: Self = this.set("grayHues", js.undefined)
    
    @scala.inline
    def setIncreaseText(value: String): Self = this.set("increaseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreaseText: Self = this.set("increaseText", js.undefined)
    
    @scala.inline
    def setIncreaseTextSpacing(value: String): Self = this.set("increaseTextSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreaseTextSpacing: Self = this.set("increaseTextSpacing", js.undefined)
    
    @scala.inline
    def setInvertColors(value: String): Self = this.set("invertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertColors: Self = this.set("invertColors", js.undefined)
    
    @scala.inline
    def setMenuTitle(value: String): Self = this.set("menuTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuTitle: Self = this.set("menuTitle", js.undefined)
    
    @scala.inline
    def setReadingGuide(value: String): Self = this.set("readingGuide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadingGuide: Self = this.set("readingGuide", js.undefined)
    
    @scala.inline
    def setResetTitle(value: String): Self = this.set("resetTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetTitle: Self = this.set("resetTitle", js.undefined)
    
    @scala.inline
    def setSpeechToText(value: String): Self = this.set("speechToText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechToText: Self = this.set("speechToText", js.undefined)
    
    @scala.inline
    def setTextToSpeech(value: String): Self = this.set("textToSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextToSpeech: Self = this.set("textToSpeech", js.undefined)
    
    @scala.inline
    def setUnderlineLinks(value: String): Self = this.set("underlineLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineLinks: Self = this.set("underlineLinks", js.undefined)
  }
}
