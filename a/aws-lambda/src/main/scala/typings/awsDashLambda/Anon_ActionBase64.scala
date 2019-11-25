package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaStrings.`read-only`
import typings.awsDashLambda.awsDashLambdaStrings.base64
import typings.awsDashLambda.awsDashLambdaStrings.replace
import typings.awsDashLambda.awsDashLambdaStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionBase64 extends js.Object {
  var action: `read-only` | replace
  var data: String
  var encoding: base64 | text_
  val inputTruncated: Boolean
}

object Anon_ActionBase64 {
  @scala.inline
  def apply(action: `read-only` | replace, data: String, encoding: base64 | text_, inputTruncated: Boolean): Anon_ActionBase64 = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], inputTruncated = inputTruncated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionBase64]
  }
}

