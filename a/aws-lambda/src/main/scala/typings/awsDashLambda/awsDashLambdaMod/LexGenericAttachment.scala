package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexGenericAttachment extends js.Object {
  var attachmentLinkUrl: String
  var buttons: js.Array[Anon_Text]
  var imageUrl: String
  var subTitle: String
  var title: String
}

object LexGenericAttachment {
  @scala.inline
  def apply(
    attachmentLinkUrl: String,
    buttons: js.Array[Anon_Text],
    imageUrl: String,
    subTitle: String,
    title: String
  ): LexGenericAttachment = {
    val __obj = js.Dynamic.literal(attachmentLinkUrl = attachmentLinkUrl, buttons = buttons, imageUrl = imageUrl, subTitle = subTitle, title = title)
  
    __obj.asInstanceOf[LexGenericAttachment]
  }
}

