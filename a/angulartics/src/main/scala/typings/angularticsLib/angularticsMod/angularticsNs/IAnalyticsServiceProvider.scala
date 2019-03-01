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
    developerMode: js.Function1[scala.Boolean, scala.Unit],
    excludeRoutes: js.Function1[js.Array[java.lang.String], scala.Unit],
    firstPageview: js.Function1[scala.Boolean, scala.Unit],
    queryKeysBlacklist: js.Function1[js.Array[java.lang.String], scala.Unit],
    queryKeysWhitelist: js.Function1[js.Array[java.lang.String], scala.Unit],
    registerClearCookies: js.Function1[js.Any, scala.Unit],
    registerEventTrack: js.Function1[
      js.Function2[/* eventName */ java.lang.String, /* properties */ js.UndefOr[js.Any], _], 
      scala.Unit
    ],
    registerIncrementProperty: js.Function1[
      js.Function2[/* property */ java.lang.String, /* value */ js.UndefOr[js.Any], _], 
      scala.Unit
    ],
    registerPageTrack: js.Function1[
      js.Function2[
        /* path */ java.lang.String, 
        /* location */ js.UndefOr[angularLib.angularMod.angularNs.ILocationService], 
        _
      ], 
      scala.Unit
    ],
    registerSetAlias: js.Function1[js.Function1[/* alias */ java.lang.String, _], scala.Unit],
    registerSetSuperProperties: js.Function1[js.Function1[/* superProperties */ js.Any, _], scala.Unit],
    registerSetSuperPropertiesOnce: js.Function1[js.Function1[/* superProperties */ js.Any, _], scala.Unit],
    registerSetUserProperties: js.Function1[js.Function1[/* userProperties */ js.Any, _], scala.Unit],
    registerSetUserPropertiesOnce: js.Function1[js.Function1[/* userProperties */ js.Any, _], scala.Unit],
    registerSetUsername: js.Function1[js.Function1[/* username */ java.lang.String, _], scala.Unit],
    registerTransactionTrack: js.Function1[js.Any, scala.Unit],
    registerUserTimings: js.Function1[js.Function1[/* properties */ js.Any, _], scala.Unit],
    settings: angularticsLib.Anon_BufferFlushDelay,
    trackExceptions: js.Function1[scala.Boolean, scala.Unit],
    trackRoutes: js.Function1[scala.Boolean, scala.Unit],
    trackStates: js.Function1[scala.Boolean, scala.Unit],
    virtualPageviews: js.Function1[scala.Boolean, scala.Unit],
    withAutoBase: js.Function1[scala.Boolean, scala.Unit],
    withBase: js.Function1[scala.Boolean, scala.Unit]
  ): IAnalyticsServiceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$get")($get)
    __obj.updateDynamic("developerMode")(developerMode)
    __obj.updateDynamic("excludeRoutes")(excludeRoutes)
    __obj.updateDynamic("firstPageview")(firstPageview)
    __obj.updateDynamic("queryKeysBlacklist")(queryKeysBlacklist)
    __obj.updateDynamic("queryKeysWhitelist")(queryKeysWhitelist)
    __obj.updateDynamic("registerClearCookies")(registerClearCookies)
    __obj.updateDynamic("registerEventTrack")(registerEventTrack)
    __obj.updateDynamic("registerIncrementProperty")(registerIncrementProperty)
    __obj.updateDynamic("registerPageTrack")(registerPageTrack)
    __obj.updateDynamic("registerSetAlias")(registerSetAlias)
    __obj.updateDynamic("registerSetSuperProperties")(registerSetSuperProperties)
    __obj.updateDynamic("registerSetSuperPropertiesOnce")(registerSetSuperPropertiesOnce)
    __obj.updateDynamic("registerSetUserProperties")(registerSetUserProperties)
    __obj.updateDynamic("registerSetUserPropertiesOnce")(registerSetUserPropertiesOnce)
    __obj.updateDynamic("registerSetUsername")(registerSetUsername)
    __obj.updateDynamic("registerTransactionTrack")(registerTransactionTrack)
    __obj.updateDynamic("registerUserTimings")(registerUserTimings)
    __obj.updateDynamic("settings")(settings)
    __obj.updateDynamic("trackExceptions")(trackExceptions)
    __obj.updateDynamic("trackRoutes")(trackRoutes)
    __obj.updateDynamic("trackStates")(trackStates)
    __obj.updateDynamic("virtualPageviews")(virtualPageviews)
    __obj.updateDynamic("withAutoBase")(withAutoBase)
    __obj.updateDynamic("withBase")(withBase)
    __obj.asInstanceOf[IAnalyticsServiceProvider]
  }
}

