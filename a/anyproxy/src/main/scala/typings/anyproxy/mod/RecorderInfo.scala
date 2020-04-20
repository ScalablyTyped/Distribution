package typings.anyproxy.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderInfo extends js.Object {
  var _id: Double
  var duration: Double | String
  var endTime: Double | String
  var host: String
  var id: Double
  var length: Double | String
  var method: String
  var mime: String
  var path: String
  var protocol: String
  var reqBody: js.Any
  // req
  var reqHeader: Record[String, String]
  var resHeader: (Record[String, String]) | String
  var startTime: Double
  // res
  var statusCode: Double | String
  var url: String
}

object RecorderInfo {
  @scala.inline
  def apply(
    _id: Double,
    duration: Double | String,
    endTime: Double | String,
    host: String,
    id: Double,
    length: Double | String,
    method: String,
    mime: String,
    path: String,
    protocol: String,
    reqBody: js.Any,
    reqHeader: Record[String, String],
    resHeader: (Record[String, String]) | String,
    startTime: Double,
    statusCode: Double | String,
    url: String
  ): RecorderInfo = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], reqBody = reqBody.asInstanceOf[js.Any], reqHeader = reqHeader.asInstanceOf[js.Any], resHeader = resHeader.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderInfo]
  }
}

