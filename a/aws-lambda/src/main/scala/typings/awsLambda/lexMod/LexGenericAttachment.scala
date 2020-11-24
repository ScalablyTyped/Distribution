package typings.awsLambda.lexMod

import typings.awsLambda.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexGenericAttachment extends js.Object {
  
  var attachmentLinkUrl: String = js.native
  
  var buttons: js.Array[Text] = js.native
  
  var imageUrl: String = js.native
  
  var subTitle: String = js.native
  
  var title: String = js.native
}
object LexGenericAttachment {
  
  @scala.inline
  def apply(
    attachmentLinkUrl: String,
    buttons: js.Array[Text],
    imageUrl: String,
    subTitle: String,
    title: String
  ): LexGenericAttachment = {
    val __obj = js.Dynamic.literal(attachmentLinkUrl = attachmentLinkUrl.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexGenericAttachment]
  }
  
  @scala.inline
  implicit class LexGenericAttachmentOps[Self <: LexGenericAttachment] (val x: Self) extends AnyVal {
    
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
    def setAttachmentLinkUrl(value: String): Self = this.set("attachmentLinkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: Text*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[Text]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
