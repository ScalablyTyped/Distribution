package typings.activexDashExcel.ExcelNs

import typings.activexDashExcel.activexDashExcelNumbers.`0`
import typings.activexDashExcel.activexDashExcelNumbers.`1`
import typings.activexDashExcel.activexDashExcelNumbers.`2`
import typings.activexDashExcel.activexDashExcelNumbers.`3`
import typings.activexDashExcel.activexDashExcelNumbers.`4`
import typings.activexDashExcel.activexDashExcelNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ConditionValue")
@js.native
class ConditionValue protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.ConditionValue_typekey`: ConditionValue = js.native
  val Parent: js.Any = js.native
  val Type: XlConditionValueTypes = js.native
  var Value: Double | String = js.native
  def Modify(newtype: XlConditionValueTypes): Unit = js.native
  def Modify(newtype: XlConditionValueTypes, newvalue: js.Any): Unit = js.native
  @JSName("Modify")
  def Modify_0(newtype: `0`, newvalue: Double): Unit = js.native
  @JSName("Modify")
  def Modify_1(newtype: `1`): Unit = js.native
  @JSName("Modify")
  def Modify_2(newtype: `2`): Unit = js.native
  @JSName("Modify")
  def Modify_3(newtype: `3`, newvalue: Double): Unit = js.native
  @JSName("Modify")
  def Modify_4(newtype: `4`, newvalue: String): Unit = js.native
  @JSName("Modify")
  def Modify_5(newtype: `5`, newvalue: Double): Unit = js.native
}

