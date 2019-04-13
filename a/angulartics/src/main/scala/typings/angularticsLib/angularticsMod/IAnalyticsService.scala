package typings
package angularticsLib.angularticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnalyticsService extends js.Object {
  var clearCookies: js.Any = js.native
  var transactionTrack: js.Any = js.native
  def eventTrack(eventName: java.lang.String): js.Any = js.native
  def eventTrack(eventName: java.lang.String, properties: js.Any): js.Any = js.native
  def exceptionTrack(error: js.Any, cause: java.lang.String): js.Any = js.native
  def getOptOut(): scala.Boolean = js.native
  def incrementProperty(property: java.lang.String): js.Any = js.native
  def incrementProperty(property: java.lang.String, value: js.Any): js.Any = js.native
  def pageTrack(path: java.lang.String): js.Any = js.native
  def pageTrack(path: java.lang.String, location: angularLib.angularMod.ILocationService): js.Any = js.native
  def setAlias(alias: java.lang.String): js.Any = js.native
  def setOptOut(value: scala.Boolean): scala.Unit = js.native
  def setSuperProperties(superProperties: js.Any): js.Any = js.native
  def setSuperPropertiesOnce(superProperties: js.Any): js.Any = js.native
  def setUserProperties(userProperties: js.Any): js.Any = js.native
  def setUserPropertiesOnce(userProperties: js.Any): js.Any = js.native
  def setUsername(username: java.lang.String): js.Any = js.native
  def userTimings(properties: js.Any): js.Any = js.native
}

