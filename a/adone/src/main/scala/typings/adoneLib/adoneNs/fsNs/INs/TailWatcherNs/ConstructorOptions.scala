package typings
package adoneLib.adoneNs.fsNs.INs.TailWatcherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  /**
    * Use the given encoding for reading
    */
  var encoding: js.UndefOr[adoneLib.adoneNs.fsNs.INs.Encoding | scala.Null] = js.undefined
  /**
    * Follow the file when it renames
    */
  var follow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Start from the beginning of the file
    */
  var fromBeginning: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Options for fs.watch
    */
  var fsWatchOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * Start watching from the given position
    */
  var pos: js.UndefOr[scala.Double] = js.undefined
  /**
    * Uses this separator to split lines
    */
  var separator: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  /**
    * use fs.watchFile
    */
  var useWatchFile: js.UndefOr[scala.Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    encoding: adoneLib.adoneNs.fsNs.INs.Encoding = null,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    fromBeginning: js.UndefOr[scala.Boolean] = js.undefined,
    fsWatchOptions: js.Object = null,
    pos: scala.Int | scala.Double = null,
    separator: java.lang.String | stdLib.RegExp = null,
    useWatchFile: js.UndefOr[scala.Boolean] = js.undefined
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (!js.isUndefined(fromBeginning)) __obj.updateDynamic("fromBeginning")(fromBeginning)
    if (fsWatchOptions != null) __obj.updateDynamic("fsWatchOptions")(fsWatchOptions)
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(useWatchFile)) __obj.updateDynamic("useWatchFile")(useWatchFile)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

