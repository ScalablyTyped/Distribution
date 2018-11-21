package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.PropertyAccessor")
@js.native
class PropertyAccessor protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  var `Outlook.PropertyAccessor_typekey`: PropertyAccessor = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def BinaryToString(Value: js.Any): java.lang.String = js.native
  def DeleteProperties(SchemaNames: js.Any): js.Any = js.native
  def DeleteProperty(SchemaName: java.lang.String): scala.Unit = js.native
  def GetProperties(SchemaNames: js.Any): js.Any = js.native
  def GetProperty(SchemaName: java.lang.String): js.Any = js.native
  def LocalTimeToUTC(Value: activexDashInteropLib.VarDate): activexDashInteropLib.VarDate = js.native
  def SetProperties(SchemaNames: js.Any, Values: js.Any): js.Any = js.native
  def SetProperty(SchemaName: java.lang.String, Value: js.Any): scala.Unit = js.native
  def StringToBinary(Value: java.lang.String): js.Any = js.native
  def UTCToLocalTime(Value: activexDashInteropLib.VarDate): activexDashInteropLib.VarDate = js.native
}

