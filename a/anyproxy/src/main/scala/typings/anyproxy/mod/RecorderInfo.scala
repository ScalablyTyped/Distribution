package typings.anyproxy.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderInfo extends js.Object {
  var _id: Double = js.native
  var duration: Double | String = js.native
  var endTime: Double | String = js.native
  var host: String = js.native
  var id: Double = js.native
  var length: Double | String = js.native
  var method: String = js.native
  var mime: String = js.native
  var path: String = js.native
  var protocol: String = js.native
  var reqBody: js.Any = js.native
  // req
  var reqHeader: Record[String, String] = js.native
  var resHeader: (Record[String, String]) | String = js.native
  var startTime: Double = js.native
  // res
  var statusCode: Double | String = js.native
  var url: String = js.native
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
  @scala.inline
  implicit class RecorderInfoOps[Self <: RecorderInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_id(value: Double): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double | String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Double | String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double | String): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setReqBody(value: js.Any): Self = this.set("reqBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setReqHeader(value: Record[String, String]): Self = this.set("reqHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setResHeader(value: (Record[String, String]) | String): Self = this.set("resHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double | String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

