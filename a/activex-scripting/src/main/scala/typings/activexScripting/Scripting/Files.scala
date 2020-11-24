package typings.activexScripting.Scripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of files in a folder */
@js.native
trait Files extends js.Object {
  
  /** Get file */
  def apply(Key: String): File = js.native
  
  /** Number of folders */
  val Count: Double = js.native
  
  /** Get file object using the name and extension of the file */
  def Item(Key: String): File = js.native
}
