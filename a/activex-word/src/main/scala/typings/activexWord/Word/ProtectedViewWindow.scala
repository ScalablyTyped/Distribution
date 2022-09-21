package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedViewWindow extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Caption: String = js.native
  
  def Close(): Unit = js.native
  
  val Creator: Double = js.native
  
  val Document: typings.activexWord.Word.Document = js.native
  
  def Edit(): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: Any): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: Any, WritePasswordDocument: Any): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: Any, WritePasswordDocument: Any, WritePasswordTemplate: Any): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: Any, WritePasswordDocument: Unit, WritePasswordTemplate: Any): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: Unit, WritePasswordDocument: Any): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: Unit, WritePasswordDocument: Any, WritePasswordTemplate: Any): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: Unit, WritePasswordDocument: Unit, WritePasswordTemplate: Any): typings.activexWord.Word.Document = js.native
  
  var Height: Double = js.native
  
  val Index: Double = js.native
  
  var Left: Double = js.native
  
  val Parent: Any = js.native
  
  val SourceName: String = js.native
  
  val SourcePath: String = js.native
  
  def ToggleRibbon(): Unit = js.native
  
  var Top: Double = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  var WindowState: WdWindowState = js.native
  
  /* private */ @JSName("Word.ProtectedViewWindow_typekey")
  var WordDotProtectedViewWindow_typekey: ProtectedViewWindow = js.native
}
