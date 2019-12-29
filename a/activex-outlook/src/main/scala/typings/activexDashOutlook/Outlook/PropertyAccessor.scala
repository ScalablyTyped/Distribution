package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.PropertyAccessor")
@js.native
class PropertyAccessor protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  @JSName("Outlook.PropertyAccessor_typekey")
  var OutlookDotPropertyAccessor_typekey: PropertyAccessor = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def BinaryToString(Value: js.Any): String = js.native
  def DeleteProperties(SchemaNames: js.Any): js.Any = js.native
  def DeleteProperty(SchemaName: String): Unit = js.native
  def GetProperties(SchemaNames: js.Any): js.Any = js.native
  def GetProperty(SchemaName: String): js.Any = js.native
  def LocalTimeToUTC(Value: VarDate): VarDate = js.native
  def SetProperties(SchemaNames: js.Any, Values: js.Any): js.Any = js.native
  def SetProperty(SchemaName: String, Value: js.Any): Unit = js.native
  def StringToBinary(Value: String): js.Any = js.native
  def UTCToLocalTime(Value: VarDate): VarDate = js.native
}

