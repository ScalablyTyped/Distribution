package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceZip64Format extends js.Object {
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

