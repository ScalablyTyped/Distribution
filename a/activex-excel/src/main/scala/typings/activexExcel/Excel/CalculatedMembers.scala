package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedMembers extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): CalculatedMember = js.native
  def apply(Index: Double): CalculatedMember = js.native
  def Add(Name: String, Formula: String): CalculatedMember = js.native
  def Add(Name: String, Formula: String, SolveOrder: Double): CalculatedMember = js.native
  def Add(Name: String, Formula: String, SolveOrder: Double, Type: XlCalculatedMemberType): CalculatedMember = js.native
  def Add(Name: String, Formula: String, SolveOrder: Double, Type: XlCalculatedMemberType, Dynamic: Boolean): CalculatedMember = js.native
  def Add(
    Name: String,
    Formula: String,
    SolveOrder: Double,
    Type: XlCalculatedMemberType,
    Dynamic: Boolean,
    DisplayFolder: String
  ): CalculatedMember = js.native
  def Add(
    Name: String,
    Formula: String,
    SolveOrder: Double,
    Type: XlCalculatedMemberType,
    Dynamic: Boolean,
    DisplayFolder: String,
    HierarchizeDistinct: Boolean
  ): CalculatedMember = js.native
  /** @version 2013 */
  def AddCalculatedMember(
    Name: String,
    Formula: String,
    SolveOrder: js.UndefOr[Double],
    Type: js.UndefOr[XlCalculatedMemberType],
    DisplayFolder: js.UndefOr[String],
    MeasureGroup: js.UndefOr[js.Any],
    ParentMember: js.UndefOr[js.Any],
    NumberFormat: js.UndefOr[js.Any]
  ): CalculatedMember = js.native
  def Item(Index: String): CalculatedMember = js.native
  def Item(Index: Double): CalculatedMember = js.native
  def _Add(Name: String, Formula: String): CalculatedMember = js.native
  def _Add(Name: String, Formula: String, SolveOrder: js.Any): CalculatedMember = js.native
  def _Add(Name: String, Formula: String, SolveOrder: js.Any, Type: js.Any): CalculatedMember = js.native
  def _Default(Index: js.Any): CalculatedMember = js.native
}

