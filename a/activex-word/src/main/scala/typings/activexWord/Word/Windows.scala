package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows extends StObject {
  
  def Add(): Window = js.native
  def Add(Window: js.Any): Window = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Arrange(): Unit = js.native
  def Arrange(ArrangeStyle: js.Any): Unit = js.native
  
  def BreakSideBySide(): Boolean = js.native
  
  def CompareSideBySideWith(Document: js.Any): Boolean = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): Window = js.native
  
  val Parent: js.Any = js.native
  
  def ResetPositionsSideBySide(): Unit = js.native
  
  var SyncScrollingSideBySide: Boolean = js.native
  
  @JSName("Word.Windows_typekey")
  var WordDotWindows_typekey: Windows = js.native
}
