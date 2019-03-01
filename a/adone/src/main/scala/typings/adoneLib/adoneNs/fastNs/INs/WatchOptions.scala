package typings
package adoneLib.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- adoneLib.adoneNs.fastNs.INs.LocalStreamConstructorOptions because var conflicts: cwd. Inlined read, buffer, stream */ trait WatchOptions
  extends adoneLib.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions {
  /**
    * Used for relative pathing of files. Typically where a glob starts.
    */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Read files as buffers. Default: true
    */
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to match dotted files (hidden). Default: true
    */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to read files. Default: true
    */
  var read: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to resume the stream on the next tick. Default: true
    */
  var resume: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Read files as streams
    */
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[scala.Boolean] = js.undefined,
    atomic: scala.Boolean | scala.Double = null,
    awaitWriteFinish: scala.Boolean | adoneLib.Anon_PollInterval = null,
    base: java.lang.String = null,
    binaryInterval: scala.Int | scala.Double = null,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    depth: scala.Int | scala.Double = null,
    disableGlobbing: js.UndefOr[scala.Boolean] = js.undefined,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    followSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreInitial: js.UndefOr[scala.Boolean] = js.undefined,
    ignorePermissionErrors: js.UndefOr[scala.Boolean] = js.undefined,
    ignored: js.Array[java.lang.String] = null,
    interval: scala.Int | scala.Double = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.UndefOr[scala.Boolean] = js.undefined,
    resume: js.UndefOr[scala.Boolean] = js.undefined,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    useFsEvents: js.UndefOr[scala.Boolean] = js.undefined,
    usePolling: js.UndefOr[scala.Boolean] = js.undefined
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

