package typings.applicationinsightsJs.Microsoft.ApplicationInsights

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnvelope extends ISerializable {
  var appId: String = js.native
  var appVer: String = js.native
  var data: js.Any = js.native
  var deviceId: String = js.native
  var flags: Double = js.native
  var iKey: String = js.native
  var name: String = js.native
  var os: String = js.native
  var osVer: String = js.native
  var sampleRate: Double = js.native
  var seq: String = js.native
  var tags: StringDictionary[js.Any] = js.native
  var time: String = js.native
  var userId: String = js.native
  var ver: Double = js.native
}

object IEnvelope {
  @scala.inline
  def apply(
    aiDataContract: js.Any,
    appId: String,
    appVer: String,
    data: js.Any,
    deviceId: String,
    flags: Double,
    iKey: String,
    name: String,
    os: String,
    osVer: String,
    sampleRate: Double,
    seq: String,
    tags: StringDictionary[js.Any],
    time: String,
    userId: String,
    ver: Double
  ): IEnvelope = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appVer = appVer.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osVer = osVer.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvelope]
  }
  @scala.inline
  implicit class IEnvelopeOps[Self <: IEnvelope] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVer(value: String): Self = this.set("appVer", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setIKey(value: String): Self = this.set("iKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setOsVer(value: String): Self = this.set("osVer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeq(value: String): Self = this.set("seq", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[js.Any]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: Double): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

