package typings.activexAccess.Access

import typings.activexAccess.activexAccessNumbers.`0`
import typings.activexAccess.activexAccessNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatConditions extends js.Object {
  
  def apply(Index: Double): FormatCondition = js.native
  
  /** @param Operator [Operator=0] */
  def Add(Type: AcFormatConditionType): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: js.UndefOr[scala.Nothing], Expression1: String): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: js.UndefOr[scala.Nothing], Expression1: Boolean): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: js.UndefOr[scala.Nothing], Expression1: Double): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: AcFormatConditionOperator): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: String): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: Boolean): FormatCondition = js.native
  def Add(Type: AcFormatConditionType, Operator: AcFormatConditionOperator, Expression1: Double): FormatCondition = js.native
  /** @param Operator [Operator=0] */
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: String, Expression2: String): FormatCondition = js.native
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: String, Expression2: Boolean): FormatCondition = js.native
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: String, Expression2: Double): FormatCondition = js.native
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Boolean, Expression2: String): FormatCondition = js.native
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Boolean, Expression2: Boolean): FormatCondition = js.native
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Boolean, Expression2: Double): FormatCondition = js.native
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Double, Expression2: String): FormatCondition = js.native
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Double, Expression2: Boolean): FormatCondition = js.native
  @JSName("Add")
  def Add_0(Type: AcFormatConditionType, Operator: `0`, Expression1: Double, Expression2: Double): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: String, Expression2: String): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: String, Expression2: Boolean): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: String, Expression2: Double): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Boolean, Expression2: String): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Boolean, Expression2: Boolean): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Boolean, Expression2: Double): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Double, Expression2: String): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Double, Expression2: Boolean): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: AcFormatConditionType, Operator: `1`, Expression1: Double, Expression2: Double): FormatCondition = js.native
  /** @param Operator [Operator=0] */
  @JSName("Add")
  def Add_1(Type: `1`, Operator: js.UndefOr[scala.Nothing], Expression1: String): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: `1`, Operator: js.UndefOr[scala.Nothing], Expression1: Boolean): FormatCondition = js.native
  @JSName("Add")
  def Add_1(Type: `1`, Operator: js.UndefOr[scala.Nothing], Expression1: Double): FormatCondition = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def Delete(): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: Double): FormatCondition = js.native
  
  val Parent: js.Any = js.native
}
