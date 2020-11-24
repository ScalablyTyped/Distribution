package typings.activexScripting.Scripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of subfolders in a folder */
@js.native
trait Folders extends js.Object {
  
  /** Get folder in collection using the folder's name */
  def apply(Key: String): Folder = js.native
  
  /** Create a new folder */
  def Add(Name: String): Folder = js.native
  
  /** Number of folders */
  val Count: Double = js.native
  
  /** Get folder in collection using the folder's name */
  def Item(Key: String): Folder = js.native
}
