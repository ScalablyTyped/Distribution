package typings.activexDashOutlook.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ItemProperty")
@js.native
class ItemProperty protected () extends js.Object {
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  var Formula: String = js.native
  val IsUserProperty: Boolean = js.native
  val Name: String = js.native
  var `Outlook.ItemProperty_typekey`: ItemProperty = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val Type: OlUserPropertyType = js.native
  var ValidationFormula: String = js.native
  var ValidationText: String = js.native
  var Value: js.Any = js.native
  def Delete(): Unit = js.native
}

