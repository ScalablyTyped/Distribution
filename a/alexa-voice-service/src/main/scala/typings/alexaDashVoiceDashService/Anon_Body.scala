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
    val __obj = js.Dynamic.literal(body = body, boundary = boundary, headers = headers, httpVersion = httpVersion, method = method, multipart = multipart, statusCode = statusCode, statusMessage = statusMessage, url = url)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

