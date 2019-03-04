package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnvelope extends ISerializable {
  var appId: java.lang.String
  var appVer: java.lang.String
  var data: js.Any
  var deviceId: java.lang.String
  var flags: scala.Double
  var iKey: java.lang.String
  var name: java.lang.String
  var os: java.lang.String
  var osVer: java.lang.String
  var sampleRate: scala.Double
  var seq: java.lang.String
  var tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  var time: java.lang.String
  var userId: java.lang.String
  var ver: scala.Double
}

object IEnvelope {
  @scala.inline
  def apply(
    aiDataContract: js.Any,
    appId: java.lang.String,
    appVer: java.lang.String,
    data: js.Any,
    deviceId: java.lang.String,
    flags: scala.Double,
    iKey: java.lang.String,
    name: java.lang.String,
    os: java.lang.String,
    osVer: java.lang.String,
    sampleRate: scala.Double,
    seq: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    time: java.lang.String,
    userId: java.lang.String,
    ver: scala.Double
  ): IEnvelope = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract, appId = appId, appVer = appVer, data = data, deviceId = deviceId, flags = flags, iKey = iKey, name = name, os = os, osVer = osVer, sampleRate = sampleRate, seq = seq, tags = tags, time = time, userId = userId, ver = ver)
  
    __obj.asInstanceOf[IEnvelope]
  }
}

