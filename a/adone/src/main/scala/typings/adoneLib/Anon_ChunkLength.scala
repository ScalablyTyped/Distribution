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

