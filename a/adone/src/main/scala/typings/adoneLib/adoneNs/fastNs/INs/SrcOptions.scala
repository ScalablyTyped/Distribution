package typings
package adoneLib.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SrcOptions extends LocalStreamConstructorOptions {
  /**
    * Used for relative pathing of files. Typically where a glob starts.
    */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to match dotted files (hidden). Default: true
    */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to lstat instead of stat when stating. Default: false
    */
  var links: js.UndefOr[scala.Boolean] = js.undefined
}

