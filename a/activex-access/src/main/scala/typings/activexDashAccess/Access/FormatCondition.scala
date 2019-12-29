package typings.activexDashAccess.Access

import typings.activexDashAccess.activexDashAccessNumbers.`0`
import typings.activexDashAccess.activexDashAccessNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.FormatCondition")
@js.native
class FormatCondition protected () extends js.Object {
  @JSName("Access.FormatCondition_typekey")
  var AccessDotFormatCondition_typekey: FormatCondition = js.native
  var BackColor: Double = js.native
  var Enabled: Boolean = js.native
  val Expression1: String = js.native
  val Expression2: String = js.native
  var FontBold: Boolean = js.native
  var FontItalic: Boolean = js.native
  var FontUnderline: Boolean = js.native
  var ForeColor: Double = js.native
  var LongestBarLimit: AcFormatBarLimits = js.native
  var LongestBarValue: String = js.native
  val Operator: AcFormatConditionOperator = js.native
  var ShortestBarLimit: AcFormatBarLimits = js.native
  var ShortestBarValue: String = js.native
  var ShowBarOnly: Boolean = js.native
  val Type: AcFormatConditionType = js.native
  def Delete(): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  /** @param Operator [Operator=0] */
  def Modify(Type: AcFormatConditionType): Unit = js.native
  def Modify(Type: AcFormatConditionType, Operator: AcFormatConditionOperator): Unit = js.native
  def Modify(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: String): Unit = js.native
  def Modify(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: Boolean): Unit = js.native
  def Modify(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: Double): Unit = js.native
  /** @param Operator [Operator=0] */
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: String, Expression2: String): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: String, Expression2: Boolean): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: String, Expression2: Double): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Boolean, Expression2: String): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Boolean, Expression2: Boolean): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Boolean, Expression2: Double): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Double, Expression2: String): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Double, Expression2: Boolean): Unit = js.native
  @JSName("Modify")
  def Modify_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Double, Expression2: Double): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: String, Expression2: String): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: String, Expression2: Boolean): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: String, Expression2: Double): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Boolean, Expression2: String): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Boolean, Expression2: Boolean): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Boolean, Expression2: Double): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Double, Expression2: String): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Double, Expression2: Boolean): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Double, Expression2: Double): Unit = js.native
  /** @param Operator [Operator=0] */
  @JSName("Modify")
  def Modify_1(Type: `1`, Operator: js.UndefOr[scala.Nothing], Expression1: String): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: `1`, Operator: js.UndefOr[scala.Nothing], Expression1: Boolean): Unit = js.native
  @JSName("Modify")
  def Modify_1(Type: `1`, Operator: js.UndefOr[scala.Nothing], Expression1: Double): Unit = js.native
}

