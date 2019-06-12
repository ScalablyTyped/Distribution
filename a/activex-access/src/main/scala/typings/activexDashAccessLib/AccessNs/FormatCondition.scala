package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.FormatCondition")
@js.native
class FormatCondition protected () extends js.Object {
  var `Access.FormatCondition_typekey`: FormatCondition = js.native
  var BackColor: scala.Double = js.native
  var Enabled: scala.Boolean = js.native
  val Expression1: java.lang.String = js.native
  val Expression2: java.lang.String = js.native
  var FontBold: scala.Boolean = js.native
  var FontItalic: scala.Boolean = js.native
  var FontUnderline: scala.Boolean = js.native
  var ForeColor: scala.Double = js.native
  var LongestBarLimit: AcFormatBarLimits = js.native
  var LongestBarValue: java.lang.String = js.native
  val Operator: AcFormatConditionOperator = js.native
  var ShortestBarLimit: AcFormatBarLimits = js.native
  var ShortestBarValue: java.lang.String = js.native
  var ShowBarOnly: scala.Boolean = js.native
  val Type: AcFormatConditionType = js.native
  def Delete(): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  /** @param Operator [Operator=0] */
  def Modify(Type: AcFormatConditionType): scala.Unit = js.native
  def Modify(Type: AcFormatConditionType, Operator: AcFormatConditionOperator): scala.Unit = js.native
  def Modify(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: java.lang.String): scala.Unit = js.native
  def Modify(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: scala.Boolean): scala.Unit = js.native
  def Modify(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: scala.Double): scala.Unit = js.native
  /** @param Operator [Operator=0] */
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: java.lang.String,
    Expression2: java.lang.String
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: java.lang.String,
    Expression2: scala.Boolean
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: java.lang.String,
    Expression2: scala.Double
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: scala.Boolean,
    Expression2: java.lang.String
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: scala.Boolean,
    Expression2: scala.Boolean
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: scala.Boolean,
    Expression2: scala.Double
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: scala.Double,
    Expression2: java.lang.String
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: scala.Double,
    Expression2: scala.Boolean
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_0(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`0`,
    Expression1: scala.Double,
    Expression2: scala.Double
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: java.lang.String,
    Expression2: java.lang.String
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: java.lang.String,
    Expression2: scala.Boolean
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: java.lang.String,
    Expression2: scala.Double
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: scala.Boolean,
    Expression2: java.lang.String
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: scala.Boolean,
    Expression2: scala.Boolean
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: scala.Boolean,
    Expression2: scala.Double
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: scala.Double,
    Expression2: java.lang.String
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: scala.Double,
    Expression2: scala.Boolean
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: AcFormatConditionType,
    Operator: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Expression1: scala.Double,
    Expression2: scala.Double
  ): scala.Unit = js.native
  /** @param Operator [Operator=0] */
  @JSName("Modify")
  def Modify_1(
    Type: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Operator: js.UndefOr[scala.Nothing],
    Expression1: java.lang.String
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Operator: js.UndefOr[scala.Nothing],
    Expression1: scala.Boolean
  ): scala.Unit = js.native
  @JSName("Modify")
  def Modify_1(
    Type: activexDashAccessLib.activexDashAccessLibNumbers.`1`,
    Operator: js.UndefOr[scala.Nothing],
    Expression1: scala.Double
  ): scala.Unit = js.native
}

