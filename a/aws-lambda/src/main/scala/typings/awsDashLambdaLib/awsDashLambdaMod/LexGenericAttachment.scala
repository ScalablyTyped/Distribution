package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexGenericAttachment extends js.Object {
  var attachmentLinkUrl: java.lang.String
  var buttons: js.Array[awsDashLambdaLib.Anon_Text]
  var imageUrl: java.lang.String
  var subTitle: java.lang.String
  var title: java.lang.String
}

object LexGenericAttachment {
  @scala.inline
  def apply(
    attachmentLinkUrl: java.lang.String,
    buttons: js.Array[awsDashLambdaLib.Anon_Text],
    imageUrl: java.lang.String,
    subTitle: java.lang.String,
    title: java.lang.String
  ): LexGenericAttachment = {
    val __obj = js.Dynamic.literal(attachmentLinkUrl = attachmentLinkUrl, buttons = buttons, imageUrl = imageUrl, subTitle = subTitle, title = title)
  
    __obj.asInstanceOf[LexGenericAttachment]
  }
}

