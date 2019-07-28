package typings.atom.atomMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowLoadSettings extends js.Object {
  val appVersion: String
  val atomHome: String
  val devMode: Boolean
  val env: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  val profileStartup: js.UndefOr[Boolean] = js.undefined
  val resourcePath: String
  val safeMode: Boolean
}

object WindowLoadSettings {
  @scala.inline
  def apply(
    appVersion: String,
    atomHome: String,
    devMode: Boolean,
    resourcePath: String,
    safeMode: Boolean,
    env: StringDictionary[js.UndefOr[String]] = null,
    profileStartup: js.UndefOr[Boolean] = js.undefined
  ): WindowLoadSettings = {
    val __obj = js.Dynamic.literal(appVersion = appVersion, atomHome = atomHome, devMode = devMode, resourcePath = resourcePath, safeMode = safeMode)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(profileStartup)) __obj.updateDynamic("profileStartup")(profileStartup)
    __obj.asInstanceOf[WindowLoadSettings]
  }
}

