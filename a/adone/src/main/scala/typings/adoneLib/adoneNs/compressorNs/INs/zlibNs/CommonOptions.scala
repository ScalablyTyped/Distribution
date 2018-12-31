package typings
package adoneLib.adoneNs.compressorNs.INs.zlibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var finishFlush: js.UndefOr[scala.Double] = js.undefined
  var flush: js.UndefOr[scala.Double] = js.undefined
  /**
    * The base two logarithm of the window size (the size of the history buffer).
    * It should be in the range 8..15.
    * Larger values of this parameter result in better compression at the expense of memory usage.
    */
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

