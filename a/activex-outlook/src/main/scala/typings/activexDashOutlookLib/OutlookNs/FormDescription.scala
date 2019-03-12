package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.FormDescription")
@js.native
class FormDescription protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  var Category: java.lang.String = js.native
  var CategorySub: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Comment: java.lang.String = js.native
  var ContactName: java.lang.String = js.native
  var DisplayName: java.lang.String = js.native
  var Hidden: scala.Boolean = js.native
  var Icon: java.lang.String = js.native
  var Locked: scala.Boolean = js.native
  val MessageClass: java.lang.String = js.native
  var MiniIcon: java.lang.String = js.native
  var Name: java.lang.String = js.native
  var Number: java.lang.String = js.native
  var OneOff: scala.Boolean = js.native
  var `Outlook.FormDescription_typekey`: FormDescription = js.native
  val Parent: js.Any = js.native
  var Password: java.lang.String = js.native
  val ScriptText: java.lang.String = js.native
  val Session: NameSpace = js.native
  var Template: java.lang.String = js.native
  var UseWordMail: scala.Boolean = js.native
  var Version: java.lang.String = js.native
  def PublishForm(Registry: OlFormRegistry): scala.Unit = js.native
  def PublishForm(Registry: OlFormRegistry, Folder: js.Any): scala.Unit = js.native
}

