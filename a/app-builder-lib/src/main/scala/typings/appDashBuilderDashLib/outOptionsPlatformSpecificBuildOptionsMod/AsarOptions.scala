package typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod

import typings.appDashBuilderDashLib.outAsarIntegrityMod.AsarIntegrityOptions
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
    ordering: String = null,
    smartUnpack: js.UndefOr[Boolean] = js.undefined
  ): AsarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(externalAllowed)) __obj.updateDynamic("externalAllowed")(externalAllowed.asInstanceOf[js.Any])
    if (ordering != null) __obj.updateDynamic("ordering")(ordering.asInstanceOf[js.Any])
    if (!js.isUndefined(smartUnpack)) __obj.updateDynamic("smartUnpack")(smartUnpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsarOptions]
  }
}

