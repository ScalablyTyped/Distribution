package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Collection of files in a folder */
@js.native
trait Files extends js.Object {
  /** Number of folders */
  val Count: scala.Double = js.native
  /** Get file */
  def apply(Key: java.lang.String): File = js.native
  /** Get file object using the name and extension of the file */
  def Item(Key: java.lang.String): File = js.native
}

