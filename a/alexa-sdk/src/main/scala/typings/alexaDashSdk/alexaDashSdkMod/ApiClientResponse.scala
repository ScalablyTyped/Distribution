package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiClientResponse extends js.Object {
  var body: js.Object
  var headers: js.Object
  var statusCode: String
  var statusText: String
}

object ApiClientResponse {
  @scala.inline
  def apply(body: js.Object, headers: js.Object, statusCode: String, statusText: String): ApiClientResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode, statusText = statusText)
  
    __obj.asInstanceOf[ApiClientResponse]
  }
}

