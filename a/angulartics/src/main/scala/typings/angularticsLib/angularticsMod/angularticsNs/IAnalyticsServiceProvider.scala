package typings
package angularticsLib.angularticsMod.angularticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnalyticsServiceProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  var settings: angularticsLib.Anon_BufferFlushDelay
  def developerMode(value: scala.Boolean): scala.Unit
  def excludeRoutes(value: js.Array[java.lang.String]): scala.Unit
  def firstPageview(value: scala.Boolean): scala.Unit
  def queryKeysBlacklist(keys: js.Array[java.lang.String]): scala.Unit
  def queryKeysWhitelist(keys: js.Array[java.lang.String]): scala.Unit
  def registerClearCookies(callback: js.Any): scala.Unit
  def registerEventTrack(callback: js.Function2[/* eventName */ java.lang.String, /* properties */ js.UndefOr[js.Any], _]): scala.Unit
  def registerIncrementProperty(callback: js.Function2[/* property */ java.lang.String, /* value */ js.UndefOr[js.Any], _]): scala.Unit
  def registerPageTrack(
    callback: js.Function2[
      /* path */ java.lang.String, 
      /* location */ js.UndefOr[angularLib.angularMod.angularNs.ILocationService], 
      _
    ]
  ): scala.Unit
  def registerSetAlias(callback: js.Function1[/* alias */ java.lang.String, _]): scala.Unit
  def registerSetSuperProperties(callback: js.Function1[/* superProperties */ js.Any, _]): scala.Unit
  def registerSetSuperPropertiesOnce(callback: js.Function1[/* superProperties */ js.Any, _]): scala.Unit
  def registerSetUserProperties(callback: js.Function1[/* userProperties */ js.Any, _]): scala.Unit
  def registerSetUserPropertiesOnce(callback: js.Function1[/* userProperties */ js.Any, _]): scala.Unit
  def registerSetUsername(callback: js.Function1[/* username */ java.lang.String, _]): scala.Unit
  def registerTransactionTrack(callback: js.Any): scala.Unit
  def registerUserTimings(callback: js.Function1[/* properties */ js.Any, _]): scala.Unit
  def trackExceptions(value: scala.Boolean): scala.Unit
  def trackRoutes(value: scala.Boolean): scala.Unit
  def trackStates(value: scala.Boolean): scala.Unit
  def virtualPageviews(value: scala.Boolean): scala.Unit
  def withAutoBase(value: scala.Boolean): scala.Unit
  def withBase(value: scala.Boolean): scala.Unit
}

object IAnalyticsServiceProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    developerMode: scala.Boolean => scala.Unit,
    excludeRoutes: js.Array[java.lang.String] => scala.Unit,
    firstPageview: scala.Boolean => scala.Unit,
    queryKeysBlacklist: js.Array[java.lang.String] => scala.Unit,
    queryKeysWhitelist: js.Array[java.lang.String] => scala.Unit,
    registerClearCookies: js.Any => scala.Unit,
    registerEventTrack: js.Function2[/* eventName */ java.lang.String, /* properties */ js.UndefOr[js.Any], _] => scala.Unit,
    registerIncrementProperty: js.Function2[/* property */ java.lang.String, /* value */ js.UndefOr[js.Any], _] => scala.Unit,
    registerPageTrack: js.Function2[
      /* path */ java.lang.String, 
      /* location */ js.UndefOr[angularLib.angularMod.angularNs.ILocationService], 
      _
    ] => scala.Unit,
    registerSetAlias: js.Function1[/* alias */ java.lang.String, _] => scala.Unit,
    registerSetSuperProperties: js.Function1[/* superProperties */ js.Any, _] => scala.Unit,
    registerSetSuperPropertiesOnce: js.Function1[/* superProperties */ js.Any, _] => scala.Unit,
    registerSetUserProperties: js.Function1[/* userProperties */ js.Any, _] => scala.Unit,
    registerSetUserPropertiesOnce: js.Function1[/* userProperties */ js.Any, _] => scala.Unit,
    registerSetUsername: js.Function1[/* username */ java.lang.String, _] => scala.Unit,
    registerTransactionTrack: js.Any => scala.Unit,
    registerUserTimings: js.Function1[/* properties */ js.Any, _] => scala.Unit,
    settings: angularticsLib.Anon_BufferFlushDelay,
    trackExceptions: scala.Boolean => scala.Unit,
    trackRoutes: scala.Boolean => scala.Unit,
    trackStates: scala.Boolean => scala.Unit,
    virtualPageviews: scala.Boolean => scala.Unit,
    withAutoBase: scala.Boolean => scala.Unit,
    withBase: scala.Boolean => scala.Unit
  ): IAnalyticsServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get, developerMode = js.Any.fromFunction1(developerMode), excludeRoutes = js.Any.fromFunction1(excludeRoutes), firstPageview = js.Any.fromFunction1(firstPageview), queryKeysBlacklist = js.Any.fromFunction1(queryKeysBlacklist), queryKeysWhitelist = js.Any.fromFunction1(queryKeysWhitelist), registerClearCookies = js.Any.fromFunction1(registerClearCookies), registerEventTrack = js.Any.fromFunction1(registerEventTrack), registerIncrementProperty = js.Any.fromFunction1(registerIncrementProperty), registerPageTrack = js.Any.fromFunction1(registerPageTrack), registerSetAlias = js.Any.fromFunction1(registerSetAlias), registerSetSuperProperties = js.Any.fromFunction1(registerSetSuperProperties), registerSetSuperPropertiesOnce = js.Any.fromFunction1(registerSetSuperPropertiesOnce), registerSetUserProperties = js.Any.fromFunction1(registerSetUserProperties), registerSetUserPropertiesOnce = js.Any.fromFunction1(registerSetUserPropertiesOnce), registerSetUsername = js.Any.fromFunction1(registerSetUsername), registerTransactionTrack = js.Any.fromFunction1(registerTransactionTrack), registerUserTimings = js.Any.fromFunction1(registerUserTimings), settings = settings, trackExceptions = js.Any.fromFunction1(trackExceptions), trackRoutes = js.Any.fromFunction1(trackRoutes), trackStates = js.Any.fromFunction1(trackStates), virtualPageviews = js.Any.fromFunction1(virtualPageviews), withAutoBase = js.Any.fromFunction1(withAutoBase), withBase = js.Any.fromFunction1(withBase))
  
    __obj.asInstanceOf[IAnalyticsServiceProvider]
  }
}

