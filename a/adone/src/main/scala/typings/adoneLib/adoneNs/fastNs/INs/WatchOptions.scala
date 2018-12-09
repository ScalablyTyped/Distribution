package typings
package adoneLib.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(adoneLib.adoneNs.fastNs.INs.LocalStreamConstructorOptions because Would inherit conflicting mutable fields List(cwd))*/

trait WatchOptions
  extends adoneLib.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions {
  /**
                   * Used for relative pathing of files. Typically where a glob starts.
                   */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Whether to match dotted files (hidden). Default: true
                   */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Whether to resume the stream on the next tick. Default: true
                   */
  var resume: js.UndefOr[scala.Boolean] = js.undefined
}

