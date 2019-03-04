package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowLoadSettings extends js.Object {
  val appVersion: java.lang.String
  val atomHome: java.lang.String
  val devMode: scala.Boolean
  val env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  val profileStartup: js.UndefOr[scala.Boolean] = js.undefined
  val resourcePath: java.lang.String
  val safeMode: scala.Boolean
}

object WindowLoadSettings {
  @scala.inline
  def apply(
    appVersion: java.lang.String,
    atomHome: java.lang.String,
    devMode: scala.Boolean,
    resourcePath: java.lang.String,
    safeMode: scala.Boolean,
    env: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    profileStartup: js.UndefOr[scala.Boolean] = js.undefined
  ): WindowLoadSettings = {
    val __obj = js.Dynamic.literal(appVersion = appVersion, atomHome = atomHome, devMode = devMode, resourcePath = resourcePath, safeMode = safeMode)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(profileStartup)) __obj.updateDynamic("profileStartup")(profileStartup)
    __obj.asInstanceOf[WindowLoadSettings]
  }
}

