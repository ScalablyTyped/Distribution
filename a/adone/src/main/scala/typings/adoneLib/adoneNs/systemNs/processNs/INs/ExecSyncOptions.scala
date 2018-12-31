package typings
package adoneLib.adoneNs.systemNs.processNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecSyncOptions extends ExecCommonOptions {
  /**
    * Write some input to the `stdin` of your binary.
    * Streams are not allowed when using the synchronous methods.
    */
  var input: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
}

