package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatConditions extends js.Object {
  val Application: activexDashAccessLib.AccessNs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): FormatCondition = js.native
  /** @param Operator [Operator=0] */
  def Add(Type: AcFormatConditionType): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: AcFormatConditionOperator): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: java.lang.String): FormatCondition = js.native
  /** @param Operator [Operator=0] */
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: java.lang.String,
    Expression2: java.lang.String
  ): FormatCondition = js.native
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: java.lang.String,
    Expression2: scala.Boolean
  ): FormatCondition = js.native
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: java.lang.String,
    Expression2: scala.Double
  ): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: scala.Boolean): FormatCondition = js.native
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: scala.Boolean,
    Expression2: java.lang.String
  ): FormatCondition = js.native
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: scala.Boolean,
    Expression2: scala.Boolean
  ): FormatCondition = js.native
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: scala.Boolean,
    Expression2: scala.Double
  ): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: scala.Double): FormatCondition = js.native
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: scala.Double,
    Expression2: java.lang.String
  ): FormatCondition = js.native
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: scala.Double,
    Expression2: scala.Boolean
  ): FormatCondition = js.native
  def Add(
    Type: AcFormatConditionType,
    Operator: AcFormatConditionOperator,
    Expression1: scala.Double,
    Expression2: scala.Double
  ): FormatCondition = js.native
  /** @param Operator [Operator=0] */
  def Add(Type: AcFormatConditionType, Operator: js.UndefOr[scala.Nothing], Expression1: java.lang.String): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: js.UndefOr[scala.Nothing], Expression1: scala.Boolean): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: js.UndefOr[scala.Nothing], Expression1: scala.Double): FormatCondition = js.native
  def Delete(): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Item(Index: scala.Double): FormatCondition = js.native
}

