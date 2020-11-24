package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends js.Object {
  
  /**
    * The list of audio messages.
    */
  var AudioList: js.UndefOr[typings.awsSdk.alexaforbusinessMod.AudioList] = js.native
  
  /**
    * The list of SSML messages.
    */
  var SsmlList: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SsmlList] = js.native
  
  /**
    * The list of text messages.
    */
  var TextList: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TextList] = js.native
}
object Content {
  
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    
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
    def setAudioListVarargs(value: Audio*): Self = this.set("AudioList", js.Array(value :_*))
    
    @scala.inline
    def setAudioList(value: AudioList): Self = this.set("AudioList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioList: Self = this.set("AudioList", js.undefined)
    
    @scala.inline
    def setSsmlListVarargs(value: Ssml*): Self = this.set("SsmlList", js.Array(value :_*))
    
    @scala.inline
    def setSsmlList(value: SsmlList): Self = this.set("SsmlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsmlList: Self = this.set("SsmlList", js.undefined)
    
    @scala.inline
    def setTextListVarargs(value: Text*): Self = this.set("TextList", js.Array(value :_*))
    
    @scala.inline
    def setTextList(value: TextList): Self = this.set("TextList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextList: Self = this.set("TextList", js.undefined)
  }
}
