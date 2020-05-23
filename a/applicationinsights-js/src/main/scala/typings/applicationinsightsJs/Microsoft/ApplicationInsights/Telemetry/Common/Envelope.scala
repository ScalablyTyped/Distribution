package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.IEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends IEnvelope {
  @JSName("data")
  var data_Envelope: Base
}

object Envelope {
  @scala.inline
  def apply(
    aiDataContract: js.Any,
    appId: String,
    appVer: String,
    data: Base,
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
  ): Envelope = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appVer = appVer.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osVer = osVer.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

