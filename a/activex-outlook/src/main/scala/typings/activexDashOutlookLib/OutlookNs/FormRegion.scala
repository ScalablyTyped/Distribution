package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.FormRegion")
@js.native
class FormRegion protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  var Detail: java.lang.String = js.native
  val DisplayName: java.lang.String = js.native
  var EnableAutoLayout: scala.Boolean = js.native
  val Form: js.Any = js.native
  val FormRegionMode: OlFormRegionMode = js.native
  val Inspector: Inspector = js.native
  val InternalName: java.lang.String = js.native
  val IsExpanded: scala.Boolean = js.native
  val Item: js.Any = js.native
  val Language: scala.Double = js.native
  var `Outlook.FormRegion_typekey`: FormRegion = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var SuppressControlReplacement: scala.Boolean = js.native
  var Visible: scala.Boolean = js.native
  def Reflow(): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def SetControlItemProperty(Control: js.Any, PropertyName: java.lang.String): scala.Unit = js.native
}

