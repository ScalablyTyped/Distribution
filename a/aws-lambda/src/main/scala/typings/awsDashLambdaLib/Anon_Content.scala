package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: java.lang.String
  var contentType: awsDashLambdaLib.awsDashLambdaLibStrings.PlainText | awsDashLambdaLib.awsDashLambdaLibStrings.SSML | awsDashLambdaLib.awsDashLambdaLibStrings.CustomPayload
}

object Anon_Content {
  @scala.inline
  def apply(
    content: java.lang.String,
    contentType: awsDashLambdaLib.awsDashLambdaLibStrings.PlainText | awsDashLambdaLib.awsDashLambdaLibStrings.SSML | awsDashLambdaLib.awsDashLambdaLibStrings.CustomPayload
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

