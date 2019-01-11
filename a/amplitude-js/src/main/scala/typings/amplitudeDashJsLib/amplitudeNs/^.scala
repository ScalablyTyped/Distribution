package typings
package amplitudeDashJsLib.amplitudeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("amplitude")
@js.native
object ^ extends js.Object {
  val `__VERSION__`: java.lang.String = js.native
  var options: amplitudeDashJsLib.amplitudeNs.Config = js.native
  def clearUserProperties(): scala.Unit = js.native
  def getInstance(): amplitudeDashJsLib.amplitudeNs.AmplitudeClient = js.native
  def getInstance(instanceName: java.lang.String): amplitudeDashJsLib.amplitudeNs.AmplitudeClient = js.native
  def getSessionId(): scala.Double = js.native
  def identify(identify: amplitudeDashJsLib.amplitudeNs.Identify): scala.Unit = js.native
  def identify(
    identify: amplitudeDashJsLib.amplitudeNs.Identify,
    callback: amplitudeDashJsLib.amplitudeNs.Callback
  ): scala.Unit = js.native
  def init(apiKey: java.lang.String): scala.Unit = js.native
  def init(apiKey: java.lang.String, userId: java.lang.String): scala.Unit = js.native
  def init(apiKey: java.lang.String, userId: java.lang.String, options: amplitudeDashJsLib.amplitudeNs.Config): scala.Unit = js.native
  def init(
    apiKey: java.lang.String,
    userId: java.lang.String,
    options: amplitudeDashJsLib.amplitudeNs.Config,
    callback: js.Function1[/* client */ amplitudeDashJsLib.amplitudeNs.AmplitudeClient, scala.Unit]
  ): scala.Unit = js.native
  def isNewSession(): scala.Boolean = js.native
  def logEvent(event: java.lang.String): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEvent(event: java.lang.String, data: js.Any): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEvent(event: java.lang.String, data: js.Any, callback: amplitudeDashJsLib.amplitudeNs.Callback): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEventWithGroups(event: java.lang.String): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEventWithGroups(event: java.lang.String, data: js.Any): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEventWithGroups(event: java.lang.String, data: js.Any, groups: js.Any): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEventWithGroups(
    event: java.lang.String,
    data: js.Any,
    groups: js.Any,
    callback: amplitudeDashJsLib.amplitudeNs.Callback
  ): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEventWithTimestamp(event: java.lang.String): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEventWithTimestamp(event: java.lang.String, data: js.Any): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEventWithTimestamp(event: java.lang.String, data: js.Any, timestamp: scala.Double): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logEventWithTimestamp(
    event: java.lang.String,
    data: js.Any,
    timestamp: scala.Double,
    callback: amplitudeDashJsLib.amplitudeNs.Callback
  ): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logRevenue(pric: scala.Double, quantity: scala.Double, product: java.lang.String): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def logRevenueV2(revenue_obj: amplitudeDashJsLib.amplitudeNs.Revenue): amplitudeDashJsLib.amplitudeNs.LogReturn = js.native
  def regenerateDeviceId(): scala.Unit = js.native
  def setDeviceId(id: java.lang.String): scala.Unit = js.native
  def setDomain(domain: java.lang.String): scala.Unit = js.native
  def setGlobalUserProperties(properties: js.Any): scala.Unit = js.native
  def setGroup(groupType: java.lang.String, groupName: java.lang.String): scala.Unit = js.native
  def setGroup(groupType: java.lang.String, groupName: js.Array[java.lang.String]): scala.Unit = js.native
  def setOptOut(optOut: scala.Boolean): scala.Unit = js.native
  def setUserId(userId: java.lang.String): scala.Unit = js.native
  def setUserProperties(properties: js.Any): scala.Unit = js.native
  def setVersionName(version: java.lang.String): scala.Unit = js.native
}

