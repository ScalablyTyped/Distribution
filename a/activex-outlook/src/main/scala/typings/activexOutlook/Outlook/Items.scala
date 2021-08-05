package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends StObject {
  
  def Add(): js.Any = js.native
  def Add(Type: js.Any): js.Any = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Find(Filter: String): js.Any = js.native
  
  def FindNext(): js.Any = js.native
  
  def GetFirst(): js.Any = js.native
  
  def GetLast(): js.Any = js.native
  
  def GetNext(): js.Any = js.native
  
  def GetPrevious(): js.Any = js.native
  
  var IncludeRecurrences: Boolean = js.native
  
  def Item(Index: js.Any): js.Any = js.native
  
  /* private */ @JSName("Outlook.Items_typekey")
  var OutlookDotItems_typekey: Items = js.native
  
  val Parent: js.Any = js.native
  
  val RawTable: js.Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  def ResetColumns(): Unit = js.native
  
  def Restrict(Filter: String): Items = js.native
  
  val Session: NameSpace = js.native
  
  def SetColumns(Columns: String): Unit = js.native
  
  def Sort(Property: String): Unit = js.native
  def Sort(Property: String, Descending: js.Any): Unit = js.native
}
