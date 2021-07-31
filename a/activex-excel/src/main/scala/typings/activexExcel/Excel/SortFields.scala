package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortFields extends StObject {
  
  def apply(Index: js.Any): SortField = js.native
  
  def Add(Key: Range): SortField = js.native
  def Add(Key: Range, SortOn: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: js.Any, CustomOrder: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: js.Any, CustomOrder: js.Any, DataOption: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: js.Any, CustomOrder: Unit, DataOption: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: Unit, CustomOrder: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: Unit, CustomOrder: js.Any, DataOption: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: Unit, CustomOrder: Unit, DataOption: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: js.Any, CustomOrder: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: js.Any, CustomOrder: js.Any, DataOption: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: js.Any, CustomOrder: Unit, DataOption: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Unit, CustomOrder: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Unit, CustomOrder: js.Any, DataOption: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Unit, CustomOrder: Unit, DataOption: js.Any): SortField = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: js.Any): SortField = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): SortField = js.native
}
