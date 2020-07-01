package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var method: String
  var path: String
  var protocol: String
  var sourceIp: String
  var userAgent: String
}

object Method {
  @scala.inline
  def apply(method: String, path: String, protocol: String, sourceIp: String, userAgent: String): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

