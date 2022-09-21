package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Columns: typings.activexOutlook.Outlook.Columns = js.native
  
  val EndOfTable: Boolean = js.native
  
  def FindNextRow(): Row = js.native
  
  def FindRow(Filter: String): Row = js.native
  
  def GetArray(MaxRows: Double): Any = js.native
  
  def GetNextRow(): Row = js.native
  
  def GetRowCount(): Double = js.native
  
  def MoveToStart(): Unit = js.native
  
  /* private */ @JSName("Outlook.Table_typekey")
  var OutlookDotTable_typekey: Table = js.native
  
  val Parent: Any = js.native
  
  def Restrict(Filter: String): Table = js.native
  
  val Session: NameSpace = js.native
  
  def Sort(SortProperty: String): Unit = js.native
  def Sort(SortProperty: String, Descending: Any): Unit = js.native
}
