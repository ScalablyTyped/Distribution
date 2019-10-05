package typings.applicationinsightsDashJs.Microsoft.ApplicationInsights

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnvelope extends ISerializable {
  var appId: String
  var appVer: String
  var data: js.Any
  var deviceId: String
  var flags: Double
  var iKey: String
  var name: String
  var os: String
  var osVer: String
  var sampleRate: Double
  var seq: String
  var tags: StringDictionary[js.Any]
  var time: String
  var userId: String
  var ver: Double
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
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract, appId = appId, appVer = appVer, data = data, deviceId = deviceId, flags = flags, iKey = iKey, name = name, os = os, osVer = osVer, sampleRate = sampleRate, seq = seq, tags = tags, time = time, userId = userId, ver = ver)
  
    __obj.asInstanceOf[IEnvelope]
  }
}

