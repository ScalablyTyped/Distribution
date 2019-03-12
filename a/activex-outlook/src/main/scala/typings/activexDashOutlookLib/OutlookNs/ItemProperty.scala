package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ItemProperty")
@js.native
class ItemProperty protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  var Formula: java.lang.String = js.native
  val IsUserProperty: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  var `Outlook.ItemProperty_typekey`: ItemProperty = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val Type: OlUserPropertyType = js.native
  var ValidationFormula: java.lang.String = js.native
  var ValidationText: java.lang.String = js.native
  var Value: js.Any = js.native
  def Delete(): scala.Unit = js.native
}

