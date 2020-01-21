package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.CustomPayload
import typings.awsLambda.awsLambdaStrings.PlainText
import typings.awsLambda.awsLambdaStrings.SSML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: String
  var contentType: PlainText | SSML | CustomPayload
}

object AnonContent {
  @scala.inline
  def apply(content: String, contentType: PlainText | SSML | CustomPayload): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContent]
  }
}

