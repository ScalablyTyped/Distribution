package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Names extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(
    Index: js.UndefOr[scala.Nothing],
    IndexLocal: js.UndefOr[scala.Nothing],
    RefersTo: java.lang.String
  ): Name = js.native
  def apply(Index: js.UndefOr[scala.Nothing], IndexLocal: java.lang.String): Name = js.native
  def apply(Index: java.lang.String): Name = js.native
  def apply(Index: scala.Double): Name = js.native
  def Add(
    Name: js.UndefOr[java.lang.String],
    RefersTo: js.UndefOr[java.lang.String],
    Visible: js.UndefOr[scala.Boolean],
    MacroType: js.UndefOr[
      activexDashExcelLib.activexDashExcelLibNumbers.`1` | activexDashExcelLib.activexDashExcelLibNumbers.`2` | activexDashExcelLib.activexDashExcelLibNumbers.`3`
    ],
    ShortcutKey: js.UndefOr[java.lang.String],
    Category: js.UndefOr[FunctionCategory | java.lang.String],
    NameLocal: js.UndefOr[java.lang.String],
    RefersToLocal: js.UndefOr[java.lang.String],
    CategoryLocal: js.UndefOr[java.lang.String],
    RefersToR1C1: js.UndefOr[java.lang.String],
    RefersToR1C1Local: js.UndefOr[java.lang.String]
  ): Name = js.native
  def Item(
    Index: js.UndefOr[scala.Nothing],
    IndexLocal: js.UndefOr[scala.Nothing],
    RefersTo: java.lang.String
  ): Name = js.native
  def Item(Index: js.UndefOr[scala.Nothing], IndexLocal: java.lang.String): Name = js.native
  def Item(Index: java.lang.String): Name = js.native
  def Item(Index: scala.Double): Name = js.native
  def _Default(): Name = js.native
  def _Default(Index: js.Any): Name = js.native
  def _Default(Index: js.Any, IndexLocal: js.Any): Name = js.native
  def _Default(Index: js.Any, IndexLocal: js.Any, RefersTo: js.Any): Name = js.native
}

