package typings
package alexaDashVoiceDashServiceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var boundary: java.lang.String
  var headers: java.lang.String
  var httpVersion: java.lang.String
  var method: java.lang.String
  var multipart: java.lang.String
  var statusCode: java.lang.String
  var statusMessage: java.lang.String
  var url: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(
    body: java.lang.String,
    boundary: java.lang.String,
    headers: java.lang.String,
    httpVersion: java.lang.String,
    method: java.lang.String,
    multipart: java.lang.String,
    statusCode: java.lang.String,
    statusMessage: java.lang.String,
    url: java.lang.String
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, boundary = boundary, headers = headers, httpVersion = httpVersion, method = method, multipart = multipart, statusCode = statusCode, statusMessage = statusMessage, url = url)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

