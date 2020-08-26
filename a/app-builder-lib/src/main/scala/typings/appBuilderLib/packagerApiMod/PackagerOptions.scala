package typings.appBuilderLib.packagerApiMod

import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.coreMod.Platform
import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackagerOptions extends js.Object {
  val config: js.UndefOr[Configuration | String | Null] = js.native
  val effectiveOptionComputed: js.UndefOr[js.Function1[/* options */ js.Any, js.Promise[Boolean]]] = js.native
  var linux: js.UndefOr[js.Array[String]] = js.native
  var mac: js.UndefOr[js.Array[String]] = js.native
  var platformPackagerFactory: js.UndefOr[
    (js.Function2[/* info */ Packager, /* platform */ Platform, PlatformPackager[_]]) | Null
  ] = js.native
  val prepackaged: js.UndefOr[String | Null] = js.native
  var projectDir: js.UndefOr[String | Null] = js.native
  var targets: js.UndefOr[Map[Platform, Map[Arch, js.Array[String]]]] = js.native
  var win: js.UndefOr[js.Array[String]] = js.native
}

object PackagerOptions {
  @scala.inline
  def apply(): PackagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagerOptions]
  }
  @scala.inline
  implicit class PackagerOptionsOps[Self <: PackagerOptions] (val x: Self) extends AnyVal {
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
    def setConfig(value: Configuration | String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setConfigNull: Self = this.set("config", null)
    @scala.inline
    def setEffectiveOptionComputed(value: /* options */ js.Any => js.Promise[Boolean]): Self = this.set("effectiveOptionComputed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEffectiveOptionComputed: Self = this.set("effectiveOptionComputed", js.undefined)
    @scala.inline
    def setLinuxVarargs(value: String*): Self = this.set("linux", js.Array(value :_*))
    @scala.inline
    def setLinux(value: js.Array[String]): Self = this.set("linux", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinux: Self = this.set("linux", js.undefined)
    @scala.inline
    def setMacVarargs(value: String*): Self = this.set("mac", js.Array(value :_*))
    @scala.inline
    def setMac(value: js.Array[String]): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    @scala.inline
    def setPlatformPackagerFactory(value: (/* info */ Packager, /* platform */ Platform) => PlatformPackager[_]): Self = this.set("platformPackagerFactory", js.Any.fromFunction2(value))
    @scala.inline
    def deletePlatformPackagerFactory: Self = this.set("platformPackagerFactory", js.undefined)
    @scala.inline
    def setPlatformPackagerFactoryNull: Self = this.set("platformPackagerFactory", null)
    @scala.inline
    def setPrepackaged(value: String): Self = this.set("prepackaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepackaged: Self = this.set("prepackaged", js.undefined)
    @scala.inline
    def setPrepackagedNull: Self = this.set("prepackaged", null)
    @scala.inline
    def setProjectDir(value: String): Self = this.set("projectDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectDir: Self = this.set("projectDir", js.undefined)
    @scala.inline
    def setProjectDirNull: Self = this.set("projectDir", null)
    @scala.inline
    def setTargets(value: Map[Platform, Map[Arch, js.Array[String]]]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    @scala.inline
    def setWinVarargs(value: String*): Self = this.set("win", js.Array(value :_*))
    @scala.inline
    def setWin(value: js.Array[String]): Self = this.set("win", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWin: Self = this.set("win", js.undefined)
  }
  
}

