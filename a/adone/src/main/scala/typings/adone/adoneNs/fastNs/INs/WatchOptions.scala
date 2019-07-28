package typings.adone.adoneNs.fastNs.INs

import typings.adone.Anon_PollInterval
import typings.adone.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.adone.adoneNs.fastNs.INs.LocalStreamConstructorOptions because var conflicts: cwd. Inlined read, buffer, stream */ trait WatchOptions extends ConstructorOptions {
  /**
    * Used for relative pathing of files. Typically where a glob starts.
    */
  var base: js.UndefOr[String] = js.undefined
  /**
    * Read files as buffers. Default: true
    */
  var buffer: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to match dotted files (hidden). Default: true
    */
  var dot: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to read files. Default: true
    */
  var read: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to resume the stream on the next tick. Default: true
    */
  var resume: js.UndefOr[Boolean] = js.undefined
  /**
    * Read files as streams
    */
  var stream: js.UndefOr[Boolean] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[Boolean] = js.undefined,
    atomic: Boolean | Double = null,
    awaitWriteFinish: Boolean | Anon_PollInterval = null,
    base: String = null,
    binaryInterval: Int | Double = null,
    buffer: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    depth: Int | Double = null,
    disableGlobbing: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    followSymlinks: js.UndefOr[Boolean] = js.undefined,
    ignoreInitial: js.UndefOr[Boolean] = js.undefined,
    ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined,
    ignored: js.Array[String] = null,
    interval: Int | Double = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    read: js.UndefOr[Boolean] = js.undefined,
    resume: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined,
    useFsEvents: js.UndefOr[Boolean] = js.undefined,
    usePolling: js.UndefOr[Boolean] = js.undefined
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysStat)) __obj.updateDynamic("alwaysStat")(alwaysStat)
    if (atomic != null) __obj.updateDynamic("atomic")(atomic.asInstanceOf[js.Any])
    if (awaitWriteFinish != null) __obj.updateDynamic("awaitWriteFinish")(awaitWriteFinish.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base)
    if (binaryInterval != null) __obj.updateDynamic("binaryInterval")(binaryInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlobbing)) __obj.updateDynamic("disableGlobbing")(disableGlobbing)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks)
    if (!js.isUndefined(ignoreInitial)) __obj.updateDynamic("ignoreInitial")(ignoreInitial)
    if (!js.isUndefined(ignorePermissionErrors)) __obj.updateDynamic("ignorePermissionErrors")(ignorePermissionErrors)
    if (ignored != null) __obj.updateDynamic("ignored")(ignored)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(resume)) __obj.updateDynamic("resume")(resume)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (!js.isUndefined(useFsEvents)) __obj.updateDynamic("useFsEvents")(useFsEvents)
    if (!js.isUndefined(usePolling)) __obj.updateDynamic("usePolling")(usePolling)
    __obj.asInstanceOf[WatchOptions]
  }
}

