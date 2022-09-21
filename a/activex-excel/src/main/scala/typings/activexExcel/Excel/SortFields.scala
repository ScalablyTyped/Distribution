package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortFields extends StObject {
  
  def apply(Index: Any): SortField = js.native
  
  def Add(Key: Range): SortField = js.native
  def Add(Key: Range, SortOn: Any): SortField = js.native
  def Add(Key: Range, SortOn: Any, Order: Any): SortField = js.native
  def Add(Key: Range, SortOn: Any, Order: Any, CustomOrder: Any): SortField = js.native
  def Add(Key: Range, SortOn: Any, Order: Any, CustomOrder: Any, DataOption: Any): SortField = js.native
  def Add(Key: Range, SortOn: Any, Order: Any, CustomOrder: Unit, DataOption: Any): SortField = js.native
  def Add(Key: Range, SortOn: Any, Order: Unit, CustomOrder: Any): SortField = js.native
  def Add(Key: Range, SortOn: Any, Order: Unit, CustomOrder: Any, DataOption: Any): SortField = js.native
  def Add(Key: Range, SortOn: Any, Order: Unit, CustomOrder: Unit, DataOption: Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Any, CustomOrder: Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Any, CustomOrder: Any, DataOption: Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Any, CustomOrder: Unit, DataOption: Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Unit, CustomOrder: Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Unit, CustomOrder: Any, DataOption: Any): SortField = js.native
  def Add(Key: Range, SortOn: Unit, Order: Unit, CustomOrder: Unit, DataOption: Any): SortField = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Any): SortField = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): SortField = js.native
}
