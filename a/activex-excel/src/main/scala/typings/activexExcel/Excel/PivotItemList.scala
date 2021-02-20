package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotItemList extends StObject {
  
  def apply(Field: String): PivotItem = js.native
  def apply(Field: Double): PivotItem = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): PivotItem = js.native
  def Item(Index: Double): PivotItem = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Field: js.Any): PivotItem = js.native
}
