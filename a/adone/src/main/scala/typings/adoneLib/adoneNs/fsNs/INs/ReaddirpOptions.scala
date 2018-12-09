package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReaddirpOptions extends js.Object {
  /**
                   * maximum recursion depth
                   *
                   * Infinity by default
                   */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
                   * whether to emit directories
                   *
                   * true by default
                   */
  var directories: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * filter for directories
                   */
  var directoryFilter: js.UndefOr[ReaddirpFilter | js.Array[ReaddirpFilter]] = js.undefined
  /**
                   * filter for files
                   */
  var fileFilter: js.UndefOr[ReaddirpFilter | js.Array[ReaddirpFilter]] = js.undefined
  /**
                   * whether to emit files
                   *
                   * true by default
                   */
  var files: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * whether to use lstat for stating
                   *
                   * false by default
                   */
  var lstat: js.UndefOr[scala.Boolean] = js.undefined
}

