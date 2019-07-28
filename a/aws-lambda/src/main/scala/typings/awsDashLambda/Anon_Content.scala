package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaStrings.CustomPayload
import typings.awsDashLambda.awsDashLambdaStrings.PlainText
import typings.awsDashLambda.awsDashLambdaStrings.SSML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: String
  var contentType: PlainText | SSML | CustomPayload
}

object Anon_Content {
  @scala.inline
  def apply(content: String, contentType: PlainText | SSML | CustomPayload): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Content]
  }
}

