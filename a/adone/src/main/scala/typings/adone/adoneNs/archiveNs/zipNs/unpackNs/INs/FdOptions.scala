package typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FdOptions extends CommonOptions {
  /**
    * Autocloses the file after the last entry reading or when an error occurs
    *
    * Default is false
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
}

object FdOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    lazyEntries: js.UndefOr[Boolean] = js.undefined,
    validateEntrySizes: js.UndefOr[Boolean] = js.undefined
  ): FdOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (!js.isUndefined(lazyEntries)) __obj.updateDynamic("lazyEntries")(lazyEntries)
    if (!js.isUndefined(validateEntrySizes)) __obj.updateDynamic("validateEntrySizes")(validateEntrySizes)
    __obj.asInstanceOf[FdOptions]
  }
}

