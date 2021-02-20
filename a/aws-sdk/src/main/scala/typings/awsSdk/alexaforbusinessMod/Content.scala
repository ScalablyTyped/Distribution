package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
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
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioList(value: AudioList): Self = StObject.set(x, "AudioList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioListUndefined: Self = StObject.set(x, "AudioList", js.undefined)
    
    @scala.inline
    def setAudioListVarargs(value: Audio*): Self = StObject.set(x, "AudioList", js.Array(value :_*))
    
    @scala.inline
    def setSsmlList(value: SsmlList): Self = StObject.set(x, "SsmlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlListUndefined: Self = StObject.set(x, "SsmlList", js.undefined)
    
    @scala.inline
    def setSsmlListVarargs(value: Ssml*): Self = StObject.set(x, "SsmlList", js.Array(value :_*))
    
    @scala.inline
    def setTextList(value: TextList): Self = StObject.set(x, "TextList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextListUndefined: Self = StObject.set(x, "TextList", js.undefined)
    
    @scala.inline
    def setTextListVarargs(value: Text*): Self = StObject.set(x, "TextList", js.Array(value :_*))
  }
}
