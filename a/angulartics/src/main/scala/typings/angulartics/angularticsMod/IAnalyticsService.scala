package typings.angulartics.angularticsMod

import typings.angular.angularMod.ILocationService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnalyticsService extends js.Object {
  var clearCookies: js.Any = js.native
  var transactionTrack: js.Any = js.native
  def eventTrack(eventName: String): js.Any = js.native
  def eventTrack(eventName: String, properties: js.Any): js.Any = js.native
  def exceptionTrack(error: js.Any, cause: String): js.Any = js.native
  def getOptOut(): Boolean = js.native
  def incrementProperty(property: String): js.Any = js.native
  def incrementProperty(property: String, value: js.Any): js.Any = js.native
  def pageTrack(path: String): js.Any = js.native
  def pageTrack(path: String, location: ILocationService): js.Any = js.native
  def setAlias(alias: String): js.Any = js.native
  def setOptOut(value: Boolean): Unit = js.native
  def setSuperProperties(superProperties: js.Any): js.Any = js.native
  def setSuperPropertiesOnce(superProperties: js.Any): js.Any = js.native
  def setUserProperties(userProperties: js.Any): js.Any = js.native
  def setUserPropertiesOnce(userProperties: js.Any): js.Any = js.native
  def setUsername(username: String): js.Any = js.native
  def userTimings(properties: js.Any): js.Any = js.native
}

