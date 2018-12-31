package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptionsFD extends ReadStreamOptions {
  /**
    * Whether to close the file descriptor
    */
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use the specified file descriptor for reading instead of `path`
    */
  var fd: scala.Double
}

