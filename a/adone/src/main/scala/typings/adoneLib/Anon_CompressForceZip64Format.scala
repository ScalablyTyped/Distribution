package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompressForceZip64Format extends js.Object {
  /**
    * If true, the file data will be deflated (compression method 8).
    *
    * If false, the file data will be stored (compression method 0)
    */
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use ZIP64 format in this entry's Data Descriptor and Central Directory Record
    * regardless of if it's required or not (this may be useful for testing.).
    * Otherwise, packer will use ZIP64 format where necessary.
    */
  var forceZip64Format: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines file mode, 0o100664 by default
    */
  var mode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines modified date, now by default
    */
  var mtime: js.UndefOr[scala.Double] = js.undefined
  /**
    * If given, it will be checked against the actual number of bytes in the readStream,
    * and an error will be emitted if there is a mismatch
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CompressForceZip64Format {
  @scala.inline
  def apply(
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    forceZip64Format: js.UndefOr[scala.Boolean] = js.undefined,
    mode: scala.Int | scala.Double = null,
    mtime: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
  ): Anon_CompressForceZip64Format = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(forceZip64Format)) __obj.updateDynamic("forceZip64Format")(forceZip64Format)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompressForceZip64Format]
  }
}

