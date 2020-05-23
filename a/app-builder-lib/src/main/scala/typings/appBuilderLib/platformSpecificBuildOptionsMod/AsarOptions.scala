package typings.appBuilderLib.platformSpecificBuildOptionsMod

import typings.appBuilderLib.integrityMod.AsarIntegrityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsarOptions extends AsarIntegrityOptions {
  var ordering: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to automatically unpack executables files.
    * @default true
    */
  var smartUnpack: js.UndefOr[Boolean] = js.undefined
}

object AsarOptions {
  @scala.inline
  def apply(
    externalAllowed: js.UndefOr[Boolean] = js.undefined,
    ordering: js.UndefOr[Null | String] = js.undefined,
    smartUnpack: js.UndefOr[Boolean] = js.undefined
  ): AsarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(externalAllowed)) __obj.updateDynamic("externalAllowed")(externalAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ordering)) __obj.updateDynamic("ordering")(ordering.asInstanceOf[js.Any])
    if (!js.isUndefined(smartUnpack)) __obj.updateDynamic("smartUnpack")(smartUnpack.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsarOptions]
  }
}

