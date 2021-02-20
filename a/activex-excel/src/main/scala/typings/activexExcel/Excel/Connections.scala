package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connections extends StObject {
  
  def apply(Index: Double): WorkbookConnection = js.native
  
  def Add(Name: String, Description: String, ConnectionString: String, CommandText: String): WorkbookConnection = js.native
  def Add(Name: String, Description: String, ConnectionString: String, CommandText: String, lCmdtype: js.Any): WorkbookConnection = js.native
  
  def AddFromFile(Filename: String): WorkbookConnection = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): WorkbookConnection = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): WorkbookConnection = js.native
}
