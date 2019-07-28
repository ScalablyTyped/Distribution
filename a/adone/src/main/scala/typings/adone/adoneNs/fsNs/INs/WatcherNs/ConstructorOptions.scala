package typings.adone.adoneNs.fsNs.INs.WatcherNs

import typings.adone.Anon_PollInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  /**
    * Always passes fs.Stat file with `add`, `addDir` events
    */
  var alwaysStat: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically filters out artifacts that occur when using editors that use "atomic writes"
    * instead of writing directly to the source file. If a file is re-added within 100 ms of being deleted,
    * wather emits a change event rather than unlink then add
    */
  var atomic: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * If truthy, defines settings to control how long a file must not change after add/change events and only then emit the event
    */
  var awaitWriteFinish: js.UndefOr[Boolean | Anon_PollInterval] = js.undefined
  /**
    * Interval of file system polling for binary files (used when usePolling = true)
    */
  var binaryInterval: js.UndefOr[Double] = js.undefined
  /**
    * The base directory from which watch paths are to be derived
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * If set, limits how many levels of subdirectories will be traversed
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * If set to true then the strings passed to .watch() and .add() are treated as literal path names,
    * even if they look like globs
    */
  var disableGlobbing: js.UndefOr[Boolean] = js.undefined
  /**
    * When false, only the symlinks themselves will be watched for changes
    * instead of following the link references and bubbling events through the link's path
    */
  var followSymlinks: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false then add/addDir events are also emitted for matching paths
    * while instantiating the watching as watcher discovers these file paths
    */
  var ignoreInitial: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to watch files that don't have read permissions if possible
    */
  var ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines files/paths to be ignored
    */
  var ignored: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Interval of file system polling (used when usePolling = true)
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether the process should continue to run as long as files are being watched
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use the fsevents watching interface if available (true on mac by default)
    */
  var useFsEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use fs.watchFile (backed by polling), or fs.watch.
    */
  var usePolling: js.UndefOr[Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[Boolean] = js.undefined,
    atomic: Boolean | Double = null,
    awaitWriteFinish: Boolean | Anon_PollInterval = null,
    binaryInterval: Int | Double = null,
    cwd: String = null,
    depth: Int | Double = null,
    disableGlobbing: js.UndefOr[Boolean] = js.undefined,
    followSymlinks: js.UndefOr[Boolean] = js.undefined,
    ignoreInitial: js.UndefOr[Boolean] = js.undefined,
    ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined,
    ignored: js.Array[String] = null,
    interval: Int | Double = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    useFsEvents: js.UndefOr[Boolean] = js.undefined,
    usePolling: js.UndefOr[Boolean] = js.undefined
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysStat)) __obj.updateDynamic("alwaysStat")(alwaysStat)
    if (atomic != null) __obj.updateDynamic("atomic")(atomic.asInstanceOf[js.Any])
    if (awaitWriteFinish != null) __obj.updateDynamic("awaitWriteFinish")(awaitWriteFinish.asInstanceOf[js.Any])
    if (binaryInterval != null) __obj.updateDynamic("binaryInterval")(binaryInterval.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlobbing)) __obj.updateDynamic("disableGlobbing")(disableGlobbing)
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks)
    if (!js.isUndefined(ignoreInitial)) __obj.updateDynamic("ignoreInitial")(ignoreInitial)
    if (!js.isUndefined(ignorePermissionErrors)) __obj.updateDynamic("ignorePermissionErrors")(ignorePermissionErrors)
    if (ignored != null) __obj.updateDynamic("ignored")(ignored)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (!js.isUndefined(useFsEvents)) __obj.updateDynamic("useFsEvents")(useFsEvents)
    if (!js.isUndefined(usePolling)) __obj.updateDynamic("usePolling")(usePolling)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

