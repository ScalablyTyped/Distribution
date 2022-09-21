package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedViewWindows extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): ProtectedViewWindow = js.native
  
  def Open(FileName: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Any, PasswordDocument: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Any, PasswordDocument: Any, Visible: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Any, PasswordDocument: Any, Visible: Any, OpenAndRepair: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Any, PasswordDocument: Any, Visible: Unit, OpenAndRepair: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Any, PasswordDocument: Unit, Visible: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Any, PasswordDocument: Unit, Visible: Any, OpenAndRepair: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Any, PasswordDocument: Unit, Visible: Unit, OpenAndRepair: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Unit, PasswordDocument: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Unit, PasswordDocument: Any, Visible: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Unit, PasswordDocument: Any, Visible: Any, OpenAndRepair: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Unit, PasswordDocument: Any, Visible: Unit, OpenAndRepair: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Unit, PasswordDocument: Unit, Visible: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Unit, PasswordDocument: Unit, Visible: Any, OpenAndRepair: Any): ProtectedViewWindow = js.native
  def Open(FileName: Any, AddToRecentFiles: Unit, PasswordDocument: Unit, Visible: Unit, OpenAndRepair: Any): ProtectedViewWindow = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.ProtectedViewWindows_typekey")
  var WordDotProtectedViewWindows_typekey: ProtectedViewWindows = js.native
}
