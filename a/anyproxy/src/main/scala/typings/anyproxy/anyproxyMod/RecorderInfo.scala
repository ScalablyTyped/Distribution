package typings.anyproxy.anyproxyMod

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
    val __obj = js.Dynamic.literal(_id = _id, duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], host = host, id = id, length = length.asInstanceOf[js.Any], method = method, mime = mime, path = path, protocol = protocol, reqBody = reqBody, reqHeader = reqHeader, resHeader = resHeader.asInstanceOf[js.Any], startTime = startTime, statusCode = statusCode.asInstanceOf[js.Any], url = url)
  
    __obj.asInstanceOf[RecorderInfo]
  }
}

