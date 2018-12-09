package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Decrypt extends js.Object {
  /**
                               * The option must be omitted when the entry is not compressed (see isCompressed()),
                               * and either true (or omitted) or false when the entry is compressed.
                               * Specifying decompress: false for a compressed entry causes the read stream
                               * to provide the raw compressed file data without going through a zlib inflate transform
                               */
  var decompress: js.UndefOr[scala.Boolean] = js.undefined
  /**
                               * The option must be null (or omitted) for non-encrypted entries,
                               * and false for encrypted entries. Omitting the option for an encrypted entry will result in an err.
                               */
  var decrypt: js.UndefOr[scala.Boolean] = js.undefined
  /**
                               * The end byte offset (exclusive) into this entry's file data
                               */
  var end: js.UndefOr[scala.Double] = js.undefined
  /**
                               * The start byte offset (inclusive) into this entry's file data
                               */
  var start: js.UndefOr[scala.Double] = js.undefined
}

