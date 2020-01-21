package typings.appBuilderLib.yarnMod

import typings.appBuilderLib.packageDependenciesMod.NodeModuleDirInfo
import typings.lazyVal.mod.Lazy
import typings.node.NodeJS.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebuildOptions extends js.Object {
  var additionalArgs: js.UndefOr[js.Array[String] | Null] = js.undefined
  var arch: js.UndefOr[String] = js.undefined
  var buildFromSource: js.UndefOr[Boolean] = js.undefined
  var frameworkInfo: DesktopFrameworkInfo
  var platform: js.UndefOr[Platform] = js.undefined
  var productionDeps: js.UndefOr[Lazy[js.Array[NodeModuleDirInfo]]] = js.undefined
}

object RebuildOptions {
  @scala.inline
  def apply(
    frameworkInfo: DesktopFrameworkInfo,
    additionalArgs: js.Array[String] = null,
    arch: String = null,
    buildFromSource: js.UndefOr[Boolean] = js.undefined,
    platform: Platform = null,
    productionDeps: Lazy[js.Array[NodeModuleDirInfo]] = null
  ): RebuildOptions = {
    val __obj = js.Dynamic.literal(frameworkInfo = frameworkInfo.asInstanceOf[js.Any])
    if (additionalArgs != null) __obj.updateDynamic("additionalArgs")(additionalArgs.asInstanceOf[js.Any])
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (!js.isUndefined(buildFromSource)) __obj.updateDynamic("buildFromSource")(buildFromSource.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (productionDeps != null) __obj.updateDynamic("productionDeps")(productionDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebuildOptions]
  }
}

