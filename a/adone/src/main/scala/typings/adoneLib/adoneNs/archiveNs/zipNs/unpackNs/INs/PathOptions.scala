package typings
package adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends CommonOptions {
  /**
    * Autocloses the file after the last entry reading or when an error occurs
    *
    * Default is true
    */
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    lazyEntries: js.UndefOr[scala.Boolean] = js.undefined,
    validateEntrySizes: js.UndefOr[scala.Boolean] = js.undefined
  ): PathOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (!js.isUndefined(lazyEntries)) __obj.updateDynamic("lazyEntries")(lazyEntries)
    if (!js.isUndefined(validateEntrySizes)) __obj.updateDynamic("validateEntrySizes")(validateEntrySizes)
    __obj.asInstanceOf[PathOptions]
  }
}

