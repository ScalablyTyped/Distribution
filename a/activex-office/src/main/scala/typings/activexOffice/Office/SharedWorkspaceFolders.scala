package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceFolders extends js.Object {
  
  def apply(Index: Double): SharedWorkspaceFolder = js.native
  
  def Add(FolderName: String): SharedWorkspaceFolder = js.native
  def Add(FolderName: String, ParentFolder: SharedWorkspaceFolder): SharedWorkspaceFolder = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): SharedWorkspaceFolder = js.native
  
  val ItemCountExceeded: Boolean = js.native
  
  val Parent: js.Any = js.native
}
