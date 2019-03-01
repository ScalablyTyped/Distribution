package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkLength extends js.Object {
  /**
    * The number of bytes to read at once
    *
    * By default 4096
    */
  var chunkLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Position from which to start reading (from the end)
    *
    * By default stats.size of the file
    */
  var pos: js.UndefOr[scala.Double] = js.undefined
  /**
    * Line separator
    *
    * By default "\r\n" for windows and "\n" for others
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ChunkLength {
  @scala.inline
  def apply(
    chunkLength: scala.Int | scala.Double = null,
    pos: scala.Int | scala.Double = null,
    separator: java.lang.String = null
  ): Anon_ChunkLength = {
    val __obj = js.Dynamic.literal()
    if (chunkLength != null) __obj.updateDynamic("chunkLength")(chunkLength.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Anon_ChunkLength]
  }
}

