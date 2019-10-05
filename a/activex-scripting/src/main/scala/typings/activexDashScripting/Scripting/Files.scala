package typings.activexDashScripting.Scripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Collection of files in a folder */
@js.native
trait Files extends js.Object {
  /** Number of folders */
  val Count: Double = js.native
  /** Get file */
  def apply(Key: String): File = js.native
  /** Get file object using the name and extension of the file */
  def Item(Key: String): File = js.native
}

