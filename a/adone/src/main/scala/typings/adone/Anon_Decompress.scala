package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decompress extends js.Object {
  /**
    * The option must be omitted when the entry is not compressed (see isCompressed()),
    * and either true (or omitted) or false when the entry is compressed.
    * Specifying decompress: false for a compressed entry causes the read stream
    * to provide the raw compressed file data without going through a zlib inflate transform
    */
  var decompress: js.UndefOr[Boolean] = js.undefined
  /**
    * The option must be null (or omitted) for non-encrypted entries,
    * and false for encrypted entries. Omitting the option for an encrypted entry will result in an err.
    */
  var decrypt: js.UndefOr[Boolean] = js.undefined
  /**
    * The end byte offset (exclusive) into this entry's file data
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * The start byte offset (inclusive) into this entry's file data
    */
  var start: js.UndefOr[Double] = js.undefined
}

object Anon_Decompress {
  @scala.inline
  def apply(
    decompress: js.UndefOr[Boolean] = js.undefined,
    decrypt: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    start: Int | Double = null
  ): Anon_Decompress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress)
    if (!js.isUndefined(decrypt)) __obj.updateDynamic("decrypt")(decrypt)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Decompress]
  }
}

