package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesCollection extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Series = js.native
  def apply(Index: scala.Double): Series = js.native
  /** @param Rowcol [Rowcol=-4105] */
  def Add(Source: Range): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: scala.Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: scala.Boolean, CategoryLabels: scala.Boolean): Series = js.native
  def Add(
    Source: Range,
    Rowcol: XlRowCol,
    SeriesLabels: scala.Boolean,
    CategoryLabels: scala.Boolean,
    Replace: scala.Boolean
  ): Series = js.native
  def Extend(Source: Range): js.Any = js.native
  def Extend(Source: Range, Rowcol: XlRowCol): js.Any = js.native
  def Extend(Source: Range, Rowcol: XlRowCol, CategoryLabels: scala.Boolean): js.Any = js.native
  def Item(Index: java.lang.String): Series = js.native
  def Item(Index: scala.Double): Series = js.native
  def NewSeries(): Series = js.native
  /** @param Rowcol [Rowcol=-4105] */
  def Paste(): js.Any = js.native
  def Paste(Rowcol: XlRowCol): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: scala.Boolean): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: scala.Boolean, CategoryLabels: scala.Boolean): js.Any = js.native
  def Paste(
    Rowcol: XlRowCol,
    SeriesLabels: scala.Boolean,
    CategoryLabels: scala.Boolean,
    Replace: scala.Boolean
  ): js.Any = js.native
  def Paste(
    Rowcol: XlRowCol,
    SeriesLabels: scala.Boolean,
    CategoryLabels: scala.Boolean,
    Replace: scala.Boolean,
    NewSeries: scala.Boolean
  ): js.Any = js.native
  def _Default(Index: js.Any): Series = js.native
}

