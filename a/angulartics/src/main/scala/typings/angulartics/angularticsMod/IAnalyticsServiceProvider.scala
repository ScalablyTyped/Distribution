package typings.angulartics.angularticsMod

import typings.angular.angularMod.ILocationService
import typings.angular.angularMod.IServiceProvider
import typings.angulartics.Anon_BufferFlushDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnalyticsServiceProvider extends IServiceProvider {
  var settings: Anon_BufferFlushDelay
  def developerMode(value: Boolean): Unit
  def excludeRoutes(value: js.Array[String]): Unit
  def firstPageview(value: Boolean): Unit
  def queryKeysBlacklist(keys: js.Array[String]): Unit
  def queryKeysWhitelist(keys: js.Array[String]): Unit
  def registerClearCookies(callback: js.Any): Unit
  def registerEventTrack(callback: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], _]): Unit
  def registerIncrementProperty(callback: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], _]): Unit
  def registerPageTrack(callback: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], _]): Unit
  def registerSetAlias(callback: js.Function1[/* alias */ String, _]): Unit
  def registerSetSuperProperties(callback: js.Function1[/* superProperties */ js.Any, _]): Unit
  def registerSetSuperPropertiesOnce(callback: js.Function1[/* superProperties */ js.Any, _]): Unit
  def registerSetUserProperties(callback: js.Function1[/* userProperties */ js.Any, _]): Unit
  def registerSetUserPropertiesOnce(callback: js.Function1[/* userProperties */ js.Any, _]): Unit
  def registerSetUsername(callback: js.Function1[/* username */ String, _]): Unit
  def registerTransactionTrack(callback: js.Any): Unit
  def registerUserTimings(callback: js.Function1[/* properties */ js.Any, _]): Unit
  def trackExceptions(value: Boolean): Unit
  def trackRoutes(value: Boolean): Unit
  def trackStates(value: Boolean): Unit
  def virtualPageviews(value: Boolean): Unit
  def withAutoBase(value: Boolean): Unit
  def withBase(value: Boolean): Unit
}

object IAnalyticsServiceProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    developerMode: Boolean => Unit,
    excludeRoutes: js.Array[String] => Unit,
    firstPageview: Boolean => Unit,
    queryKeysBlacklist: js.Array[String] => Unit,
    queryKeysWhitelist: js.Array[String] => Unit,
    registerClearCookies: js.Any => Unit,
    registerEventTrack: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], _] => Unit,
    registerIncrementProperty: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], _] => Unit,
    registerPageTrack: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], _] => Unit,
    registerSetAlias: js.Function1[/* alias */ String, _] => Unit,
    registerSetSuperProperties: js.Function1[/* superProperties */ js.Any, _] => Unit,
    registerSetSuperPropertiesOnce: js.Function1[/* superProperties */ js.Any, _] => Unit,
    registerSetUserProperties: js.Function1[/* userProperties */ js.Any, _] => Unit,
    registerSetUserPropertiesOnce: js.Function1[/* userProperties */ js.Any, _] => Unit,
    registerSetUsername: js.Function1[/* username */ String, _] => Unit,
    registerTransactionTrack: js.Any => Unit,
    registerUserTimings: js.Function1[/* properties */ js.Any, _] => Unit,
    settings: Anon_BufferFlushDelay,
    trackExceptions: Boolean => Unit,
    trackRoutes: Boolean => Unit,
    trackStates: Boolean => Unit,
    virtualPageviews: Boolean => Unit,
    withAutoBase: Boolean => Unit,
    withBase: Boolean => Unit
  ): IAnalyticsServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], developerMode = js.Any.fromFunction1(developerMode), excludeRoutes = js.Any.fromFunction1(excludeRoutes), firstPageview = js.Any.fromFunction1(firstPageview), queryKeysBlacklist = js.Any.fromFunction1(queryKeysBlacklist), queryKeysWhitelist = js.Any.fromFunction1(queryKeysWhitelist), registerClearCookies = js.Any.fromFunction1(registerClearCookies), registerEventTrack = js.Any.fromFunction1(registerEventTrack), registerIncrementProperty = js.Any.fromFunction1(registerIncrementProperty), registerPageTrack = js.Any.fromFunction1(registerPageTrack), registerSetAlias = js.Any.fromFunction1(registerSetAlias), registerSetSuperProperties = js.Any.fromFunction1(registerSetSuperProperties), registerSetSuperPropertiesOnce = js.Any.fromFunction1(registerSetSuperPropertiesOnce), registerSetUserProperties = js.Any.fromFunction1(registerSetUserProperties), registerSetUserPropertiesOnce = js.Any.fromFunction1(registerSetUserPropertiesOnce), registerSetUsername = js.Any.fromFunction1(registerSetUsername), registerTransactionTrack = js.Any.fromFunction1(registerTransactionTrack), registerUserTimings = js.Any.fromFunction1(registerUserTimings), settings = settings.asInstanceOf[js.Any], trackExceptions = js.Any.fromFunction1(trackExceptions), trackRoutes = js.Any.fromFunction1(trackRoutes), trackStates = js.Any.fromFunction1(trackStates), virtualPageviews = js.Any.fromFunction1(virtualPageviews), withAutoBase = js.Any.fromFunction1(withAutoBase), withBase = js.Any.fromFunction1(withBase))
  
    __obj.asInstanceOf[IAnalyticsServiceProvider]
  }
}

