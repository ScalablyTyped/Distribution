package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ConditionValue")
@js.native
class ConditionValue protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.ConditionValue_typekey`: ConditionValue = js.native
  val Parent: js.Any = js.native
  val Type: XlConditionValueTypes = js.native
  var Value: scala.Double | java.lang.String = js.native
  def Modify(newtype: XlConditionValueTypes): scala.Unit = js.native
  def Modify(newtype: XlConditionValueTypes, newvalue: java.lang.String): scala.Unit = js.native
  def Modify(newtype: XlConditionValueTypes, newvalue: js.Any): scala.Unit = js.native
  def Modify(newtype: XlConditionValueTypes, newvalue: scala.Double): scala.Unit = js.native
}

