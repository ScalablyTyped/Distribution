package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows extends StObject {
  
  def Add(): Window = js.native
  def Add(Window: Any): Window = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Arrange(): Unit = js.native
  def Arrange(ArrangeStyle: Any): Unit = js.native
  
  def BreakSideBySide(): Boolean = js.native
  
  def CompareSideBySideWith(Document: Any): Boolean = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): Window = js.native
  
  val Parent: Any = js.native
  
  def ResetPositionsSideBySide(): Unit = js.native
  
  var SyncScrollingSideBySide: Boolean = js.native
  
  /* private */ @JSName("Word.Windows_typekey")
  var WordDotWindows_typekey: Windows = js.native
}
