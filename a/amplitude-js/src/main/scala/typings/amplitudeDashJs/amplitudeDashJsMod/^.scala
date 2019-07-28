package typings.amplitudeDashJs.amplitudeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amplitude-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val __VERSION__ : String = js.native
  var options: Config = js.native
  def clearUserProperties(): Unit = js.native
  def getInstance(): AmplitudeClient = js.native
  def getInstance(instanceName: String): AmplitudeClient = js.native
  def getSessionId(): Double = js.native
  def identify(identify: Identify): Unit = js.native
  def identify(identify: Identify, callback: Callback): Unit = js.native
  def init(apiKey: String): Unit = js.native
  def init(apiKey: String, userId: String): Unit = js.native
  def init(apiKey: String, userId: String, options: Config): Unit = js.native
  def init(
    apiKey: String,
    userId: String,
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
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
  def setOptOut(optOut: Boolean): Unit = js.native
  def setUserId(userId: String): Unit = js.native
  def setUserProperties(properties: js.Any): Unit = js.native
  def setVersionName(version: String): Unit = js.native
}

