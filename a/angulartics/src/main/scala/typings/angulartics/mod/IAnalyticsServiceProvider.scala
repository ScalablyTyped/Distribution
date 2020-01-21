package typings.angulartics.mod

import typings.angular.mod.ILocationService
import typings.angular.mod.IServiceProvider
import typings.angulartics.AnonBufferFlushDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnalyticsServiceProvider extends IServiceProvider {
  var settings: AnonBufferFlushDelay = js.native
  def developerMode(value: Boolean): Unit = js.native
  def excludeRoutes(value: js.Array[String]): Unit = js.native
  def firstPageview(value: Boolean): Unit = js.native
  def queryKeysBlacklist(keys: js.Array[String]): Unit = js.native
  def queryKeysWhitelist(keys: js.Array[String]): Unit = js.native
  def registerClearCookies(callback: js.Any): Unit = js.native
  def registerEventTrack(callback: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], _]): Unit = js.native
  def registerIncrementProperty(callback: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], _]): Unit = js.native
  def registerPageTrack(callback: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], _]): Unit = js.native
  def registerSetAlias(callback: js.Function1[/* alias */ String, _]): Unit = js.native
  def registerSetSuperProperties(callback: js.Function1[/* superProperties */ js.Any, _]): Unit = js.native
  def registerSetSuperPropertiesOnce(callback: js.Function1[/* superProperties */ js.Any, _]): Unit = js.native
  def registerSetUserProperties(callback: js.Function1[/* userProperties */ js.Any, _]): Unit = js.native
  def registerSetUserPropertiesOnce(callback: js.Function1[/* userProperties */ js.Any, _]): Unit = js.native
  def registerSetUsername(callback: js.Function1[/* username */ String, _]): Unit = js.native
  def registerTransactionTrack(callback: js.Any): Unit = js.native
  def registerUserTimings(callback: js.Function1[/* properties */ js.Any, _]): Unit = js.native
  def trackExceptions(value: Boolean): Unit = js.native
  def trackRoutes(value: Boolean): Unit = js.native
  def trackStates(value: Boolean): Unit = js.native
  def virtualPageviews(value: Boolean): Unit = js.native
  def withAutoBase(value: Boolean): Unit = js.native
  def withBase(value: Boolean): Unit = js.native
}

