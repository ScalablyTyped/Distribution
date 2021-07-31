package typings.activexExcel.Excel

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scenarios extends StObject {
  
  def apply(Index: String): Scenario = js.native
  def apply(Index: Double): Scenario = js.native
  
  def Add(Name: String, ChangingCells: Range): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: String): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: String, Locked: Boolean): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: Unit,
    Comment: String,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: String, Locked: Unit, Hidden: Boolean): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: Unit, Locked: Boolean): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: Unit, Locked: Boolean, Hidden: Boolean): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: Unit, Locked: Unit, Hidden: Boolean): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[js.Any]): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[js.Any], Comment: String): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[js.Any], Comment: String, Locked: Boolean): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[js.Any],
    Comment: String,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[js.Any],
    Comment: String,
    Locked: Unit,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[js.Any], Comment: Unit, Locked: Boolean): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[js.Any],
    Comment: Unit,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[js.Any],
    Comment: Unit,
    Locked: Unit,
    Hidden: Boolean
  ): Scenario = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  /** @param ReportType [ReportType=1] */
  def CreateSummary(): js.Any = js.native
  def CreateSummary(ReportType: Unit, ResultCells: Range): js.Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType): js.Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType, ResultCells: Range): js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Scenario = js.native
  def Item(Index: Double): Scenario = js.native
  
  def Merge(Source: String): js.Any = js.native
  def Merge(Source: Worksheet): js.Any = js.native
  
  val Parent: js.Any = js.native
}
