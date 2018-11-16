package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicerCaches extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): SlicerCache = js.native
  def apply(Index: scala.Double): SlicerCache = js.native
  def Add(Source: PivotTable, SourceField: js.Any): SlicerCache = js.native
  def Add(Source: PivotTable, SourceField: js.Any, Name: js.Any): SlicerCache = js.native
  def Add(Source: WorkbookConnection, SourceField: js.Any): SlicerCache = js.native
  def Add(Source: WorkbookConnection, SourceField: js.Any, Name: js.Any): SlicerCache = js.native
  def Add(Source: java.lang.String, SourceField: js.Any): SlicerCache = js.native
  def Add(Source: java.lang.String, SourceField: js.Any, Name: js.Any): SlicerCache = js.native
  def Item(Index: java.lang.String): SlicerCache = js.native
  def Item(Index: scala.Double): SlicerCache = js.native
  def _Default(Index: js.Any): SlicerCache = js.native
}

