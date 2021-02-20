package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicerCaches extends StObject {
  
  def apply(Index: String): SlicerCache = js.native
  def apply(Index: Double): SlicerCache = js.native
  
  def Add(Source: String, SourceField: js.Any): SlicerCache = js.native
  def Add(Source: String, SourceField: js.Any, Name: js.Any): SlicerCache = js.native
  def Add(Source: PivotTable, SourceField: js.Any): SlicerCache = js.native
  def Add(Source: PivotTable, SourceField: js.Any, Name: js.Any): SlicerCache = js.native
  def Add(Source: WorkbookConnection, SourceField: js.Any): SlicerCache = js.native
  def Add(Source: WorkbookConnection, SourceField: js.Any, Name: js.Any): SlicerCache = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): SlicerCache = js.native
  def Item(Index: Double): SlicerCache = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): SlicerCache = js.native
}
