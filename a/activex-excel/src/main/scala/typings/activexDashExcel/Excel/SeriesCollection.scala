package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesCollection extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Series = js.native
  def apply(Index: Double): Series = js.native
  /** @param Rowcol [Rowcol=-4105] */
  def Add(Source: Range): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Boolean, Replace: Boolean): Series = js.native
  def Extend(Source: Range): js.Any = js.native
  def Extend(Source: Range, Rowcol: XlRowCol): js.Any = js.native
  def Extend(Source: Range, Rowcol: XlRowCol, CategoryLabels: Boolean): js.Any = js.native
  def Item(Index: String): Series = js.native
  def Item(Index: Double): Series = js.native
  def NewSeries(): Series = js.native
  /** @param Rowcol [Rowcol=-4105] */
  def Paste(): js.Any = js.native
  def Paste(Rowcol: XlRowCol): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Boolean): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Boolean): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Boolean, Replace: Boolean): js.Any = js.native
  def Paste(
    Rowcol: XlRowCol,
    SeriesLabels: Boolean,
    CategoryLabels: Boolean,
    Replace: Boolean,
    NewSeries: Boolean
  ): js.Any = js.native
  def _Default(Index: js.Any): Series = js.native
}

