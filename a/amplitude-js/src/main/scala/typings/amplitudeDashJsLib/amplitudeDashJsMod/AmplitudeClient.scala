package typings
package amplitudeDashJsLib.amplitudeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amplitude-js", "AmplitudeClient")
@js.native
class AmplitudeClient () extends js.Object {
  def this(instanceName: java.lang.String) = this()
  var Identify: org.scalablytyped.runtime.Instantiable0[Identify] = js.native
  var Revenue: org.scalablytyped.runtime.Instantiable0[Revenue] = js.native
  var options: Config = js.native
  def clearUserProperties(): scala.Unit = js.native
  def getSessionId(): scala.Double = js.native
  def identify(identify_obj: Identify): scala.Unit = js.native
  def identify(identify_obj: Identify, opt_callback: Callback): scala.Unit = js.native
  def init(apiKey: java.lang.String): scala.Unit = js.native
  def init(apiKey: java.lang.String, userId: java.lang.String): scala.Unit = js.native
  def init(apiKey: java.lang.String, userId: java.lang.String, config: Config): scala.Unit = js.native
  def init(
    apiKey: java.lang.String,
    userId: java.lang.String,
    config: Config,
    callback: js.Function1[/* client */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def isNewSession(): scala.Boolean = js.native
  def logEvent(event: java.lang.String): LogReturn = js.native
  def logEvent(event: java.lang.String, data: js.Any): LogReturn = js.native
  def logEvent(event: java.lang.String, data: js.Any, callback: Callback): LogReturn = js.native
  def logEventWithGroups(event: java.lang.String): LogReturn = js.native
  def logEventWithGroups(event: java.lang.String, data: js.Any): LogReturn = js.native
  def logEventWithGroups(event: java.lang.String, data: js.Any, groups: js.Any): LogReturn = js.native
  def logEventWithGroups(event: java.lang.String, data: js.Any, groups: js.Any, callback: Callback): LogReturn = js.native
  def logEventWithTimestamp(event: java.lang.String): LogReturn = js.native
  def logEventWithTimestamp(event: java.lang.String, data: js.Any): LogReturn = js.native
  def logEventWithTimestamp(event: java.lang.String, data: js.Any, timestamp: scala.Double): LogReturn = js.native
  def logEventWithTimestamp(event: java.lang.String, data: js.Any, timestamp: scala.Double, callback: Callback): LogReturn = js.native
  def logRevenue(pric: scala.Double, quantity: scala.Double, product: java.lang.String): LogReturn = js.native
  def logRevenueV2(revenue_obj: Revenue): LogReturn = js.native
  def regenerateDeviceId(): scala.Unit = js.native
  def setDeviceId(id: java.lang.String): scala.Unit = js.native
  def setDomain(domain: java.lang.String): scala.Unit = js.native
  def setGlobalUserProperties(properties: js.Any): scala.Unit = js.native
  def setGroup(groupType: java.lang.String, groupName: java.lang.String): scala.Unit = js.native
  def setGroup(groupType: java.lang.String, groupName: js.Array[java.lang.String]): scala.Unit = js.native
  def setOptOut(enable: scala.Boolean): scala.Unit = js.native
  def setSessionId(sessionId: scala.Double): scala.Unit = js.native
  def setUserId(userId: java.lang.String): scala.Unit = js.native
  def setUserProperties(properties: js.Any): scala.Unit = js.native
  def setVersionName(versionName: java.lang.String): scala.Unit = js.native
}

