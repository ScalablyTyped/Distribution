package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkLength extends js.Object {
  /**
    * The number of bytes to read at once
    *
    * By default 4096
    */
  var chunkLength: js.UndefOr[Double] = js.undefined
  /**
    * Position from which to start reading (from the end)
    *
    * By default stats.size of the file
    */
  var pos: js.UndefOr[Double] = js.undefined
  /**
    * Line separator
    *
    * By default "\r\n" for windows and "\n" for others
    */
  var separator: js.UndefOr[String] = js.undefined
}

object Anon_ChunkLength {
  @scala.inline
  def apply(chunkLength: Int | Double = null, pos: Int | Double = null, separator: String = null): Anon_ChunkLength = {
    val __obj = js.Dynamic.literal()
    if (chunkLength != null) __obj.updateDynamic("chunkLength")(chunkLength.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Anon_ChunkLength]
  }
}

