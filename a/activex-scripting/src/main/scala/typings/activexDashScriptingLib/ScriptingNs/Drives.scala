package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Collection of drives associated with drive letters */
@js.native
trait Drives extends js.Object {
  /** Number of drives */
  val Count: scala.Double = js.native
  /** Get drive using the drive letter (`C`) or path (`C:\\`) */
  def apply(Key: java.lang.String): Drive = js.native
  /** Get drive using the drive letter (`C`) or path (`C:\\`) */
  def Item(Key: java.lang.String): Drive = js.native
}

