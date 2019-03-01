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

object ReaddirpOptions {
  @scala.inline
  def apply(
    depth: scala.Int | scala.Double = null,
    directories: js.UndefOr[scala.Boolean] = js.undefined,
    directoryFilter: ReaddirpFilter | js.Array[ReaddirpFilter] = null,
    fileFilter: ReaddirpFilter | js.Array[ReaddirpFilter] = null,
    files: js.UndefOr[scala.Boolean] = js.undefined,
    lstat: js.UndefOr[scala.Boolean] = js.undefined
  ): ReaddirpOptions = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(directories)) __obj.updateDynamic("directories")(directories)
    if (directoryFilter != null) __obj.updateDynamic("directoryFilter")(directoryFilter.asInstanceOf[js.Any])
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(fileFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files)
    if (!js.isUndefined(lstat)) __obj.updateDynamic("lstat")(lstat)
    __obj.asInstanceOf[ReaddirpOptions]
  }
}

