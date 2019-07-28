package typings.adone.adoneNs.compressorNs.brotliNs.INs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecompressOptions extends js.Object {
  /**
    * A custom dictionary
    */
  var dictionary: js.UndefOr[Buffer] = js.undefined
}

object DecompressOptions {
  @scala.inline
  def apply(dictionary: Buffer = null): DecompressOptions = {
    val __obj = js.Dynamic.literal()
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    __obj.asInstanceOf[DecompressOptions]
  }
}

