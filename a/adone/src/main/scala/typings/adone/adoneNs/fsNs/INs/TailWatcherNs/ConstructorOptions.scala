package typings.adone.adoneNs.fsNs.INs.TailWatcherNs

import typings.adone.adoneNs.fsNs.INs.Encoding
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  /**
    * Use the given encoding for reading
    */
  var encoding: js.UndefOr[Encoding | Null] = js.undefined
  /**
    * Follow the file when it renames
    */
  var follow: js.UndefOr[Boolean] = js.undefined
  /**
    * Start from the beginning of the file
    */
  var fromBeginning: js.UndefOr[Boolean] = js.undefined
  /**
    * Options for fs.watch
    */
  var fsWatchOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * Start watching from the given position
    */
  var pos: js.UndefOr[Double] = js.undefined
  /**
    * Uses this separator to split lines
    */
  var separator: js.UndefOr[String | RegExp] = js.undefined
  /**
    * use fs.watchFile
    */
  var useWatchFile: js.UndefOr[Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    encoding: Encoding = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    fromBeginning: js.UndefOr[Boolean] = js.undefined,
    fsWatchOptions: js.Object = null,
    pos: Int | Double = null,
    separator: String | RegExp = null,
    useWatchFile: js.UndefOr[Boolean] = js.undefined
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

