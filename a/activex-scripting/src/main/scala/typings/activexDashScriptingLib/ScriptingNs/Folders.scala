package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Collection of subfolders in a folder */
@js.native
trait Folders extends js.Object {
  /** Number of folders */
  val Count: scala.Double = js.native
  /** Get folder in collection using the folder's name */
  def apply(Key: java.lang.String): Folder = js.native
  /** Create a new folder */
  def Add(Name: java.lang.String): Folder = js.native
  /** Get folder in collection using the folder's name */
  def Item(Key: java.lang.String): Folder = js.native
}

