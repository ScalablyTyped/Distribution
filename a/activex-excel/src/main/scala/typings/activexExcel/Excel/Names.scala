package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Names extends StObject {
  
  def apply(Index: String): Name = js.native
  def apply(Index: Double): Name = js.native
  def apply(Index: Unit, IndexLocal: String): Name = js.native
  def apply(Index: Unit, IndexLocal: Unit, RefersTo: String): Name = js.native
  
  def Add(
    Name: js.UndefOr[String],
    RefersTo: js.UndefOr[String],
    Visible: js.UndefOr[Boolean],
    MacroType: js.UndefOr[`1` | `2` | `3`],
    ShortcutKey: js.UndefOr[String],
    Category: js.UndefOr[FunctionCategory | String],
    NameLocal: js.UndefOr[String],
    RefersToLocal: js.UndefOr[String],
    CategoryLocal: js.UndefOr[String],
    RefersToR1C1: js.UndefOr[String],
    RefersToR1C1Local: js.UndefOr[String]
  ): Name = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Name = js.native
  def Item(Index: Double): Name = js.native
  def Item(Index: Unit, IndexLocal: String): Name = js.native
  def Item(Index: Unit, IndexLocal: Unit, RefersTo: String): Name = js.native
  
  val Parent: Any = js.native
  
  def _Default(): Name = js.native
  def _Default(Index: Any): Name = js.native
  def _Default(Index: Any, IndexLocal: Any): Name = js.native
  def _Default(Index: Any, IndexLocal: Any, RefersTo: Any): Name = js.native
  def _Default(Index: Any, IndexLocal: Unit, RefersTo: Any): Name = js.native
  def _Default(Index: Unit, IndexLocal: Any): Name = js.native
  def _Default(Index: Unit, IndexLocal: Any, RefersTo: Any): Name = js.native
  def _Default(Index: Unit, IndexLocal: Unit, RefersTo: Any): Name = js.native
}
