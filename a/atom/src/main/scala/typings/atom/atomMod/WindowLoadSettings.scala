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
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], atomHome = atomHome.asInstanceOf[js.Any], devMode = devMode.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], safeMode = safeMode.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(profileStartup)) __obj.updateDynamic("profileStartup")(profileStartup.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLoadSettings]
  }
}

