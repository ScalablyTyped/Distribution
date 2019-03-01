package typings
package appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsarOptions
  extends appDashBuilderDashLibLib.outAsarIntegrityMod.AsarIntegrityOptions {
  var ordering: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to automatically unpack executables files.
    * @default true
    */
  var smartUnpack: js.UndefOr[scala.Boolean] = js.undefined
}

object AsarOptions {
  @scala.inline
  def apply(
    externalAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    ordering: java.lang.String = null,
    smartUnpack: js.UndefOr[scala.Boolean] = js.undefined
  ): AsarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(externalAllowed)) __obj.updateDynamic("externalAllowed")(externalAllowed)
    if (ordering != null) __obj.updateDynamic("ordering")(ordering)
    if (!js.isUndefined(smartUnpack)) __obj.updateDynamic("smartUnpack")(smartUnpack)
    __obj.asInstanceOf[AsarOptions]
  }
}

