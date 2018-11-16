package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedMembers extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): CalculatedMember = js.native
  def apply(Index: scala.Double): CalculatedMember = js.native
  def Add(Name: java.lang.String, Formula: java.lang.String): CalculatedMember = js.native
  def Add(Name: java.lang.String, Formula: java.lang.String, SolveOrder: scala.Double): CalculatedMember = js.native
  def Add(
    Name: java.lang.String,
    Formula: java.lang.String,
    SolveOrder: scala.Double,
    Type: XlCalculatedMemberType
  ): CalculatedMember = js.native
  def Add(
    Name: java.lang.String,
    Formula: java.lang.String,
    SolveOrder: scala.Double,
    Type: XlCalculatedMemberType,
    Dynamic: scala.Boolean
  ): CalculatedMember = js.native
  def Add(
    Name: java.lang.String,
    Formula: java.lang.String,
    SolveOrder: scala.Double,
    Type: XlCalculatedMemberType,
    Dynamic: scala.Boolean,
    DisplayFolder: java.lang.String
  ): CalculatedMember = js.native
  def Add(
    Name: java.lang.String,
    Formula: java.lang.String,
    SolveOrder: scala.Double,
    Type: XlCalculatedMemberType,
    Dynamic: scala.Boolean,
    DisplayFolder: java.lang.String,
    HierarchizeDistinct: scala.Boolean
  ): CalculatedMember = js.native
  /** @version 2013 */
  def AddCalculatedMember(
    Name: java.lang.String,
    Formula: java.lang.String,
    SolveOrder: js.UndefOr[scala.Double],
    Type: js.UndefOr[XlCalculatedMemberType],
    DisplayFolder: js.UndefOr[java.lang.String],
    MeasureGroup: js.UndefOr[js.Any],
    ParentMember: js.UndefOr[js.Any],
    NumberFormat: js.UndefOr[js.Any]
  ): CalculatedMember = js.native
  def Item(Index: java.lang.String): CalculatedMember = js.native
  def Item(Index: scala.Double): CalculatedMember = js.native
  def _Add(Name: java.lang.String, Formula: java.lang.String): CalculatedMember = js.native
  def _Add(Name: java.lang.String, Formula: java.lang.String, SolveOrder: js.Any): CalculatedMember = js.native
  def _Add(Name: java.lang.String, Formula: java.lang.String, SolveOrder: js.Any, Type: js.Any): CalculatedMember = js.native
  def _Default(Index: js.Any): CalculatedMember = js.native
}

