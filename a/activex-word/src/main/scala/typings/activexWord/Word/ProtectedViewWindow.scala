package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedViewWindow extends js.Object {
  
  def Activate(): Unit = js.native
  
  val Active: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Caption: String = js.native
  
  def Close(): Unit = js.native
  
  val Creator: Double = js.native
  
  val Document: typings.activexWord.Word.Document = js.native
  
  def Edit(): typings.activexWord.Word.Document = js.native
  def Edit(
    PasswordTemplate: js.UndefOr[scala.Nothing],
    WritePasswordDocument: js.UndefOr[scala.Nothing],
    WritePasswordTemplate: js.Any
  ): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: js.UndefOr[scala.Nothing], WritePasswordDocument: js.Any): typings.activexWord.Word.Document = js.native
  def Edit(
    PasswordTemplate: js.UndefOr[scala.Nothing],
    WritePasswordDocument: js.Any,
    WritePasswordTemplate: js.Any
  ): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: js.Any): typings.activexWord.Word.Document = js.native
  def Edit(
    PasswordTemplate: js.Any,
    WritePasswordDocument: js.UndefOr[scala.Nothing],
    WritePasswordTemplate: js.Any
  ): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: js.Any, WritePasswordDocument: js.Any): typings.activexWord.Word.Document = js.native
  def Edit(PasswordTemplate: js.Any, WritePasswordDocument: js.Any, WritePasswordTemplate: js.Any): typings.activexWord.Word.Document = js.native
  
  var Height: Double = js.native
  
  val Index: Double = js.native
  
  var Left: Double = js.native
  
  val Parent: js.Any = js.native
  
  val SourceName: String = js.native
  
  val SourcePath: String = js.native
  
  def ToggleRibbon(): Unit = js.native
  
  var Top: Double = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  var WindowState: WdWindowState = js.native
  
  @JSName("Word.ProtectedViewWindow_typekey")
  var WordDotProtectedViewWindow_typekey: ProtectedViewWindow = js.native
}
