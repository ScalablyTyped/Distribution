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

