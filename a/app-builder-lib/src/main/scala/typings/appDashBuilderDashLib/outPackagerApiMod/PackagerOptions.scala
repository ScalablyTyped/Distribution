package typings.appDashBuilderDashLib.outPackagerApiMod

import typings.appDashBuilderDashLib.outConfigurationMod.Configuration
import typings.appDashBuilderDashLib.outCoreMod.Platform
import typings.appDashBuilderDashLib.outPackagerMod.Packager
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.builderDashUtil.outArchMod.Arch
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackagerOptions extends js.Object {
  val config: js.UndefOr[Configuration | String | Null] = js.undefined
  val effectiveOptionComputed: js.UndefOr[js.Function1[/* options */ js.Any, js.Promise[Boolean]]] = js.undefined
  var linux: js.UndefOr[js.Array[String]] = js.undefined
  var mac: js.UndefOr[js.Array[String]] = js.undefined
  var platformPackagerFactory: js.UndefOr[
    (js.Function2[/* info */ Packager, /* platform */ Platform, PlatformPackager[_]]) | Null
  ] = js.undefined
  val prepackaged: js.UndefOr[String | Null] = js.undefined
  var projectDir: js.UndefOr[String | Null] = js.undefined
  var targets: js.UndefOr[Map[Platform, Map[Arch, js.Array[String]]]] = js.undefined
  var win: js.UndefOr[js.Array[String]] = js.undefined
}

object PackagerOptions {
  @scala.inline
  def apply(
    config: Configuration | String = null,
    effectiveOptionComputed: /* options */ js.Any => js.Promise[Boolean] = null,
    linux: js.Array[String] = null,
    mac: js.Array[String] = null,
    platformPackagerFactory: (/* info */ Packager, /* platform */ Platform) => PlatformPackager[_] = null,
    prepackaged: String = null,
    projectDir: String = null,
    targets: Map[Platform, Map[Arch, js.Array[String]]] = null,
    win: js.Array[String] = null
  ): PackagerOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (effectiveOptionComputed != null) __obj.updateDynamic("effectiveOptionComputed")(js.Any.fromFunction1(effectiveOptionComputed))
    if (linux != null) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (platformPackagerFactory != null) __obj.updateDynamic("platformPackagerFactory")(js.Any.fromFunction2(platformPackagerFactory))
    if (prepackaged != null) __obj.updateDynamic("prepackaged")(prepackaged.asInstanceOf[js.Any])
    if (projectDir != null) __obj.updateDynamic("projectDir")(projectDir.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (win != null) __obj.updateDynamic("win")(win.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagerOptions]
  }
}

