package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scenarios extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Scenario = js.native
  def apply(Index: scala.Double): Scenario = js.native
  def Add(Name: java.lang.String, ChangingCells: Range): Scenario = js.native
  def Add(Name: java.lang.String, ChangingCells: Range, Values: activexDashInteropLib.SafeArray[_]): Scenario = js.native
  def Add(
    Name: java.lang.String,
    ChangingCells: Range,
    Values: activexDashInteropLib.SafeArray[_],
    Comment: java.lang.String
  ): Scenario = js.native
  def Add(
    Name: java.lang.String,
    ChangingCells: Range,
    Values: activexDashInteropLib.SafeArray[_],
    Comment: java.lang.String,
    Locked: scala.Boolean
  ): Scenario = js.native
  def Add(
    Name: java.lang.String,
    ChangingCells: Range,
    Values: activexDashInteropLib.SafeArray[_],
    Comment: java.lang.String,
    Locked: scala.Boolean,
    Hidden: scala.Boolean
  ): Scenario = js.native
  /** @param ReportType [ReportType=1] */
  def CreateSummary(): js.Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType): js.Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType, ResultCells: Range): js.Any = js.native
  def Item(Index: java.lang.String): Scenario = js.native
  def Item(Index: scala.Double): Scenario = js.native
  def Merge(Source: Worksheet): js.Any = js.native
  def Merge(Source: java.lang.String): js.Any = js.native
}

