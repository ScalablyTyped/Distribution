package typings.alexaDashVoiceDashService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String
  var boundary: String
  var headers: String
  var httpVersion: String
  var method: String
  var multipart: String
  var statusCode: String
  var statusMessage: String
  var url: String
}

object Anon_Body {
  @scala.inline
  def apply(
    body: String,
    boundary: String,
    headers: String,
    httpVersion: String,
    method: String,
    multipart: String,
    statusCode: String,
    statusMessage: String,
    url: String
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], multipart = multipart.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

