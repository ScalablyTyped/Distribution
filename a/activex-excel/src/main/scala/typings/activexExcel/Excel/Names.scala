package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Names extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.UndefOr[scala.Nothing], IndexLocal: js.UndefOr[scala.Nothing], RefersTo: String): Name = js.native
  def apply(Index: js.UndefOr[scala.Nothing], IndexLocal: String): Name = js.native
  def apply(Index: String): Name = js.native
  def apply(Index: Double): Name = js.native
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
  def Item(Index: js.UndefOr[scala.Nothing], IndexLocal: js.UndefOr[scala.Nothing], RefersTo: String): Name = js.native
  def Item(Index: js.UndefOr[scala.Nothing], IndexLocal: String): Name = js.native
  def Item(Index: String): Name = js.native
  def Item(Index: Double): Name = js.native
  def _Default(): Name = js.native
  def _Default(Index: js.UndefOr[scala.Nothing], IndexLocal: js.UndefOr[scala.Nothing], RefersTo: js.Any): Name = js.native
  def _Default(Index: js.UndefOr[scala.Nothing], IndexLocal: js.Any): Name = js.native
  def _Default(Index: js.UndefOr[scala.Nothing], IndexLocal: js.Any, RefersTo: js.Any): Name = js.native
  def _Default(Index: js.Any): Name = js.native
  def _Default(Index: js.Any, IndexLocal: js.UndefOr[scala.Nothing], RefersTo: js.Any): Name = js.native
  def _Default(Index: js.Any, IndexLocal: js.Any): Name = js.native
  def _Default(Index: js.Any, IndexLocal: js.Any, RefersTo: js.Any): Name = js.native
}

