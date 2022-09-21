package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotFilters extends StObject {
  
  def apply(Index: Double): PivotFilter = js.native
  
  def Add(
    Type: XlPivotFilterType,
    DataField: js.UndefOr[Any],
    Value1: js.UndefOr[Any],
    Value2: js.UndefOr[Any],
    Order: js.UndefOr[Any],
    Name: js.UndefOr[Any],
    Description: js.UndefOr[Any],
    MemberPropertyField: js.UndefOr[Any]
  ): PivotFilter = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): PivotFilter = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): PivotFilter = js.native
}
