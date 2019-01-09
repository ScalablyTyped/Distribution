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

