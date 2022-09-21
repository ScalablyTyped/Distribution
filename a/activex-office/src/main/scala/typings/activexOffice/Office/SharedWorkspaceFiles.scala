package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceFiles extends StObject {
  
  def apply(Index: Double): SharedWorkspaceFile = js.native
  
  def Add(FileName: String): SharedWorkspaceFile = js.native
  def Add(FileName: String, ParentFolder: Unit, OverwriteIfFileAlreadyExists: Boolean): SharedWorkspaceFile = js.native
  def Add(FileName: String, ParentFolder: Unit, OverwriteIfFileAlreadyExists: Boolean, KeepInSync: Boolean): SharedWorkspaceFile = js.native
  def Add(FileName: String, ParentFolder: Unit, OverwriteIfFileAlreadyExists: Unit, KeepInSync: Boolean): SharedWorkspaceFile = js.native
  def Add(FileName: String, ParentFolder: SharedWorkspaceFolder): SharedWorkspaceFile = js.native
  def Add(FileName: String, ParentFolder: SharedWorkspaceFolder, OverwriteIfFileAlreadyExists: Boolean): SharedWorkspaceFile = js.native
  def Add(
    FileName: String,
    ParentFolder: SharedWorkspaceFolder,
    OverwriteIfFileAlreadyExists: Boolean,
    KeepInSync: Boolean
  ): SharedWorkspaceFile = js.native
  def Add(
    FileName: String,
    ParentFolder: SharedWorkspaceFolder,
    OverwriteIfFileAlreadyExists: Unit,
    KeepInSync: Boolean
  ): SharedWorkspaceFile = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): SharedWorkspaceFile = js.native
  
  val ItemCountExceeded: Boolean = js.native
  
  val Parent: Any = js.native
}
