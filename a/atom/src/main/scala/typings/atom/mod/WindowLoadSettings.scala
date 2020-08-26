package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowLoadSettings extends js.Object {
  val appVersion: String = js.native
  val atomHome: String = js.native
  val devMode: Boolean = js.native
  val env: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  val profileStartup: js.UndefOr[Boolean] = js.native
  val resourcePath: String = js.native
  val safeMode: Boolean = js.native
}

object WindowLoadSettings {
  @scala.inline
  def apply(appVersion: String, atomHome: String, devMode: Boolean, resourcePath: String, safeMode: Boolean): WindowLoadSettings = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], atomHome = atomHome.asInstanceOf[js.Any], devMode = devMode.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], safeMode = safeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLoadSettings]
  }
  @scala.inline
  implicit class WindowLoadSettingsOps[Self <: WindowLoadSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtomHome(value: String): Self = this.set("atomHome", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevMode(value: Boolean): Self = this.set("devMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcePath(value: String): Self = this.set("resourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSafeMode(value: Boolean): Self = this.set("safeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: StringDictionary[js.UndefOr[String]]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setProfileStartup(value: Boolean): Self = this.set("profileStartup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileStartup: Self = this.set("profileStartup", js.undefined)
  }
  
}

