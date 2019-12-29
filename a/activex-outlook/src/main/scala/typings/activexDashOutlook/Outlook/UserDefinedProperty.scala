package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.UserDefinedProperty")
@js.native
class UserDefinedProperty protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val DisplayFormat: Double = js.native
  val Formula: String = js.native
  val Name: String = js.native
  @JSName("Outlook.UserDefinedProperty_typekey")
  var OutlookDotUserDefinedProperty_typekey: UserDefinedProperty = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val Type: OlUserPropertyType = js.native
  def Delete(): Unit = js.native
}

