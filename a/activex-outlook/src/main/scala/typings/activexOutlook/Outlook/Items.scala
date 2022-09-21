package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends StObject {
  
  def Add(): Any = js.native
  def Add(Type: Any): Any = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Find(Filter: String): Any = js.native
  
  def FindNext(): Any = js.native
  
  def GetFirst(): Any = js.native
  
  def GetLast(): Any = js.native
  
  def GetNext(): Any = js.native
  
  def GetPrevious(): Any = js.native
  
  var IncludeRecurrences: Boolean = js.native
  
  def Item(Index: Any): Any = js.native
  
  /* private */ @JSName("Outlook.Items_typekey")
  var OutlookDotItems_typekey: Items = js.native
  
  val Parent: Any = js.native
  
  val RawTable: Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  def ResetColumns(): Unit = js.native
  
  def Restrict(Filter: String): Items = js.native
  
  val Session: NameSpace = js.native
  
  def SetColumns(Columns: String): Unit = js.native
  
  def Sort(Property: String): Unit = js.native
  def Sort(Property: String, Descending: Any): Unit = js.native
}
