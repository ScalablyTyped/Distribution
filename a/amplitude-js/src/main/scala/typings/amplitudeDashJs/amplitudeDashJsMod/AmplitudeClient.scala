package typings.amplitudeDashJs.amplitudeDashJsMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amplitude-js", "AmplitudeClient")
@js.native
class AmplitudeClient () extends js.Object {
  def this(instanceName: String) = this()
  var Identify: Instantiable0[typings.amplitudeDashJs.amplitudeDashJsMod.Identify] = js.native
  var Revenue: Instantiable0[typings.amplitudeDashJs.amplitudeDashJsMod.Revenue] = js.native
  var options: Config = js.native
  def clearUserProperties(): Unit = js.native
  def getSessionId(): Double = js.native
  def identify(identify_obj: Identify): Unit = js.native
  def identify(identify_obj: Identify, opt_callback: Callback): Unit = js.native
  def init(apiKey: String): Unit = js.native
  def init(apiKey: String, userId: String): Unit = js.native
  def init(apiKey: String, userId: String, config: Config): Unit = js.native
  def init(
    apiKey: String,
    userId: String,
    config: Config,
    callback: js.Function1[/* client */ this.type, Unit]
  ): Unit = js.native
  def isNewSession(): Boolean = js.native
  def logEvent(event: String): LogReturn = js.native
  def logEvent(event: String, data: js.Any): LogReturn = js.native
  def logEvent(event: String, data: js.Any, callback: Callback): LogReturn = js.native
  def logEventWithGroups(event: String): LogReturn = js.native
  def logEventWithGroups(event: String, data: js.Any): LogReturn = js.native
  def logEventWithGroups(event: String, data: js.Any, groups: js.Any): LogReturn = js.native
  def logEventWithGroups(event: String, data: js.Any, groups: js.Any, callback: Callback): LogReturn = js.native
  def logEventWithTimestamp(event: String): LogReturn = js.native
  def logEventWithTimestamp(event: String, data: js.Any): LogReturn = js.native
  def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double): LogReturn = js.native
  def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double, callback: Callback): LogReturn = js.native
  def logRevenue(pric: Double, quantity: Double, product: String): LogReturn = js.native
  def logRevenueV2(revenue_obj: Revenue): LogReturn = js.native
  def regenerateDeviceId(): Unit = js.native
  def setDeviceId(id: String): Unit = js.native
  def setDomain(domain: String): Unit = js.native
  def setGlobalUserProperties(properties: js.Any): Unit = js.native
  def setGroup(groupType: String, groupName: String): Unit = js.native
  def setGroup(groupType: String, groupName: js.Array[String]): Unit = js.native
  def setOptOut(enable: Boolean): Unit = js.native
  def setSessionId(sessionId: Double): Unit = js.native
  def setUserId(userId: String): Unit = js.native
  def setUserProperties(properties: js.Any): Unit = js.native
  def setVersionName(versionName: String): Unit = js.native
}

