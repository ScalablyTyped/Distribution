package typings.appBuilderLib.windowsCodeSignMod

import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsSignTaskConfiguration extends WindowsSignOptions {
  var hash: String
  var isNest: Boolean
  var resultOutputPath: js.UndefOr[String] = js.undefined
}

object WindowsSignTaskConfiguration {
  @scala.inline
  def apply(
    hash: String,
    isNest: Boolean,
    options: WindowsConfiguration,
    path: String,
    cscInfo: js.UndefOr[Null | FileCodeSigningInfo | CertificateFromStoreInfo] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    resultOutputPath: String = null,
    site: js.UndefOr[Null | String] = js.undefined
  ): WindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(cscInfo)) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resultOutputPath != null) __obj.updateDynamic("resultOutputPath")(resultOutputPath.asInstanceOf[js.Any])
    if (!js.isUndefined(site)) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSignTaskConfiguration]
  }
}

