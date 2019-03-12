package typings
package appDashBuilderDashLibLib.outPackagerApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackagerOptions extends js.Object {
  val config: js.UndefOr[
    appDashBuilderDashLibLib.outConfigurationMod.Configuration | java.lang.String | scala.Null
  ] = js.undefined
  val effectiveOptionComputed: js.UndefOr[js.Function1[/* options */ js.Any, js.Promise[scala.Boolean]]] = js.undefined
  var linux: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var mac: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var platformPackagerFactory: js.UndefOr[
    (js.Function2[
      /* info */ appDashBuilderDashLibLib.outPackagerMod.Packager, 
      /* platform */ appDashBuilderDashLibLib.outCoreMod.Platform, 
      appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_]
    ]) | scala.Null
  ] = js.undefined
  val prepackaged: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var projectDir: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var targets: js.UndefOr[
    stdLib.Map[
      appDashBuilderDashLibLib.outCoreMod.Platform, 
      stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
    ]
  ] = js.undefined
  var win: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PackagerOptions {
  @scala.inline
  def apply(
    config: appDashBuilderDashLibLib.outConfigurationMod.Configuration | java.lang.String = null,
    effectiveOptionComputed: /* options */ js.Any => js.Promise[scala.Boolean] = null,
    linux: js.Array[java.lang.String] = null,
    mac: js.Array[java.lang.String] = null,
    platformPackagerFactory: (/* info */ appDashBuilderDashLibLib.outPackagerMod.Packager, /* platform */ appDashBuilderDashLibLib.outCoreMod.Platform) => appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_] = null,
    prepackaged: java.lang.String = null,
    projectDir: java.lang.String = null,
    targets: stdLib.Map[
      appDashBuilderDashLibLib.outCoreMod.Platform, 
      stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
    ] = null,
    win: js.Array[java.lang.String] = null
  ): PackagerOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (effectiveOptionComputed != null) __obj.updateDynamic("effectiveOptionComputed")(js.Any.fromFunction1(effectiveOptionComputed))
    if (linux != null) __obj.updateDynamic("linux")(linux)
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (platformPackagerFactory != null) __obj.updateDynamic("platformPackagerFactory")(js.Any.fromFunction2(platformPackagerFactory))
    if (prepackaged != null) __obj.updateDynamic("prepackaged")(prepackaged)
    if (projectDir != null) __obj.updateDynamic("projectDir")(projectDir)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    if (win != null) __obj.updateDynamic("win")(win)
    __obj.asInstanceOf[PackagerOptions]
  }
}

