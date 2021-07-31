package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesCollection extends StObject {
  
  def apply(Index: String): Series = js.native
  def apply(Index: Double): Series = js.native
  
  /** @param Rowcol [Rowcol=-4105] */
  def Add(Source: Range): Series = js.native
  def Add(Source: Range, Rowcol: Unit, SeriesLabels: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Boolean, Replace: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Unit, Replace: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Boolean, Replace: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Unit, Replace: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Boolean, Replace: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Unit, Replace: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Boolean, Replace: Boolean): Series = js.native
  def Add(Source: Range, Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Unit, Replace: Boolean): Series = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Extend(Source: Range): js.Any = js.native
  def Extend(Source: Range, Rowcol: Unit, CategoryLabels: Boolean): js.Any = js.native
  def Extend(Source: Range, Rowcol: XlRowCol): js.Any = js.native
  def Extend(Source: Range, Rowcol: XlRowCol, CategoryLabels: Boolean): js.Any = js.native
  
  def Item(Index: String): Series = js.native
  def Item(Index: Double): Series = js.native
  
  def NewSeries(): Series = js.native
  
  val Parent: js.Any = js.native
  
  /** @param Rowcol [Rowcol=-4105] */
  def Paste(): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Boolean, Replace: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Boolean, Replace: Boolean, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Boolean, Replace: Unit, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Unit, Replace: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Unit, Replace: Boolean, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Boolean, CategoryLabels: Unit, Replace: Unit, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Boolean, Replace: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Boolean, Replace: Boolean, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Boolean, Replace: Unit, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Unit, Replace: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Unit, Replace: Boolean, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: Unit, SeriesLabels: Unit, CategoryLabels: Unit, Replace: Unit, NewSeries: Boolean): js.Any = js.native
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
  def Paste(
    Rowcol: XlRowCol,
    SeriesLabels: Boolean,
    CategoryLabels: Boolean,
    Replace: Unit,
    NewSeries: Boolean
  ): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Unit, Replace: Boolean): js.Any = js.native
  def Paste(
    Rowcol: XlRowCol,
    SeriesLabels: Boolean,
    CategoryLabels: Unit,
    Replace: Boolean,
    NewSeries: Boolean
  ): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Boolean, CategoryLabels: Unit, Replace: Unit, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Boolean): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Boolean, Replace: Boolean): js.Any = js.native
  def Paste(
    Rowcol: XlRowCol,
    SeriesLabels: Unit,
    CategoryLabels: Boolean,
    Replace: Boolean,
    NewSeries: Boolean
  ): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Boolean, Replace: Unit, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Unit, Replace: Boolean): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Unit, Replace: Boolean, NewSeries: Boolean): js.Any = js.native
  def Paste(Rowcol: XlRowCol, SeriesLabels: Unit, CategoryLabels: Unit, Replace: Unit, NewSeries: Boolean): js.Any = js.native
  
  def _Default(Index: js.Any): Series = js.native
}
