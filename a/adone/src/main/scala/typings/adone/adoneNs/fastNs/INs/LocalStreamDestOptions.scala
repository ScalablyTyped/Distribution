package typings.adone.adoneNs.fastNs.INs

import typings.adone.adoneNs.fsNs.INs.Flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStreamDestOptions extends js.Object {
  /**
    * Current working directory for files, dest is resolved using this cwd. Default: constuctor cwd or process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Flag that is used for writing
    */
  var flag: js.UndefOr[Flag] = js.undefined
  /**
    * Mode that is used for writing
    */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * Whether to inherit the source file's mode (access properties)
    */
  var originMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to inherit the source file's uid and gid
    */
  var originOwner: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to inherit the source file's time properties (atime, mtime)
    */
  var originTimes: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to push written files into the stream
    */
  var produceFiles: js.UndefOr[Boolean] = js.undefined
}

object LocalStreamDestOptions {
  @scala.inline
  def apply(
    cwd: String = null,
    flag: Flag = null,
    mode: Int | Double = null,
    originMode: js.UndefOr[Boolean] = js.undefined,
    originOwner: js.UndefOr[Boolean] = js.undefined,
    originTimes: js.UndefOr[Boolean] = js.undefined,
    produceFiles: js.UndefOr[Boolean] = js.undefined
  ): LocalStreamDestOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(originMode)) __obj.updateDynamic("originMode")(originMode)
    if (!js.isUndefined(originOwner)) __obj.updateDynamic("originOwner")(originOwner)
    if (!js.isUndefined(originTimes)) __obj.updateDynamic("originTimes")(originTimes)
    if (!js.isUndefined(produceFiles)) __obj.updateDynamic("produceFiles")(produceFiles)
    __obj.asInstanceOf[LocalStreamDestOptions]
  }
}

